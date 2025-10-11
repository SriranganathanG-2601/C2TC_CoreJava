//Program to demonstrate interface instance using factory method
package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Executor {
	public static void main(String args[]) {
		
		Phone p1 = phonefactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = phonefactory.createPhone("Jio"); 
		p1.call();
		p1.sms();
		
	}
}