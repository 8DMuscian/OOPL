import java.util.*;

class P04_MusicQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("Song 1");
        queue.addLast("Song 2");
        queue.addFirst("Urgent Song");
        
        System.out.println("Up next: " + queue.peekFirst());
        System.out.println("Playing: " + queue.removeFirst());
        System.out.println("Playing: " + queue.removeFirst());
        System.out.println("Playing: " + queue.removeFirst());
        System.out.println("Queue size: " + queue.size());
    }
}