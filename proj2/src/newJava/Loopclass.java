package newJava;

public class Loopclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1; i<=10; i++) {
			System.out.println("No of Students :"+i);
		}*/
		String[] items= {"Milk","Bread", "Egg", "Juice","Soup"};
		for(int i=1; i<items.length; i++) {
			System.out.println("items"+(i+1)+": "+items[i]);
			
		}
		int[]temperature= {20,31,26,33,29,30,27};
		int max=temperature[0];
		for (int i=1; i< temperature.length;i++) {
			if (temperature[i]>max) {
				max=temperature[i];
			}
		}
		System.out.println("Max temp:"+max+"C" );
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		int i=6;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		

	}

}
