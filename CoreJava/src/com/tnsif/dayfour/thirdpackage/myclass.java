package com.tnsif.dayfour.thirdpackage;

public class myclass {
	private static myclass obj=new myclass();
	private int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private myclass() {
		System.out.println("MyClass object created");		
	}
	
	public static myclass getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
}