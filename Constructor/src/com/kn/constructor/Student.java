package com.kn.constructor;

public class Student {
int id;
String name;

public Student() {

	this(11111,"Chamak Chandra");
	System.out.println("======> Student with no arguments");
}

public Student(int id, String name) {
	this(name);
	this.id = id;
	this.name = name;
	System.out.println("======> Studentint,string arg arguments");
	
}

public Student(int id) {
	
	this.id=id ;
	System.out.println("======> Student int arg arguments");
}

public Student( String name) {
	
	this(22222);
	this.name=name;
	System.out.println("======> Student String arg arguments");
	
	
}



}
