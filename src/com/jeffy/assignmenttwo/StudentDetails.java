package com.jeffy.assignmenttwo;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		char initial;
		long rollno;
		char grade;
		float percentage;
		Scanner read =new Scanner(System.in);
		System.out.println("Enter your full name:");
		name=read.nextLine();
		System.out.println("Enter initial:");
		initial=read.next().charAt(0);
		System.out.println("Enter your rollno:");
		rollno=read.nextLong();
		System.out.println("Enter your grade:");
		grade=read.next().charAt(0);
		System.out.println("Enter your percentage:");
		percentage=read.nextFloat();
		
		
		System.out.println("Name:"+ initial +"." + name);
		System.out.println("RollNo:" + rollno);
		System.out.println("Grade:" + grade);
		System.out.println("percentage:" + percentage + "%");

	}

}
