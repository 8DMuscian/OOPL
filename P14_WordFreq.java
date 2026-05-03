import java.util.*;

class P14_WordFreq {
    public static void main(String[] args) {
        String review = "the great product is great and the product is good";
        HashMap<String, Integer> freq = new HashMap<>();
        
        for (String word : review.split(" ")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sorting descending by frequency
        
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}