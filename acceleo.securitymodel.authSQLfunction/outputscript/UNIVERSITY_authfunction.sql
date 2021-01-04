USE UNIVERSITY;

DROP FUNCTION IF EXISTS auth_READ_regUserEmail;
DELIMITER //
CREATE FUNCTION auth_READ_regUserEmail (self INT(11), caller INT(11), role VARCHAR(200)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	IF (role = 'Administrator')
		THEN RETURN auth_READ_regUserEmail_Administrator(self, caller);
	END IF;
	IF (role = 'Lecturer')
		THEN RETURN auth_READ_regUserEmail_Lecturer(self, caller);
	END IF;
	IF (role = 'Student')
		THEN RETURN auth_READ_regUserEmail_Student(self, caller);
	END IF;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_regUserName;
DELIMITER //
CREATE FUNCTION auth_READ_regUserName (self INT(11), caller INT(11), role VARCHAR(200)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	IF (role = 'Administrator')
		THEN RETURN auth_READ_regUserName_Administrator(self, caller);
	END IF;
	IF (role = 'Lecturer')
		THEN RETURN auth_READ_regUserName_Lecturer(self, caller);
	END IF;
	IF (role = 'Student')
		THEN RETURN auth_READ_regUserName_Student(self, caller);
	END IF;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_lecturerSalary;
DELIMITER //
CREATE FUNCTION auth_READ_lecturerSalary (self INT(11), caller INT(11), role VARCHAR(200)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	IF (role = 'Administrator')
		THEN RETURN auth_READ_lecturerSalary_Administrator(self, caller);
	END IF;
	IF (role = 'Lecturer')
		THEN RETURN auth_READ_lecturerSalary_Lecturer(self, caller);
	END IF;
	IF (role = 'Student')
		THEN RETURN auth_READ_lecturerSalary_Student(self, caller);
	END IF;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_studentIntake;
DELIMITER //
CREATE FUNCTION auth_READ_studentIntake (self INT(11), caller INT(11), role VARCHAR(200)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	IF (role = 'Administrator')
		THEN RETURN auth_READ_studentIntake_Administrator(self, caller);
	END IF;
	IF (role = 'Lecturer')
		THEN RETURN auth_READ_studentIntake_Lecturer(self, caller);
	END IF;
	IF (role = 'Student')
		THEN RETURN auth_READ_studentIntake_Student(self, caller);
	END IF;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_regUserEmail_Administrator;
DELIMITER //
CREATE FUNCTION auth_READ_regUserEmail_Administrator (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (TRUE)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_regUserEmail_Lecturer;
DELIMITER //
CREATE FUNCTION auth_READ_regUserEmail_Lecturer (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (TRUE)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_regUserEmail_Student;
DELIMITER //
CREATE FUNCTION auth_READ_regUserEmail_Student (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (TRUE)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_regUserName_Administrator;
DELIMITER //
CREATE FUNCTION auth_READ_regUserName_Administrator (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (TRUE)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_regUserName_Lecturer;
DELIMITER //
CREATE FUNCTION auth_READ_regUserName_Lecturer (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (TRUE)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_regUserName_Student;
DELIMITER //
CREATE FUNCTION auth_READ_regUserName_Student (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (TRUE)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_lecturerSalary_Administrator;
DELIMITER //
CREATE FUNCTION auth_READ_lecturerSalary_Administrator (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_lecturerSalary_Lecturer;
DELIMITER //
CREATE FUNCTION auth_READ_lecturerSalary_Lecturer (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (TRUE)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_lecturerSalary_Student;
DELIMITER //
CREATE FUNCTION auth_READ_lecturerSalary_Student (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_studentIntake_Administrator;
DELIMITER //
CREATE FUNCTION auth_READ_studentIntake_Administrator (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (TRUE)) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_studentIntake_Lecturer;
DELIMITER //
CREATE FUNCTION auth_READ_studentIntake_Lecturer (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (EXISTS (SELECT 1 FROM (SELECT * FROM teaching WHERE lecturer = caller) as TEMP1 JOIN (SELECT * FROM enrollment WHERE students = self) as TEMP2 ON TEMP1.taught = TEMP2.enrolled))) AS TEMP;
	RETURN result;
END //
DELIMITER ;

DROP FUNCTION IF EXISTS auth_READ_studentIntake_Student;
DELIMITER //
CREATE FUNCTION auth_READ_studentIntake_Student (self INT(11), caller INT(11)) 
RETURNS INT DETERMINISTIC
BEGIN
	DECLARE result INT DEFAULT 0;
	SELECT res INTO result FROM (SELECT 0  OR (caller = self)) AS TEMP;
	RETURN result;
END //
DELIMITER ;
