package com.jeffy.assignmenttwo;
import java.util.Scanner;

public class Circle {
	float radius;
	String Color;
	Scanner read=new Scanner(System.in);
	public void getinput()
	{
		System.out.println("Enter radius:");
		radius=read.nextFloat();
		System.out.println("Enter circle color:");
		Color=read.next();	
	}
	public void calcarea(){
	    float circlearea=3.14f*radius*radius;
	    System.out.println("The area is:" + circlearea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.getinput();
		c.calcarea();

	}

}
