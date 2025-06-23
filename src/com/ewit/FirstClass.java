package com.ewit;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int age;
		float salary;
		String name;
		char gen;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		name=scanner.next();
		System.out.println("Enter age");
		age=scanner.nextInt();
		System.out.println("Enter salary");
		salary=scanner.nextFloat();
		System.out.println("Enter gender");
		gen=scanner.next().charAt(0);
		System.out.println("Employee Details");
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Salary"+salary);
		System.out.println("Gender"+gen); */
		
		int a;
		int b;
		int s;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a value:");
		a=scanner.nextInt();
		System.out.println("Enter b value:");
		b=scanner.nextInt();
		s=a+b;
		System.out.println("The sum of"+a+ " and" +b+ " is" +s);
		scanner.close();
		
		
		
		
	}

}
