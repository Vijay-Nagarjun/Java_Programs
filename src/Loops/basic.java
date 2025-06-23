package Loops;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers= {1,2,3,4,5};
for(int i=0; i<=numbers.length;i++) {
	numbers[i]+=i;
	System.out.println("numbers[" + i + "] = " + numbers[i]);
}

	}

}
