package IfProblems;
import java.util.Scanner;
public class AgeCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if (age==0){
			System.out.println("Invalid error");
		}
		else if(age<=13) {
			System.out.println("Child");}
		else if(age>13 && age<=19) {
			System.out.println("Teen");
		}
		else if (age>=20) {
			System.out.println("Adult");
		}
		sc.close();

	}

}
