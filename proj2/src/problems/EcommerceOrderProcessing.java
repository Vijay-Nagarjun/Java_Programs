package problems;
class Order {
    // Method in the superclass
    void processOrder() {
        System.out.println("Processing general order...");
    }
}

// Subclass OnlineOrder, which overrides processOrder() method
class OnlineOrder extends Order {
    @Override
    void processOrder() {
        System.out.println("Processing online order with digital invoice...");
    }
}

// Subclass InStoreOrder, which overrides processOrder() method
class InStoreOrder extends Order {
    @Override
    void processOrder() {
        System.out.println("Processing in-store order with printed receipt...");
    }
}

public class EcommerceOrderProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order onlineOrder = new OnlineOrder();
        Order inStoreOrder = new InStoreOrder();

        // Calling processOrder() method on both references
        onlineOrder.processOrder();  // Output: Processing online order with digital invoice...
        inStoreOrder.processOrder();

	}

}
