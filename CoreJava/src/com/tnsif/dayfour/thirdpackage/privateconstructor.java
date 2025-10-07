package com.tnsif.dayfour.thirdpackage;

public class privateconstructor{

	public static void main(String[] args) {
		myclass m=myclass.getObject();
		m.setId(10);
		
		myclass m1=myclass.getObject();
		
		System.out.println(m);
		System.out.println(m1);

	}

}