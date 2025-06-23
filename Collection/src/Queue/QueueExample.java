package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue=new LinkedList<>();
		queue.offer("Apple");
		queue.offer("Mango");
		queue.offer("Guava");
		System.out.println("Front of Queue:" + queue.peek());
		while(!queue.isEmpty()) {
			System.out.println("Removed:"+ queue.poll());
		}
		System.out.println("Queue empty"+ queue.isEmpty());

	}

}
