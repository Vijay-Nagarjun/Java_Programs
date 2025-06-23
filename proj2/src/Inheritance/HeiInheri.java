package Inheritance;
class Animal {
    void eat() {
        System.out.println("Animals are eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}
public class HeiInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dog dog = new Dog();
	        Cat cat = new Cat();

	        dog.eat();
	        dog.bark();

	        cat.eat();
	        cat.meow();

	}

}
