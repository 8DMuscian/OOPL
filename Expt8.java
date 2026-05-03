import java.util.*;

public class Expt8 {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        // Add
        employees.put(101, "CALM");
        employees.put(102, "Char Diwari");
        employees.put(103, "Yashraj");

        // Display
        System.out.println("Employees: " + employees);

        // Update
        employees.put(101, "Zachary");

        // Delete
        employees.remove(103);

        // Search
        System.out.println("Search ID 102: " + employees.get(102));

        // Display in alphabetical order
        List<String> names = new ArrayList<>(employees.values());
        Collections.sort(names);
        System.out.println("Employees (Alphabetical): " + names);
    }
}