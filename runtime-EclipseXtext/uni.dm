DataModel University:
	entity RegUser {
		attribute (firstname) String,
		attribute (middlename) String,
		attribute (lastname) String,
		attribute (email) unique String
	},
	entity Lecturer extends RegUser {
		attribute (salary) Integer,
		association Set(Course) taughtCourses 
			oppositeTo "Course.lecturer" in Teaching
	},
	entity Student extends RegUser {
		attribute (intake) Integer,
		association Set(Course) enrolledCourses 
			oppositeTo "Course.students" in Enrollment
	},
	entity Course {
		attribute (name) String,
		attribute (year) Integer,
		association Single(Lecturer) lecturer 
			oppositeTo "Lecturer.taughtCourses" in Teaching,
		association Set(Student) students 
			oppositeTo "Student.enrolledCourses" in Enrollment
	}