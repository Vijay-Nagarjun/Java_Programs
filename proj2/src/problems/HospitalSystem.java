package problems;
class Doctor {
    void duty() {
        System.out.println("General medical duties");
    }
}

// Subclass
class Surgeon extends Doctor {
    @Override
    void duty() {
        super.duty(); // Call parent class method
        System.out.println("Performing surgeries");
    }
}

public class HospitalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgeon surgeon = new Surgeon();
        surgeon.duty();

	}

}
