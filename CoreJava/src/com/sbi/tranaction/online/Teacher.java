package com.sbi.tranaction.online;

public class Teacher {
	static{
		System.out.println("This is static block");
	}
	public Teacher()
	{
		System.out.println("This is constructor");

	}
	
	
	{
		System.out.println("This is non-static block");
	}
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		
	}
}
