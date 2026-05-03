import java.util.*;

class P17_PhoneDir {
    public static void main(String[] args) {
        TreeMap<String, String> dir = new TreeMap<>();
        dir.put("Alice", "111"); dir.put("Bob", "222"); dir.put("Charlie", "333");
        dir.put("David", "444"); dir.put("Eve", "555"); dir.put("Frank", "666");
        dir.put("Grace", "777"); dir.put("Heidi", "888");
        
        System.out.println("Directory: " + dir);
        System.out.println("Find Bob: " + dir.get("Bob"));
        System.out.println("Contacts C to E: " + dir.subMap("C", "F")); // 'F' exclusive, covers C to E
        System.out.println("First: " + dir.firstKey() + ", Last: " + dir.lastKey());
    }
}