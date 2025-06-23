package com.ewit;
import java.util.Scanner;
public class SwitchIf {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter first number");
		double a= num.nextDouble();
		System.out.println("Enter second number");
		double b=num.nextDouble();
		System.out.println("Enter operator('+','-','/','*','%')");
		char op=num.next().charAt(0);
		double result;
		switch(op){
		case '+':
			result=a+b;
			System.out.println("result" +result);
			break;
		case '-':
			result=a-b;
			System.out.println("result" +result);
			break;
		case'/':
			if(b!=0) {
			result=a/b;
			System.out.println("result" +result);}
			else {System.out.println("Error:Cannot divide by Zero");
			}
			break;
		case '*':
			result=a*b;
			System.out.println("result" +result);
			break;
		case '%':
			if (b!=0) {
			result=a%b;
			System.out.println("result" +result);}
			else {System.out.println("Error:Cannot divide by Zero");}
			break;
		default:
			System.out.println("Invalid Operator");
		} 
		
		num.close();
			
			
			
		}

	}


