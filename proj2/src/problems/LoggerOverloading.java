package problems;

public class LoggerOverloading {
	static class Logger {

        // Method 1: Log with just a message
        void log(String message) {
            System.out.println("[INFO] " + message);
        }

        // Method 2: Log with message and custom level
        void log(String message, String level) {
            System.out.println("[" + level.toUpperCase() + "] " + message);
        }

        // Method 3: Log with message, level, and user
        void log(String message, String level, String user) {
            System.out.println("[" + level.toUpperCase() + "] (" + user + "): " + message);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new Logger();

        // Calling the overloaded methods
        logger.log("Application started");
        logger.log("Disk space running low", "warning");
        logger.log("Unauthorized login attempt", "error", "admin");

	}

}
