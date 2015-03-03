package com.Library

class Course {

	String title
	String code
	String tutor
	String department
	String description

	String toString(){

	"$title,$tutor,$department,$description"	

}

    static constraints = {

	title()
	code()
	tutor()
	department()
	description()

    }
}
