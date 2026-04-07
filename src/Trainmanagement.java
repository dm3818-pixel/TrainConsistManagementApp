import java.util.HashSet;

public class Trainmanagement {
    public static void main(String[] args) {

        // Step 1: Create HashSet for bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIds);
    }
}