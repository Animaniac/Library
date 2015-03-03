package com.Library

class Book {

	String title
	String author
	String isbn
	Date dateBorrowed
	Date returnDate
	String student

	String toString(){

	"$title,$author,$isbn,$returnDate"
}


    static constraints = {

	title()
	author()
	isbn()
	dateBorrowed()
	returnDate()
	student()

    }
}