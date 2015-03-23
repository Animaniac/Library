package com.Library

class Library {

	String location
	String openingHours
	

	static hasMany=[books: Book, student: Student, librarian: Librarian]
	
	String toString(){

	"$location,$openingHours"

}

    static constraints = {

	location()
	openingHours()	
    }
}
