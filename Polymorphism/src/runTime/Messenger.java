package runTime;

public class Messenger {
	void send() {
		System.out.println("Sending a generic message");
	}

}
class WhatsappMessenger extends Messenger{
	void send() {
		System.out.println("Sending via Whatsapp");
	}
}
class EmailMessenger extends Messenger {
	void send() {
		System.out.println("Sending the Email");
	}
	public static void main(String[] args) {
		Messenger messenger;
		messenger = new WhatsappMessenger();
		messenger.send();
		messenger= new EmailMessenger();
		messenger.send();
	}
}