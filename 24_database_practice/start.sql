use smart;

DROP TABLE IF EXISTS tbl_account;

CREATE TABLE IF NOT EXISTS tbl_account(
	ano VARCHAR(30) NOT NULL UNIQUE,
    owner VARCHAR(20) NOT NULL,
    balance INT default 0,
    password VARCHAR(50) NOT NULL
);

DESC tbl_account;

INSERT INTO tbl_account VALUES('111-111','배민구',10000,'12345');

SELECT * FROM tbl_account;
commit;

-- ano, password를 넘겨받아서 일치하는 계정 정보를 반환하는 procedure
DELIMITER $$
CREATE PROCEDURE find_account(IN _ano VARCHAR(30), IN _pass VARCHAR(50))
BEGIN
	SELECT * FROM tbl_account WHERE ano = _ano AND password = _pass;
END $$
DELIMITER ;

call find_account('222-222','12345');

-- MEMBER
DELIMITER $$
CREATE PROCEDURE insert_member(IN _name VARCHAR(30), IN _id VARCHAR(100), IN _pw VARCHAR(100), IN _reg BIGINT)
BEGIN
	INSERT INTO tbl_member VALUES(null, _name, _id, _pw, _reg);
    SELECT * FROM tbl_member WHERE mNum = LAST_INSERT_ID();
END $$
DELIMITER ;

CALL insert_member('오정만','ohjungman','12345',0);
commit;
SELECT * FROM tbl_member;

-- MEMBER 탈퇴 회원의 정보를 백업

CREATE TABLE back_up_member LIKE tbl_member;
DROP TABLE back_up_member;
DESC back_up_member;
SELECT * FROM back_up_member;
ALTER TABLE back_up_member ADD COLUMN deleteDate TIMESTAMP default now();


-- trigger(tbl_member, back_up_member)

DELIMITER $$
CREATE TRIGGER delete_member AFTER DELETE ON tbl_member FOR EACH ROW
BEGIN
	INSERT INTO back_up_member VALUES(OLD.mNum,OLD.mName,OLD.mId,OLD.mPw,OLD.reg,now());
END $$
DELIMITER ;

commit;

DELETE FROM tbl_member WHERE mNum = 3;
