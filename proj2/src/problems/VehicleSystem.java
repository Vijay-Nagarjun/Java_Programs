package problems;
class Vehicle {
    int speed = 60;

    void displaySpeed() {
        System.out.println("Speed of Vehicle: " + speed + " km/h");
    }
}

// Subclass
class Car extends Vehicle {
    int speed = 100;

    @Override
    void displaySpeed() {
        System.out.println("Speed of Car: " + speed + " km/h");
        System.out.println("Speed of Vehicle: " + super.speed + " km/h");
    }
}

public class VehicleSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car myCar = new Car();
	        myCar.displaySpeed();

	}

}
