import java.util.*;

class P16_StudentRank {
    public static void main(String[] args) {
        TreeMap<Integer, String> ranks = new TreeMap<>();
        ranks.put(85, "Alice"); ranks.put(92, "Bob"); ranks.put(78, "Charlie");
        ranks.put(95, "David"); ranks.put(88, "Eve"); ranks.put(60, "Frank");
        
        System.out.println("Rank List: " + ranks.descendingMap());
        System.out.println("Topper: " + ranks.lastEntry().getValue() + " (" + ranks.lastKey() + ")");
        System.out.println("Weakest: " + ranks.firstEntry().getValue() + " (" + ranks.firstKey() + ")");
    }
}