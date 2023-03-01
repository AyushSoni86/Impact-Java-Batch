package com.sbi.tranaction.online;
public class Product {
	private int pId;
	private String name;
	private float price;
	public Product()
	{
		System.out.println("Procduct constructor");

	}
	static{
		System.out.println("this is static  block");
	}
	{
		System.out.println("this is non-static  block");
	}

	public static void demo()
	{
		System.out.println("this is static method");
	}
	public void setpId(int pId)
	{
		this.pId=pId;

	}
	public int getpId()
	{
		return pId;
	}
	public void setname(String name)
	{
		this.name=name;

	}	

	public String getname()
	{
		return name;
	}
	public void setprice(float price)
	{
		this.price=price;

	}	

	public float getprice()
	{
		return price;
	}













}
