import java.util.*;

class P18_SubjectGroups {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> groups = new HashMap<>();
        
        groups.computeIfAbsent("Math", k -> new ArrayList<>()).addAll(Arrays.asList("S1", "S2", "S3"));
        groups.computeIfAbsent("Physics", k -> new ArrayList<>()).addAll(Arrays.asList("S2", "S3", "S4"));
        groups.computeIfAbsent("CS", k -> new ArrayList<>()).addAll(Arrays.asList("S1", "S4", "S5"));
        
        System.out.println("Math students: " + groups.getOrDefault("Math", new ArrayList<>()));
        
        String target = "S2";
        System.out.print(target + " is in: ");
        for (Map.Entry<String, ArrayList<String>> e : groups.entrySet()) {
            if (e.getValue().contains(target)) System.out.print(e.getKey() + " ");
        }
        System.out.println();
    }
}