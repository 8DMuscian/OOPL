import java.util.*;

class P08_Supermarket {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>(Arrays.asList(150.0, 50.0, 200.0, 100.0, 30.0, 80.0));
        
        double subtotal = 0;
        for (double p : prices) subtotal += p;
        
        double discount = (subtotal > 500) ? subtotal * 0.10 : 0;
        Collections.sort(prices);
        
        System.out.println("Itemised (Sorted): " + prices);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final: " + (subtotal - discount));
    }
}