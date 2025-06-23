package newJava;
import java.util.Scanner; 
public class testthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter your choice:");  
        int choice = scanner.nextInt();  
        switch(choice) {  
            case 1:  
                System.out.println("Pizza");  
                break;  
            case 2:  
                System.out.println("Burger");  
                break;  
            case 3:  
                System.out.println("Pasta");  
                break;  
            case 4:  
                System.out.println("Exit");  
                break;  
            default:  
                System.out.println("Invalid choice");  
        }  
        scanner.close(); 
	}

}
