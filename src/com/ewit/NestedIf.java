package com.ewit;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sol=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sol.nextInt();
		if (num>=1&&num<=100) {
			if(num%2==0) {
				System.out.println("The number is even number");
			}
			else {
				System.out.println("The number is odd number");
			}
		}
		else {
			System.out.println("Number out of range");
		}
		

	}

}
