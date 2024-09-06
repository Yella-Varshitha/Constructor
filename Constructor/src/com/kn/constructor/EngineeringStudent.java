package com.kn.constructor;

public class EngineeringStudent extends Student {
	int semId;
	String branch;
	
	public EngineeringStudent() {
		super(101,"Ramu");
		System.out.println("====>Engineering Student no arguments");
		
	}
	public EngineeringStudent(int semId, String branch) {
		super(102);
		this.semId=semId;
		this.branch=branch;
		System.out.println("====>Engineering int, String no arguments");
	}
	public EngineeringStudent(int semId) {
		this();
		this.semId = semId;
		System.out.println("====>Engineering int one arguments");
		
	}
	public EngineeringStudent(String branch) {
		this(8888,"varshi");
		
		this.branch = branch;
		System.out.println("====>Engineering String one arguments");
	}
	
	
	
	
		

}
