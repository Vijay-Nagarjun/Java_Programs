package Inheritance;
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging...");
    }
}
public class MultiInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar TATA = new ElectricCar();
        TATA.start();   
        TATA.drive();   
        TATA.charge();  

	}

}
