import java.util.Scanner;

public class Expt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Factorial");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter two numbers: ");
                System.out.println("Result: " + (sc.nextDouble() + sc.nextDouble()));
                break;
            case 2:
                System.out.print("Enter two numbers: ");
                double sub1 = sc.nextDouble();
                double sub2 = sc.nextDouble();
                System.out.println("Result: " + (sub1 - sub2));
                break;
            case 3:
                System.out.print("Enter two numbers: ");
                System.out.println("Result: " + (sc.nextDouble() * sc.nextDouble()));
                break;
            case 4:
                System.out.print("Enter two numbers: ");
                double div1 = sc.nextDouble();
                double div2 = sc.nextDouble();
                if (div2 == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    System.out.println("Result: " + (div1 / div2));
                }
                break;
            case 5:
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }
                System.out.println("Result: " + fact);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        sc.close();
    }
}