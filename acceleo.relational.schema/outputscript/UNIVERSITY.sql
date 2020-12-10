DROP DATABASE IF EXISTS UNIVERSITY;
CREATE DATABASE UNIVERSITY;
USE UNIVERSITY;

DROP TABLE IF EXISTS RegisterUser;
CREATE TABLE RegisterUser(
	RegisterUserID INT(11) PRIMARY KEY,
	firstname VARCHAR(200),
	middlename VARCHAR(200),
	lastname VARCHAR(200),
	email VARCHAR(200) UNIQUE
);
DROP TABLE IF EXISTS Lecturer;
CREATE TABLE Lecturer(
	LecturerID INT(11) PRIMARY KEY,
	RegisterUserID INT(11) UNIQUE,
	FOREIGN KEY (RegisterUserID) REFERENCES RegisterUser(RegisterUserID),
	salary INT(11)
);
DROP TABLE IF EXISTS Student;
CREATE TABLE Student(
	StudentID INT(11) PRIMARY KEY,
	RegisterUserID INT(11) UNIQUE,
	FOREIGN KEY (RegisterUserID) REFERENCES RegisterUser(RegisterUserID),
	intake INT(11)
);
DROP TABLE IF EXISTS Course;
CREATE TABLE Course(
	CourseID INT(11) PRIMARY KEY,
	name VARCHAR(200),
	year INT(11)
);
DROP TABLE IF EXISTS Teaching;
CREATE TABLE Teaching(
	taught INT(11) UNIQUE,
	FOREIGN KEY (taught) REFERENCES Course(CourseID),
	lecturer INT(11) UNIQUE,
	FOREIGN KEY (lecturer) REFERENCES Lecturer(LecturerID)
);
DROP TABLE IF EXISTS Enrollment;
CREATE TABLE Enrollment(
	students INT(11) UNIQUE,
	FOREIGN KEY (students) REFERENCES Student(StudentID),
	enrolled INT(11) UNIQUE,
	FOREIGN KEY (enrolled) REFERENCES Course(CourseID)
);
