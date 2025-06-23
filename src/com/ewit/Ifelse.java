package com.ewit;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=number.nextInt();
		if (num==0) {
			System.out.println("Number is 0");
		}
		else if (num>0) {
			System.out.println("The number is greater than 0");
		}
		else if (num<0) {
			System.out.println(" The number is smaller than 0");
		}
number.close();
	}

}
