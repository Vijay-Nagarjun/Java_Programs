package practisejava;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		int rw = 8;
        int col = 8;
        for (int i = 0; i < rw; i++) {
            for (int j = 0; j < col; j++) {
            	 if ((i + j) % 2 == 0) {
                     System.out.print("W ");
                 } else {
                     System.out.print("B ");
                 }
             }
             System.out.println();
            }

	}

}
