package Inheritance;
import java.util.Scanner;
public class NewInheri {
	String title;
	void read() {
		System.out.println("Reading: "+ title );
	}}
class Ebook extends NewInheri{
		void download() {
			System.out.println("Ebook \""+title+"\"downloading.....");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ebook ebook = new Ebook();
		
		System.out.println("Enter the title of the book: ");
		ebook.title = sc.nextLine();
		
		ebook.download();
		ebook.read();
		
		sc.close();

	}

}
