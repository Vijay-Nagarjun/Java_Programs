package quest;

public class TowerHonai {
	  public static void solveHanoi(int n, char source, char helper, char destination) {
	        if (n == 1) {
	            System.out.println("Move disk 1 from " + source + " to " + destination);
	            return;
	        }
	        solveHanoi(n - 1, source, destination, helper);
	        System.out.println("Move disk " + n + " from " + source + " to " + destination);
	        solveHanoi(n - 1, helper, source, destination);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfDisks = 3; // You can change this to try more disks
        System.out.println("Solution for " + numberOfDisks + " disks:");
        solveHanoi(numberOfDisks, 'A', 'B', 'C');

	}

}
