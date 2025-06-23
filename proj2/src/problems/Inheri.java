package problems;

public class Inheri {
	 static class Bank {
	        // Constructor for Bank class that takes the bank name as a parameter
	        public Bank(String bankName) {
	            System.out.println("Bank Name: " + bankName);
	        }
	    }

	    // Derived class Branch extending Bank
	    static class Branch extends Bank {
	        // Constructor for Branch class that takes both bank name and branch name
	        public Branch(String bankName, String branchName) {
	            super(bankName);  // Calls the constructor of the Bank class
	            System.out.println("Branch Name: " + branchName);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Branch branch = new Branch("ABC Bank", "Mumbai Branch");

	}

}
