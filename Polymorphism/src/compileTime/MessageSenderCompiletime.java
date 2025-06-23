package compileTime; // In overloading no parent and child class will be there only methods will be there 

public class MessageSenderCompiletime {
	void sendMessage(String message) {
        System.out.println("Sending text message: " + message);
    }

    void sendMessage(String message, String recipient) {
        System.out.println("Sending message to " + recipient + ": " + message);
    }

    void sendMessage(String message, boolean isUrgent) {
        if (isUrgent)
            System.out.println("Urgent: " + message);
        else
            System.out.println("Sending message: " + message);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSenderCompiletime sender = new MessageSenderCompiletime();
        sender.sendMessage("Hello!");
        sender.sendMessage("Hello!", "Vaishali");
        sender.sendMessage("Server down!", true);

	}

}
