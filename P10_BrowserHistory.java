import java.util.*;

class P10_BrowserHistory {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = 1; i <= 5; i++) stack.push("url" + i + ".com");
        
        System.out.println("Current Page: " + stack.peek());
        System.out.println("Going back to: " + stack.pop());
        System.out.println("Going back to: " + stack.pop());
        System.out.println("History size: " + stack.size() + ", Empty? " + stack.isEmpty());
    }
}