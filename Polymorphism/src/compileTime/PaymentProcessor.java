package compileTime;

public class PaymentProcessor {
	void makePayment(double amount) {
        System.out.println("Paid $" + amount);
    }

    // Method 2: Pay by amount and currency
    void makePayment(double amount, String currency) {
        System.out.println("Paid " + amount + " " + currency);
    }

    // Method 3: Pay by amount and discount
    void makePayment(double amount, double discount) {
        double finalAmount = amount - discount;
        System.out.println("Paid $" + finalAmount + " after discount");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor processor = new PaymentProcessor();
	    processor.makePayment(1000); // Calls method 1
	    processor.makePayment(200, "USD"); // Calls method 2
	    processor.makePayment(500,50);

	}

}
