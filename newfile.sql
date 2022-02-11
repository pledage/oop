SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS contract;
DROP TABLE IF EXISTS Office;




/* Create Tables */

CREATE TABLE contract
(
	contract_no varchar(100) NOT NULL,
	contract_start_office_no char(3) NOT NULL,
	PRIMARY KEY (contract_no)
);


CREATE TABLE Office
(
	Office_Number char(3) NOT NULL,
	Office_Address varchar(100) NOT NULL,
	Office_Tel_No varchar(11) NOT NULL,
	PRIMARY KEY (Office_Number)
);



/* Create Foreign Keys */

ALTER TABLE contract
	ADD FOREIGN KEY (contract_start_office_no)
	REFERENCES Office (Office_Number)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



