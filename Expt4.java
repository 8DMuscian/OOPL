class Product {
    int id; String name; double price;
    
    Product(int id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }
    
    void display() {
        System.out.println("------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }

    void applyDiscount() {
        System.out.println("No Discount: ₹" + price);
    }
}

class Electronics extends Product {
    int warranty;
    Electronics(int id, String name, double price, int warranty) {
        super(id, name, price); this.warranty = warranty;
    }
    
    @Override
    void display() {
        super.display(); 
        System.out.println("Warranty: " + warranty + " months");
    }

    @Override
    void applyDiscount() {
        System.out.println("(10% off): ₹" + (price * 0.90));
         System.out.println();
    }
}

class Clothing extends Product {
    String size;
    Clothing(int id, String name, double price, String size) {
        super(id, name, price); this.size = size;
    }
    
    @Override
    void display() {
        super.display(); 
        System.out.println("Size: " + size);
    }

    @Override
    void applyDiscount() {
        System.out.println("(20% off): ₹" + (price * 0.80));
         System.out.println();
    }
}

class Groceries extends Product {
    String expiry;
    Groceries(int id, String name, double price, String expiry) {
        super(id, name, price); this.expiry = expiry;
    }
    
    @Override
    void display() {
        super.display(); 
        System.out.println("Expiry: " + expiry);
    }

    @Override
    void applyDiscount() {
        System.out.println("(5% off): ₹" + (price * 0.95));
         System.out.println();
    }
}

public class Expt4 {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 1000, 12);
        Product p2 = new Clothing(2, "Shirt", 50, "M");
        Product p3 = new Groceries(3, "Milk", 5, "2026-05-10");

        p1.display();
        p1.applyDiscount();

        p2.display();
        p2.applyDiscount();

        p3.display();
        p3.applyDiscount();
    }
}