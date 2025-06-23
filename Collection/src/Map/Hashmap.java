package Map;
import java.util.HashMap;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> marks=new HashMap<>();
		marks.put("Alice", 85);
		marks.put("Santhosh", 90);
		marks.put("Nikethan", 83);
		System.out.println("Alice marks:" + marks.get("Alice"));
		

	}

}
