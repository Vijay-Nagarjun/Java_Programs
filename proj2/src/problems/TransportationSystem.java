package problems;
class Vehiclee {
    void move() {
        System.out.println("The vehicle moves.");
    }
}

// Subclass Car, which overrides the move() method
class Carr extends Vehiclee {
    @Override
    void move() {
        System.out.println("The car drives on roads.");
    }
}

// Subclass Boat, which overrides the move() method
class Boat extends Vehiclee {
    @Override
    void move() {
        System.out.println("The boat sails on water.");
    }
}
public class TransportationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiclee myCar = new Carr();
	       Vehiclee myBoat = new Boat();

	        // Calling move() method on both references
	        myCar.move();   // Output: The car drives on roads.
	        myBoat.move(); 
	}

}
