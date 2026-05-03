import java.util.*;

class P03_Attendance {
    public static void main(String[] args) {
        ArrayList<String> attendance = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Heidi"));
        String target = "Charlie";
        
        System.out.println("Is " + target + " present? " + attendance.contains(target));
        System.out.println("Index of " + target + ": " + attendance.indexOf(target));
        System.out.println("Total present: " + attendance.size());
        System.out.println("List: " + attendance.toString());
    }
}