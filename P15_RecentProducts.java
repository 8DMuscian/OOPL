import java.util.*;

class P15_RecentProducts {
    public static void main(String[] args) {
        LinkedHashSet<String> history = new LinkedHashSet<>();
        String[] views = {"P1", "P2", "P3", "P4", "P5", "P6", "P2", "P7"};
        
        for (String p : views) {
            if (history.contains(p)) history.remove(p);
            history.add(p);
            
            if (history.size() > 5) {
                Iterator<String> it = history.iterator();
                it.next(); 
                it.remove();
            }
            System.out.println("History after viewing " + p + ": " + history);
        }
    }
}