import java.util.LinkedList;

public class Trainmanagement {
    public static void main(String[] args) {

        // Step 1: Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 3: Insert Pantry Car at position 2 (index 1)
        trainConsist.add(1, "Pantry Car");

        // Step 4: Display after insertion
        System.out.println("Train consist after adding Pantry Car:");
        System.out.println(trainConsist);

        // Step 5: Remove first and last bogie
        trainConsist.removeFirst(); // Removes Engine
        trainConsist.removeLast();  // Removes Guard

        // Step 6: Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}