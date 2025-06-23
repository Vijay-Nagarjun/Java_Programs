package queues;
import java.util.LinkedList;
import java.util.Queue;
public class CallCenterQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> callers = new LinkedList<>();

        callers.add("Customer1");
        callers.add("Customer2");
        callers.add("Customer3");

        // Serve the first customer
        System.out.println("Now serving: " + callers.poll());

        System.out.println("Waiting customers:");
        for (String customer : callers) {
            System.out.println(customer);
        }

	}

}
