import java.util.*;

class P20_OrderSystem {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i = 1; i <= 6; i++) queue.offer("Ord" + i);
        
        System.out.println("Processing: " + queue.poll());
        
        queue.offer("Ord7"); 
        queue.offer("Ord8");
        
        System.out.println("Processing: " + queue.poll());
        System.out.println("Next order: " + queue.peek());
        System.out.println("Remaining size: " + queue.size() + ", Empty? " + queue.isEmpty());
        
        while (!queue.isEmpty()) queue.poll();
        System.out.println("Final queue: " + queue);
    }
}