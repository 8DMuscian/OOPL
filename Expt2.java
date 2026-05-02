import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Expt2 {
    public static void main(String[] args) {

        // Input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        //Integer Array
        System.out.println("Enter " + n + " integers:");
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        //String Array
        String[] words = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        sc.close();

        // Ascending Sort
        Arrays.sort(numbers);
        Arrays.sort(words);
        System.out.println("Ascending Numbers: " + Arrays.toString(numbers));
        System.out.println("Ascending Words: " + Arrays.toString(words));

        // Descending Sort using Collections.reverseOrder()
        Arrays.sort(numbers, Collections.reverseOrder());
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println("Descending Numbers: " + Arrays.toString(numbers));
        System.out.println("Descending Words: " + Arrays.toString(words));
    }
}