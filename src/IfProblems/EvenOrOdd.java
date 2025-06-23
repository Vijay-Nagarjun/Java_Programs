package IfProblems;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=ab.nextInt();
		if (num%2==0) {
			System.out.println("Even number");}
		else {
				System.out.println("Odd number");
		}
		ab.close();

	}

}
