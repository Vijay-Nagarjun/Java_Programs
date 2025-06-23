package queues;
import java.util.LinkedList;
import java.util.Queue;
public class TicketQueue {
	private Queue<String> queue = new LinkedList<>();

    // Add customer at the rear of the queue
    public void addCustomer(String name) {
        queue.add(name);
        System.out.println("Customer added: " + name);
        printQueue();
    }

    // Display current queue
    private void printQueue() {
        System.out.println("Current Queue: " + queue);
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TicketQueue ticketQueue = new TicketQueue();
	        ticketQueue.addCustomer("Alice");
	        ticketQueue.addCustomer("Bob");
	        ticketQueue.addCustomer("Charlie");
		

	}

}
