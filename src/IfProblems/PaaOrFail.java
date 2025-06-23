package IfProblems;
import java.util.Scanner;
public class PaaOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the marks:");
		int marks=aa.nextInt();
		if(marks<0 || marks>100) {
			System.out.println("Invalid marks");}
		else if (marks>=40){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		aa.close();

	}

}
