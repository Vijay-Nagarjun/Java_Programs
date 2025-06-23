package IfProblems;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aab=new Scanner(System.in);
		System.out.println("Enter the year");
		int LeapYear= aab.nextInt();
		if (LeapYear % 4==0) {
			if (LeapYear % 100==0) {
				if(LeapYear % 400==0) {
					System.out.println("It is a leap Year");}
					else {
						System.out.println("It is not a leap year");
				}
			}
			else {
				System.out.println("Leap year");
			}
		}
		else {
			System.out.println("It is not a leap Year");
		}
		aab.close();

	}

}
