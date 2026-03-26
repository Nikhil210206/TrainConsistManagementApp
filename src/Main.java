// Custom Exception Class
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {

    String name;
    int capacity;

    // Constructor with validation
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " -> " + capacity + " seats");
    }
}

// Main Class
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("\n--- UC14: Handle Invalid Bogie Capacity ---");

        try {

            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            b1.display();

            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);
            b2.display();

            // Invalid case
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            b3.display();

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}