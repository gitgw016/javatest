show tables;

CREATE TABLE STUDENT(
	STUNO INT PRIMARY KEY AUTO_INCREMENT,
	STUNAME VARCHAR(50),
	STUDEPT VARCHAR(50),
	STUGRADE INT,
	STUCLASS CHAR(1) DEFAULT 'A',
	STUGENDER CHAR(1) DEFAULT 'F',
	STUDATE TIMESTAMP DEFAULT NOW()
);

show tables;
-- ctrl + alt + x
INSERT INTO student 
VALUES(null, '최기근','컴퓨터공학',3,'A','M',now());

SELECT * FROM student;

CREATE TABLE tbl_book(
	num INT PRIMARY KEY auto_increment,
	title VARCHAR(300),
	author VARCHAR(300),
	regdate TIMESTAMP default now()
);

INSERT INTO tbl_book(title,author) VALUES('민구는 안선다','배민구');

SELECT * FROM tbl_book;

UPDATE tbl_book SET author = '백만규' WHERE num = 1;

commit;