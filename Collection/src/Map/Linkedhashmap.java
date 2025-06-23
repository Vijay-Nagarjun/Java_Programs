package Map;
import java.util.LinkedHashMap;
public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> cities= new LinkedHashMap<>();
		cities.put("India", "Delhi");
		cities.put("US", "Washington");
		cities.put("UK", "London");
		System.out.println("All Entries:" + cities);

	}

}
