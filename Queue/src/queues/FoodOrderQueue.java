package queues;
import java.util.LinkedList;
import java.util.Queue;
public class FoodOrderQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> orders = new LinkedList<>();

        orders.add("Burger");
        orders.add("Pizza");
        orders.add("Pasta");

        // Serve first order
        System.out.println("Serving: " + orders.poll());

        System.out.println("Remaining orders:");
        for (String order : orders) {
            System.out.println(order);
        }

	}

}
