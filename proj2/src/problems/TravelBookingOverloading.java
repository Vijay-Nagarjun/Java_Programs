package problems;

public class TravelBookingOverloading {
	static class TravelBooking {

        // Method 1: Book a bus ticket
        void bookTicket(String busNumber, String date) {
            System.out.println("Bus ticket booked:");
            System.out.println("Bus Number: " + busNumber);
            System.out.println("Date: " + date);
        }

        // Method 2: Book a flight ticket with class
        void bookTicket(String flightNumber, String date, String seatClass) {
            System.out.println("Flight ticket booked:");
            System.out.println("Flight Number: " + flightNumber);
            System.out.println("Date: " + date);
            System.out.println("Class: " + seatClass);
        }

        // Method 3: Book a train ticket with coach number
        void bookTicket(String trainNumber, String date, int coachNumber) {
            System.out.println("Train ticket booked:");
            System.out.println("Train Number: " + trainNumber);
            System.out.println("Date: " + date);
            System.out.println("Coach Number: " + coachNumber);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TravelBooking booking = new TravelBooking();

	        // Simulating all three bookings
	        booking.bookTicket("BUS123", "2025-06-10");
	        System.out.println();

	        booking.bookTicket("FL456", "2025-07-01", "Economy");
	        System.out.println();

	        booking.bookTicket("TR789", "2025-08-15", 5);

	}

}
