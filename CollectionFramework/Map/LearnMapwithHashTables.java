import java.util.*;

public class LearnMapwithHashTables {

    public static void main(String[] args) {
        // Create a HashMap to store country names and their populations
        HashMap<String, Integer> populationMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        populationMap.put("China", 1444216107);
        populationMap.put("India", 1393409038);
        populationMap.put("USA", 332915073);
        populationMap.put("Indonesia", 276361783);
        populationMap.put("Pakistan", 225199937);

        // Retrieve the population of a specific country
        int population = populationMap.get("India");
        System.out.println("Population of India: " + population);

        // Check if a key exists in the HashMap
        boolean exists = populationMap.containsKey("USA");
        System.out.println("USA exists in the map: " + exists);

        // Iterate over the key-value pairs in the HashMap
        for (HashMap.Entry<String, Integer> entry : populationMap.entrySet()) {
            String country = entry.getKey();
            int pop = entry.getValue();
            System.out.println("Country: " + country + ", Population: " + pop);
        }

        // Remove a key-value pair from the HashMap
        populationMap.remove("Pakistan");
        System.out.println("Pakistan is removed from the map.");

        // Clear all key-value pairs from the HashMap
        populationMap.clear();
        System.out.println("HashMap is cleared.");
    }
}
