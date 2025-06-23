package problems;

public class Prob1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Dog dog = new Dog(); 
		    dog.makeSound();
		}
	}

	class Animal {
	    void makeSound() {
	        System.out.println("Some generic animal sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    void makeSound() {
	        super.makeSound(); 
	        System.out.println("Bark!");

	}

}
