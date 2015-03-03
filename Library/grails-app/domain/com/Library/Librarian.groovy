package com.Library

class Librarian {

	String name
	String email
	String userName
	String password
	String phoneNumber
	
	String toString(){
	"$userName"
}

    static constraints = {

	name()
	email()
	userName()
	password()
	phoneNumber()

    }
}
