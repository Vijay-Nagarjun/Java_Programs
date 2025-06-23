package priorityQueue;
import java.util.PriorityQueue;
public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> tasks=new PriorityQueue<>();
		tasks.offer(5);
		tasks.offer(1);
		tasks.offer(3);
		System.out.println("most Important taks:"+tasks.poll());
		

	}

}
