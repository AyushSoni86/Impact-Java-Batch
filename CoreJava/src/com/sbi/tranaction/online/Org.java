package com.sbi.tranaction.online;

public class Org {

	static{
		System.out.println("this is static  block");
	}
	{
		System.out.println("this is non-static  block");
	}
	public static void main(String[] args) {
	System.out.println("This is main method");
		Org o1=new Org();
		Org o2=new Org();
	}
}
