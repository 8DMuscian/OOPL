import java.util.*;

class P01_StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(45, 89, 72, 95, 33, 68, 77, 81, 54, 90));
        System.out.println("Marks: " + marks);
        System.out.println("Highest: " + Collections.max(marks));
        System.out.println("Lowest: " + Collections.min(marks));
        
        double sum = 0;
        for (int mark : marks) sum += mark;
        System.out.println("Average: " + (sum / marks.size()));
    }
}