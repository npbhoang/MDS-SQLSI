USE TEST;

DROP FUNCTION IF EXISTS auth_READ_res1;
DELIMITER //
CREATE FUNCTION auth_READ_res1 (self INT(11), caller INT(11), role VARCHAR(200)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	IF (role = 'Student')
		THEN RETURN auth_READ_res1_Student(self, caller)
	END IF;
	IF (role = 'Lecturer')
		THEN RETURN auth_READ_res1_Lecturer(self, caller)
	END IF;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_res2;
DELIMITER //
CREATE FUNCTION auth_READ_res2 (self INT(11), caller INT(11), role VARCHAR(200)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	IF (role = 'Student')
		THEN RETURN auth_READ_res2_Student(self, caller)
	END IF;
	IF (role = 'Lecturer')
		THEN RETURN auth_READ_res2_Lecturer(self, caller)
	END IF;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_res1_Student;
DELIMITER //
CREATE FUNCTION auth_READ_res1_Student (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0 OR (c2) (b2)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_res1_Lecturer;
DELIMITER //
CREATE FUNCTION auth_READ_res1_Lecturer (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0 OR (a2) (c2)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_res2_Student;
DELIMITER //
CREATE FUNCTION auth_READ_res2_Student (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0 OR (c2)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_res2_Lecturer;
DELIMITER //
CREATE FUNCTION auth_READ_res2_Lecturer (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0 OR (c2)) AS TEMP;
	RETURN result;
END //
DELIMITER ;