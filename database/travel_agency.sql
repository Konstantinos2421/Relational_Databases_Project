DROP DATABASE IF EXISTS travel_agency;
CREATE DATABASE travel_agency DEFAULT CHARSET utf16 COLLATE utf16_unicode_ci;
USE travel_agency;
SET @IT_manager = NULL;

DROP TABLE IF EXISTS `branch`;
CREATE TABLE `branch`(
	br_code INT(11) AUTO_INCREMENT NOT NULL,
    br_street VARCHAR(30) NOT NULL,
    br_num INT(4) NOT NULL,
    br_city VARCHAR(30) NOT NULL,
	
	PRIMARY KEY(br_code)
)Engine=InnoDB;


DROP TABLE IF EXISTS `phones`;
CREATE TABLE `phones`(
	ph_br_code INT(11) NOT NULL,
    ph_number CHAR(10) NOT NULL UNIQUE,
	
	PRIMARY KEY(ph_br_code, ph_number),
    FOREIGN KEY(ph_br_code) REFERENCES `branch`(br_code) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `worker`;
CREATE TABLE `worker`(
	wrk_AT CHAR(10) NOT NULL,
    wrk_name VARCHAR(20) NOT NULL,
    wrk_lname VARCHAR(20) NOT NULL,
    wrk_salary FLOAT(7,2) NOT NULL,
    wrk_br_code INT(11) NOT NULL,
    
    PRIMARY KEY(wrk_AT),
    FOREIGN KEY(wrk_br_code) REFERENCES `branch`(br_code) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`(
	adm_AT CHAR(10) NOT NULL,
    adm_type ENUM('LOGISTICS', 'ADMINISTRATIVE', 'ACCOUNTING') NOT NULL,
    adm_diploma VARCHAR(200) NOT NULL,
    
    PRIMARY KEY(adm_AT),
    FOREIGN KEY(adm_AT) REFERENCES `worker`(wrk_AT) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `guide`;
CREATE TABLE `guide`(
	gui_AT CHAR(10) NOT NULL,
    gui_cv TEXT NOT NULL,
    
    PRIMARY KEY(gui_AT),
    FOREIGN KEY(gui_AT) REFERENCES `worker`(wrk_AT) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `languages`;
CREATE TABLE `languages`(
	lng_gui_AT CHAR(10) NOT NULL,
    lng_language VARCHAR(30) NOT NULL,
    
    PRIMARY KEY(lng_gui_AT, lng_language),
    FOREIGN KEY(lng_gui_AT) REFERENCES `guide`(gui_AT) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `driver`;
CREATE TABLE `driver`(
	drv_AT CHAR(10) NOT NULL,
    drv_license ENUM('A', 'B', 'C', 'D') NOT NULL,
    drv_route ENUM('LOCAL', 'ABROAD') NOT NULL,
    drv_experience TINYINT(4) NOT NULL,
    
	PRIMARY KEY(drv_AT),
    FOREIGN KEY(drv_AT) REFERENCES `worker`(wrk_AT) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `trip`;
CREATE TABLE `trip`(
	tr_id INT(11) AUTO_INCREMENT NOT NULL,
    tr_departure DATETIME NOT NULL,
    tr_return DATETIME NOT NULL,
    tr_maxseats TINYINT(4) NOT NULL,
    tr_cost FLOAT(7,2) NOT NULL,
    tr_br_code INT(11) NOT NULL,
    tr_gui_AT CHAR(10) NOT NULL,
    tr_drv_AT CHAR(10) NOT NULL,
	
	PRIMARY KEY(tr_id),
    FOREIGN KEY(tr_br_code) REFERENCES `branch`(br_code) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY(tr_gui_AT) REFERENCES `guide`(gui_AT) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY(tr_drv_AT) REFERENCES `driver`(drv_AT) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `event`;
CREATE TABLE `event`(
	ev_tr_id INT(11) NOT NULL,
    ev_start DATETIME NOT NULL,
    ev_end DATETIME NOT NULL,
    ev_descr TEXT NOT NULL,
    
    PRIMARY KEY(ev_tr_id, ev_start),
    FOREIGN KEY(ev_tr_id) REFERENCES `trip`(tr_id) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `destination`;
CREATE TABLE `destination`(
	dst_id INT(11) AUTO_INCREMENT NOT NULL,
    dst_name VARCHAR(50) NOT NULL,
    dst_descr TEXT NOT NULL,
    dst_rtype ENUM('LOCAL', 'ABROAD') NOT NULL,
    dst_language VARCHAR(30) NOT NULL,
    dst_location INT(11),
    
	PRIMARY KEY(dst_id),
    FOREIGN KEY(dst_location) REFERENCES `destination`(dst_id) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `travel_to`;
CREATE TABLE `travel_to`(
	to_tr_id INT(11) NOT NULL,
    to_dst_id INT(11) NOT NULL,
    to_arrival DATETIME NOT NULL,
    to_departure DATETIME NOT NULL,
	
	PRIMARY KEY(to_tr_id, to_dst_id),
    FOREIGN KEY(to_tr_id) REFERENCES `trip`(tr_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY(to_dst_id) REFERENCES `destination`(dst_id) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation`(
	res_tr_id INT(11) NOT NULL,
    res_seatnum TINYINT(4) NOT NULL,
    res_name VARCHAR(20) NOT NULL,
    res_lname VARCHAR(20) NOT NULL,
    res_isadult ENUM('ADULT', 'MINOR') NOT NULL,
	
	PRIMARY KEY(res_tr_id, res_seatnum),
    FOREIGN KEY(res_tr_id) REFERENCES `trip`(tr_id) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `manages`;
CREATE TABLE `manages`(
	mng_adm_AT CHAR(10) NOT NULL,
    mng_br_code INT(11) NOT NULL,
    
    PRIMARY KEY(mng_adm_AT, mng_br_code),
    FOREIGN KEY(mng_adm_AT) REFERENCES `admin`(adm_AT) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY(mng_br_code) REFERENCES `branch`(br_code) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `IT_manager`;
CREATE TABLE `IT_manager`(
	IT_AT CHAR(10) NOT NULL,
    IT_password CHAR(10) NOT NULL DEFAULT 'password',
    IT_start_date DATETIME NOT NULL,
    IT_end_date DATETIME,
    
	PRIMARY KEY(IT_AT),
    FOREIGN KEY (IT_AT) REFERENCES `worker`(wrk_AT) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `offers`;
CREATE TABLE `offers`(
	offer_id INT(11) AUTO_INCREMENT NOT NULL,
    offer_start_date DATETIME NOT NULL,
    offer_end_date DATETIME NOT NULL, 
    offer_cost FLOAT(7,2) NOT NULL,
    offer_destination INT(11) NOT NULL,
    
	PRIMARY KEY(offer_id),
    FOREIGN KEY(offer_destination) REFERENCES destination(dst_id) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `reservation_offers`;
CREATE TABLE `reservation_offers`(
	res_id INT(11) AUTO_INCREMENT NOT NULL,
    res_name VARCHAR(20) NOT NULL,
    res_lname VARCHAR(20) NOT NULL,
    res_offer_id INT(11) NOT NULL,
    payment_in_advance FLOAT(7,2) NOT NULL,
    
    PRIMARY KEY(res_id),
    FOREIGN KEY(res_offer_id) REFERENCES `offers`(offer_id) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;


DROP TABLE IF EXISTS `log`;
CREATE TABLE `log`(

	log_table VARCHAR(20) NOT NULL,
    log_action ENUM('INSERTION', 'MODIFICATION', 'DELETION') NOT NULL,
	log_date_time DATETIME NOT NULL DEFAULT NOW(),
    log_IT_lname VARCHAR(20)
	
)Engine=InnoDB;


CREATE INDEX reservation_offers_btree_byPayment
ON reservation_offers(payment_in_advance)
USING BTREE;

CREATE INDEX reservation_offers_btree_byName
ON reservation_offers(res_lname, res_name)
USING BTREE;
