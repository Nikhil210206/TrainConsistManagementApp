import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2
        System.out.println("\n--- UC2: Passenger Bogie Management ---");

        // Create passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        // Remove one bogie
        System.out.println("\nRemoving AC Chair...");
        passengerBogies.remove("AC Chair");

        System.out.println("Passenger Bogies after removal: " + passengerBogies);

        // Check existence
        System.out.println("\nChecking if Sleeper exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogies: " + passengerBogies);
    }
}