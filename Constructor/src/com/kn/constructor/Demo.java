package com.kn.constructor;

public class Demo {
	public static void main(String[] args) {
		EngineeringStudent es1 =new EngineeringStudent();
		EngineeringStudent es2 =new EngineeringStudent(5);
		EngineeringStudent es3 =new EngineeringStudent("Mech");
		EngineeringStudent es4 =new EngineeringStudent(05,"Cse");
		System.out.println("id:"+es1.id);
		System.out.println("name:"+es2.name);
		System.out.println("SemId:"+es3.semId);
		System.out.println("Branch:"+es4.branch);
		
		
		
		
	}

}
