-- trigger 1
DROP TRIGGER IF EXISTS tripInsert;
DELIMITER $$
CREATE TRIGGER tripInsert AFTER INSERT ON trip FOR EACH ROW
BEGIN
	INSERT log VALUES('trip', 'INSERTION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS tripUpdate;
DELIMITER $$
CREATE TRIGGER tripUpdate AFTER UPDATE ON trip FOR EACH ROW
BEGIN
	INSERT log VALUES('trip', 'MODIFICATION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS tripDelete;
DELIMITER $$
CREATE TRIGGER tripDelete AFTER DELETE ON trip FOR EACH ROW
BEGIN
	INSERT log VALUES('trip', 'DELETION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS reservationInsert;
DELIMITER $$
CREATE TRIGGER reservationInsert AFTER INSERT ON reservation FOR EACH ROW
BEGIN
	INSERT log VALUES('reservation', 'INSERTION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS reservationUpdate;
DELIMITER $$
CREATE TRIGGER reservationUpdate AFTER UPDATE ON reservation FOR EACH ROW
BEGIN
	INSERT log VALUES('reservation', 'MODIFICATION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS reservationDelete;
DELIMITER $$
CREATE TRIGGER reservationDelete AFTER DELETE ON reservation FOR EACH ROW
BEGIN
	INSERT log VALUES('reservation', 'DELETION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS eventInsert;
DELIMITER $$
CREATE TRIGGER eventInsert AFTER INSERT ON `event` FOR EACH ROW
BEGIN
	INSERT log VALUES('event', 'INSERTION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS eventUpdate;
DELIMITER $$
CREATE TRIGGER eventUpdate AFTER UPDATE ON `event` FOR EACH ROW
BEGIN
	INSERT log VALUES('event', 'MODIFICATION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS eventDelete;
DELIMITER $$
CREATE TRIGGER eventDelete AFTER DELETE ON `event` FOR EACH ROW
BEGIN
	INSERT log VALUES('event', 'DELETION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS travel_toInsert;
DELIMITER $$
CREATE TRIGGER travel_toInsert AFTER INSERT ON travel_to FOR EACH ROW
BEGIN
	INSERT log VALUES('travel_to', 'INSERTION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS travel_toUpdate;
DELIMITER $$
CREATE TRIGGER travel_toUpdate AFTER UPDATE ON travel_to FOR EACH ROW
BEGIN
	INSERT log VALUES('travel_to', 'MODIFICATION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS travel_toDelete;
DELIMITER $$
CREATE TRIGGER travel_toDelete AFTER DELETE ON travel_to FOR EACH ROW
BEGIN
	INSERT log VALUES('travel_to', 'DELETION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS destinationInsert;
DELIMITER $$
CREATE TRIGGER destinationInsert AFTER INSERT ON destination FOR EACH ROW
BEGIN
	INSERT log VALUES('destination', 'INSERTION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS destinationUpdate;
DELIMITER $$
CREATE TRIGGER destinationUpdate AFTER UPDATE ON destination FOR EACH ROW
BEGIN
	INSERT log VALUES('destination', 'MODIFICATION', NOW(), @IT_manager);
END $$
DELIMITER ;


DROP TRIGGER IF EXISTS destinationDelete;
DELIMITER $$
CREATE TRIGGER destinationDelete AFTER DELETE ON destination FOR EACH ROW
BEGIN
	INSERT log VALUES('destination', 'DELETION', NOW(), @IT_manager);
END $$
DELIMITER ;


-- trigger 2
DROP TRIGGER IF EXISTS tripProtection;
DELIMITER $$
CREATE TRIGGER tripProtection BEFORE UPDATE ON trip FOR EACH ROW
BEGIN 
    DECLARE reservations INT;
    
    SELECT COUNT(*)
    INTO reservations
	FROM reservation
	WHERE res_tr_id = OLD.tr_id;
    
    IF (NEW.tr_departure != OLD.tr_departure) OR (NEW.tr_return != OLD.tr_return) OR (NEW.tr_cost != OLD.tr_cost) THEN
		IF reservations > 0 THEN
			SIGNAL SQLSTATE '45000'
			SET MESSAGE_TEXT = 'The cost, the departure date and the return date cannot be changed for this trip because there are reservations for it';
		END IF;
	END IF;
	
END $$
DELIMITER ;


-- trigger 3
DROP TRIGGER IF EXISTS salaryProtection;
DELIMITER $$
CREATE TRIGGER salaryProtection BEFORE UPDATE ON worker FOR EACH ROW
BEGIN

	IF NEW.wrk_salary < OLD.wrk_salary THEN
		SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'An employee\'s salary cannot be decreased';
    END IF;

END $$
DELIMITER ;
