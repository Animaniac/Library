package com.Library

class Library {

	String location
	String openingHours
	

	static hasMany=[books: Book, student: Student, library: Library]
	
	String toString(){

	"$location,$openingHours"

}

    static constraints = {

	location()
	openingHours()	
    }
}
