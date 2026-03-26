import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC6
        System.out.println("\n--- UC6: Map Bogie to Capacity ---");

        // Create HashMap
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display all bogies with capacity
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }
    }
}