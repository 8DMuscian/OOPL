import java.util.*;

class P09_TicketQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        for (int i = 1; i <= 5; i++) queue.offer("Ticket" + i);
        System.out.println("Initial queue: " + queue);
        
        System.out.println("Processing: " + queue.poll());
        System.out.println("Processing: " + queue.poll());
        
        queue.offer("Ticket6"); 
        queue.offer("Ticket7");
        
        System.out.println("Next in line: " + queue.peek());
        System.out.println("Queue size: " + queue.size() + ", Empty? " + queue.isEmpty());
        System.out.println("Final queue: " + queue);
    }
}