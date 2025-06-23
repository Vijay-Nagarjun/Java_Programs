package arrayQueue;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque=new ArrayDeque<>();
		deque.offerFirst("start");
		deque.offerLast("End");
		System.out.println("From First:" + deque.pollFirst());
		System.out.println("From Last:" + deque.pollLast());

	}

}
 