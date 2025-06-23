package newJava;
import java.util.Scanner; 
public class testtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);  
	        System.out.print("Enter your age: ");  
	        int age = scanner.nextInt();  
	        System.out.print("Enter your income: ");  
	        int income = scanner.nextInt();  
	        if (age >= 21) {  
	            if (income >= 25000) {  
	                System.out.println("Eligible for loan");  
	            } else {  
	                System.out.println("Not eligible for loan due to income");  
	            }  
	        } else {  
	            System.out.println("Not eligible for loan due to age");  
	        }  
	        scanner.close();  	       
	}

}
