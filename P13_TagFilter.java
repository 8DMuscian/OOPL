import java.util.*;

class P13_TagFilter {
    public static void main(String[] args) {
        HashSet<String> tags = new HashSet<>();
        tags.addAll(Arrays.asList("sale", "new", "electronics", "sale", "gadget", "new", "top", "deal", "electronics", "hot"));
        System.out.println("Unique tags (" + tags.size() + "): " + tags);
        
        HashSet<String> prod1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        HashSet<String> prod2 = new HashSet<>(Arrays.asList("b", "c", "d"));
        prod1.retainAll(prod2);
        
        System.out.println("Common tags: " + prod1);
    }
}