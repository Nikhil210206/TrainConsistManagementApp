import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC5
        System.out.println("\n--- UC5: Preserve Insertion Order of Bogies ---");

        // Create LinkedHashSet
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}