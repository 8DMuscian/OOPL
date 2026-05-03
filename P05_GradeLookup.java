import java.util.*;

class P05_GradeLookup {
    public static void main(String[] args) {
        HashMap<String, String> grades = new HashMap<>();
        grades.put("R01", "A"); grades.put("R02", "B"); grades.put("R03", "A+");
        grades.put("R04", "C"); grades.put("R05", "B+"); grades.put("R06", "A");
        
        System.out.println("Grade for R03: " + grades.get("R03"));
        System.out.println("Grade for R99: " + grades.getOrDefault("R99", "Not Found"));
        System.out.println("Does R01 exist? " + grades.containsKey("R01"));
        
        for (Map.Entry<String, String> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}