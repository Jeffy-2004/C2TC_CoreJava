package com.jeffy.assignmenttwo;
import java.util.Scanner;

public class Commission {
	String Name;
	String Address;
	int Phoneno;
	float Sales_amount;
    Scanner read=new Scanner(System.in);
    public void employee_details() {
    	System.out.println("Employee Details:");
    	System.out.println("Enter employee name:");
    	Name=read.nextLine();
    	System.out.println("Enter employee address:");
    	Address=read.nextLine();
    	System.out.println("Enter employee PhoneNo:");
    	Phoneno=read.nextInt();
    	System.out.println("Enter employee sales amount:");
    	Sales_amount=read.nextFloat();
    }
    public void commission() {
    	if(Sales_amount>=100000) {
    		System.out.println("commission= 10%");
    	}
    	else if(5000<=Sales_amount && Sales_amount<100000) {
    		System.out.println("commission=5%");
    	}
    	else if(30000<=Sales_amount && Sales_amount<50000) {
    		System.out.println("commission=3%");
    	}
    	else if(Sales_amount<30000) {
    		System.out.println("No Commission");
    	}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Commission c=new Commission();
    	c.employee_details();
    	c.commission();
	    
	   
	}

}
