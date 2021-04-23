package com.wipro;

import java.util.Scanner;


public class Assertion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		assert age>=18:"fuck-you"; 
		System.out.println("Age is "+age );
		
		
	}

}
