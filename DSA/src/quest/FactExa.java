package quest;

public class FactExa {
	  public static int factorial(int n) {
	        if (n == 0 || n == 1)
	            return 1; 
	        else
	            return n * factorial(n - 1); 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

	}

}
