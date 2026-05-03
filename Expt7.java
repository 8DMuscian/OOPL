import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }
    
    //When println(products) is called it will use defaulat toString() method which will print the memory address of the object.
    //To print the actual content of the object we need to override the toString() method
    @Override
    public String toString() {
        return name + " (" + price + ")"; 
    }
}

public class Expt7 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Add
        products.add(new Product(1, "Laptop", 1200.00));
        products.add(new Product(2, "Mouse", 25.50));
        products.add(new Product(3, "Keyboard", 75.00));

        // Update price
        for (Product p : products) {
            if (p.id == 2) p.price = 20.00; 
        }

        // Remove
        products.removeIf(p -> p.id == 3); // Remove object which contains id 3

        // Sort by price (Custom Comparator)
        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("Sorted by Price: " + products);

        // Sort by name (Custom Comparator)
        products.sort(Comparator.comparing(p -> p.name));
        System.out.println("Sorted by Name: " + products);
    }
}