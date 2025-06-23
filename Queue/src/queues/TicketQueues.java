package queues;
import java.util.LinkedList;
import java.util.Queue;
public class TicketQueues {
	 private Queue<String> queue = new LinkedList<>();

	    // Serve customer from front of the queue
	    public void serveCustomer() {
	        if (queue.isEmpty()) {
	            System.out.println("No customers to serve.");
	        } else {
	            String served = queue.poll();
	            System.out.println("Serving customer: " + served);
	            printQueue();
	        }
	    }

	    // Display current queue
	    private void printQueue() {
	        System.out.println("Current Queue: " + queue);
	        System.out.println();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TicketQueues ticketQueues = new TicketQueues();

	        // Adding some customers first (to test serve)
	        ticketQueues.queue.add("Alice");
	        ticketQueues.queue.add("Bob");
	        ticketQueues.queue.add("Charlie");

	        ticketQueues.serveCustomer(); // Serve Alice
	        ticketQueues.serveCustomer(); // Serve Bob
	        ticketQueues.serveCustomer(); // Serve Charlie
	        ticketQueues.serveCustomer(); // No one to serve
		

	}

}
