import java.util.*;

class P11_Parenthesis {
    public static void main(String[] args) {
        String code = "{[()]}";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean valid = true;
        
        for (char ch : code.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) { valid = false; break; }
                char top = stack.pop();
                if ((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')) {
                    valid = false; break;
                }
            }
        }
        if (!stack.isEmpty()) valid = false;
        System.out.println("Code is: " + (valid ? "Valid" : "Invalid"));
    }
}