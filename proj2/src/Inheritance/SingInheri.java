package Inheritance;
class Phone {
    void call() {
        System.out.println("Calling from Phone");
    }
}
class Smartphone extends Phone {
    void browseInternet() {
        System.out.println("Browsing internet on Smartphone");
    }
}
public class SingInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Smartphone myPhone = new Smartphone();
	        myPhone.call();              
	        myPhone.browseInternet();    

	}

}
