import java.util.*;

class P06_ATMBalance {
    public static void main(String[] args) {
        HashMap<String, Double> accounts = new HashMap<>();
        accounts.put("A1", 1000.0); accounts.put("A2", 5000.0);
        accounts.put("A3", 200.0); accounts.put("A4", 1500.0);
        
        // Deposit
        accounts.put("A1", accounts.getOrDefault("A1", 0.0) + 500.0);
        
        // Withdraw
        String acc = "A2";
        double amount = 1000.0;
        if (accounts.containsKey(acc) && accounts.get(acc) >= amount) {
            accounts.put(acc, accounts.get(acc) - amount);
        }
        
        System.out.println("Balance of A1: " + accounts.get("A1"));
        System.out.println("Balance of A2: " + accounts.get("A2"));
        System.out.println("Balance of A3: " + accounts.get("A3"));
        System.out.println("Balance of A4: " + accounts.get("A4"));
    }
}