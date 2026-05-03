import java.util.*;

class P12_TicketBooking {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i = 1; i <= 6; i++) queue.offer("Pass" + i);
        
        for (int i = 0; i < 3; i++) System.out.println("Now serving: " + queue.poll());
        
        queue.offer("Pass7"); 
        queue.offer("Pass8");
        
        System.out.println("Next up: " + queue.peek());
        System.out.println("Remaining: " + queue.size() + " Empty? " + queue.isEmpty());
    }
}