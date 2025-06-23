package IfProblems;
import java.util.Scanner;
public class GradeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aw=new Scanner(System.in);
		System.out.println("Enter the Score");
		int Grade = aw.nextInt();
		if (Grade<0 || Grade>100) {
			System.out.println("Invalid Grade");
		}
		else if (Grade>=90) {
			System.out.println("Excellent");
		}
		else if (Grade>=70 && Grade<=89) {
			if (Grade<=80) {
				System.out.println("Very Good");
			}
			else {
				System.out.println("Good");
			}	
		}
		else {
			System.out.println("Need Improvement");
		}
		aw.close();

	}

}
