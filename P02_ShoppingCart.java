import java.util.*;

class P02_ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>(Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Cables"));
        String itemToRemove = "Mouse";
        
        if (cart.contains(itemToRemove)) {
            cart.remove(itemToRemove);
        }
        
        System.out.println("Items in cart (" + cart.size() + "): " + cart);
        System.out.println("Is cart empty? " + cart.isEmpty());
    }
}