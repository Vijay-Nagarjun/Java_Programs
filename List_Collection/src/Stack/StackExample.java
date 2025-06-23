package Stack;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> history=new Stack();
		history.push("page 1");
		history.push("page 2");
		history.push("page 3");
		System.out.println("history:"+history.pop());

	}

}
