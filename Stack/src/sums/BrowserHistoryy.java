package sums;
import java.util.Stack;

public class BrowserHistoryy {
	 private Stack<String> history = new Stack<>();

	    // Push operation: Visit a new page
	    public void pushPage(String url) {
	        history.push(url);
	        System.out.println("Visited: " + url);
	        printHistory();
	    }

	    // Pop operation: Go back to previous page
	    public void goBack() {
	        if (history.size() > 1) {
	            String current = history.pop();
	            System.out.println("Going back from: " + current);
	            System.out.println("Now on: " + history.peek());
	        } else if (history.size() == 1) {
	            System.out.println("You are at the first page. Cannot go back further.");
	        } else {
	            System.out.println("No history available.");
	        }
	        printHistory();
	    }

	    // Display the stack contents
	    private void printHistory() {
	        System.out.println("Current Browser History:");
	        for (int i = history.size() - 1; i >= 0; i--) {
	            System.out.println("- " + history.get(i));
	        }
	        System.out.println();
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserHistoryy browser = new BrowserHistoryy();
        browser.pushPage("https://google.com");
        browser.pushPage("https://openai.com");
        browser.pushPage("https://stackoverflow.com");
        browser.goBack(); // Back from stackoverflow
        browser.goBack(); // Back from openai
        browser.goBack(); // At first page, can't go back

	}

}
