package IfProblems;
import java.util.Scanner;
public class IntrestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bank= new Scanner(System.in);
		System.out.println("Enter the Loan Amount:");
		float Loan=bank.nextFloat();
		System.out.println("Annual Intrest Rate:");
		float Interest=bank.nextFloat();
		System.out.println("Loan duration:");
		float Time=bank.nextFloat();
		float SI=(Loan*Interest*Time)/100;
		if (SI==0) {
			System.out.println("No Intrest taken");}
		else {
			System.out.println(SI);
			
		}
		bank.close();
		}
		
	}


