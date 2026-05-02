interface CardPayment {
    void processCardPayment(String cardNumber, String cvv, String expiry, double amount);
    void refundCardPayment(String cardNumber, double amount);
}

interface UPIPayment {
    void processUPIPayment(String upiId, double amount);
    void refundUPIPayment(String upiId, double amount);
}

class PaymentGateway implements CardPayment, UPIPayment {
    
    @Override
    public void processCardPayment(String cardNumber, String cvv, String expiry, double amount) {
        // Card validations
        if (cardNumber == null || cardNumber.length() != 16) {
            System.out.println("Card Error: Card number must be exactly 16 digits and cannot be null.");
            return;
        }
        if (cvv == null || cvv.length() != 3) {
            System.out.println("Card Error: CVV must be exactly 3 digits and cannot be null.");
            return;
        }
        if (expiry == null || expiry.length() != 5 || !expiry.contains("/")) {
            System.out.println("Card Error: Expiry must follow MM/YY format (5 characters) and cannot be null.");
            return;
        }
        
        System.out.println("Success: Processing Card Payment of ₹" + amount);
    }

    @Override
    public void refundCardPayment(String cardNumber, double amount) {
        System.out.println("Success: Refunding ₹" + amount + " to Card ending in " + cardNumber.substring(12));
    }

    @Override
    public void processUPIPayment(String upiId, double amount) {
        // UPI validations
        if (upiId == null || !upiId.contains("@")) {
            System.out.println("UPI Error: UPI ID cannot be null and must contain '@'.");
            return;
        }
        if (amount >= 100000) {
            System.out.println("UPI Error: Amount exceeds ₹1,00,000 limit. Transaction blocked.");
            return;
        }
        
        System.out.println("Success: Processing UPI Payment of ₹" + amount + " for " + upiId);
    }

    @Override
    public void refundUPIPayment(String upiId, double amount) {
        System.out.println("Success: Refunding ₹" + amount + " to UPI ID: " + upiId);
    }
}

public class Expt5 {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();

        System.out.println("TESTING CARD FAILURES :");
        gateway.processCardPayment(null, "123", "12/26", 5000); // Fails null check
        gateway.processCardPayment("1234", "123", "12/26", 5000); // Fails length check
        gateway.processCardPayment("1234567812345678", "12", "12/26", 5000); // Fails CVV length
        
        System.out.println("\nTESTING CARD SUCCESS :");
        gateway.processCardPayment("1234567812345678", "123", "12/26", 5000);

        System.out.println("\nTESTING UPI FAILURES :");
        gateway.processUPIPayment(null, 500); // Fails null check
        gateway.processUPIPayment("user_okhdfcbank", 500); // Fails '@' check
        gateway.processUPIPayment("user@okhdfcbank", 150000); // Fails limit check

        System.out.println("\nTESTING UPI SUCCESS :");
        gateway.processUPIPayment("user@okhdfcbank", 99999);
    }
}