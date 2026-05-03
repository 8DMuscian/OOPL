import java.util.*;

class P19_UndoFeature {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = 1; i <= 5; i++) stack.push("State " + i);
        
        for (int i = 0; i < 3; i++) {
            if (!stack.isEmpty()) System.out.println("Restoring: " + stack.pop());
        }
        
        System.out.println("Current: " + (stack.isEmpty() ? "None" : stack.peek()));
        System.out.println("Stack size: " + stack.size());
    }
}