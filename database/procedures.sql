-- procedure 1
DROP PROCEDURE IF EXISTS insertDriver;
DELIMITER $$
CREATE PROCEDURE insertDriver(id_num CHAR(10), fname VARCHAR(20), lname VARCHAR(20), salary FLOAT(7,2), license CHAR(1), route VARCHAR(6), experience TINYINT)
BEGIN
	DECLARE min_drivers_branch INT;
	
	SELECT br_code
    INTO min_drivers_branch
    FROM branch
		LEFT JOIN worker ON branch.br_code = worker.wrk_br_code
        LEFT JOIN driver ON worker.wrk_AT = driver.drv_AT
	GROUP BY branch.br_code
    ORDER BY COUNT(driver.drv_AT) ASC
    LIMIT 1;
    
    INSERT INTO worker VALUES(id_num, fname, lname, salary, min_drivers_branch);
    INSERT INTO driver VALUES(id_num, license, route, experience);
    
END $$
DELIMITER ;


-- procedure 2
DROP PROCEDURE IF EXISTS tripsInfo;
DELIMITER $$
CREATE PROCEDURE tripsInfo(branch_code INT, date1 DATETIME, date2 DATETIME)
BEGIN

    SELECT tr_id AS trip_id, tr_cost AS trip_cost, tr_maxseats AS max_seats, COUNT(res_tr_id) AS reservations, tr_maxseats-COUNT(res_tr_id) AS free_seats, 
		   tr_departure AS departure_date, tr_return AS return_date, drv.wrk_name AS driver_name, drv.wrk_lname AS driver_last_name,
           gui.wrk_name AS guide_name, gui.wrk_lname AS guide_last_name
    FROM branch
		LEFT JOIN trip ON branch.br_code = trip.tr_br_code AND branch.br_code = branch_code
        LEFT JOIN reservation ON trip.tr_id = reservation.res_tr_id
        LEFT JOIN driver ON trip.tr_drv_AT = driver.drv_AT
        LEFT JOIN guide ON trip.tr_gui_AT = guide.gui_AT
        LEFT JOIN worker drv ON driver.drv_AT = drv.wrk_AT
        LEFT JOIN worker gui ON guide.gui_AT = gui.wrk_AT
    WHERE tr_departure BETWEEN date1 AND date2
    GROUP BY tr_id
    ORDER BY departure_date ASC;
	
END $$
DELIMITER ;


-- procedure 3
DROP PROCEDURE IF EXISTS removeAdmin;
DELIMITER $$
CREATE PROCEDURE removeAdmin (fname varchar(20), lname varchar(20))
BEGIN
	DECLARE admin_type VARCHAR(20);
	DECLARE admin_AT char(10) ;
 
	SELECT adm_type, adm_AT
	INTO admin_type, admin_AT
	FROM `admin` 
	JOIN `worker` on worker.wrk_AT = admin.adm_AT 
	WHERE wrk_name = fname AND wrk_lname = lname ;
 
	IF admin_type = 'ADMINISTRATIVE' THEN
		SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'The employee is the administrative of the branch and he cannot be removed';
	END IF;
    
	DELETE FROM `worker`
	WHERE wrk_AT = admin_AT;
   
	END $$
DELIMITER ;


-- procedure 4
DROP PROCEDURE IF EXISTS clientsWhoPaidInAdvanceBetween;
DELIMITER $$
CREATE PROCEDURE clientsWhoPaidInAdvanceBetween(price1 FLOAT(7,2), price2 FLOAT(7,2))
BEGIN
	
    SELECT res_name AS client_first_name, res_lname AS client_last_name
    FROM reservation_offers USE INDEX(reservation_offers_btree_byPayment)
	WHERE payment_in_advance BETWEEN price1 AND price2;
	
END $$
DELIMITER ;


-- procedure 5
DROP PROCEDURE IF EXISTS reservationOffersWithLastName;
DELIMITER $$
CREATE PROCEDURE reservationOffersWithLastName(last_name VARCHAR(20))
BEGIN
	
    SELECT res_name AS first_name, res_lname AS last_name, res_offer_id AS offer_id, NULLIF(COUNT(*), 1) AS clients_with_this_name
    FROM reservation_offers USE INDEX(reservation_offers_btree_byName)
    WHERE res_lname = last_name
    GROUP BY res_name, res_offer_id
    ORDER BY res_offer_id ASC, res_name ASC;
	
END $$
DELIMITER ;
