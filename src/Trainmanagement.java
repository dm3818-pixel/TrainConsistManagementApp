import java.util.HashMap;
import java.util.Map;

public class Trainmanagement {
    public static void main(String[] args) {

        // Step 1: Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Add bogies with their capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);

        // Step 3: Display all bogie-capacity mappings
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }
    }
}