DataModel University :
user entity RegUser {
	attribute name String,
	attribute email unique String
},
entity Student extends RegUser {
	attribute intake Integer,
	association Course[*] enrolled 
		oppositeTo "Course.students" in Enrollment
},
entity Lecturer extends RegUser {
	attribute salary Integer,
	association Course[*] taught 
		oppositeTo "Course.lecturer" in Teaching
},
entity Course {
	attribute name String,
	attribute year Integer,
	association Student[*] students 
		oppositeTo "Student.enrolled" in Enrollment,
	association Lecturer[1] lecturer 
		oppositeTo "Lecturer.taught" in Teaching
}



