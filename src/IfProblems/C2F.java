package IfProblems;
import java.util.Scanner;
public class C2F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Temp=new Scanner(System.in);
		System.out.println("Enter the temp in Celsius:");
		float C=Temp.nextFloat();
		float F= (1.8f*C)+32;
		System.out.println("the Farenheit is:"+F);
		Temp.close();

	}

}
