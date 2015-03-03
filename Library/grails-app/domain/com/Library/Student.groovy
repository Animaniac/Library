package com.Library

class Student {

	String name
	String email
	String studentId
	String course

	String toString(){

	"$name,$studentId"

}

    static constraints = {

	name()
	email()
	studentId()
	course()

    }
}
