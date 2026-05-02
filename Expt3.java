public class Expt3 {
    public static void main(String[] args) {
        String str = "Java Programming Is Fun";
        System.out.println("Original: " + str);
        
        char[] normalized = str.toLowerCase().toCharArray();

        //Count vowels and consonants
        int vowels = 0, consonants = 0;
        for (char c : normalized) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
            else if (c >= 'a' && c <= 'z') consonants++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

        //Replace spaces
        System.out.println("Replaced Spaces: " + str.replace(" ", "_"));

        //Uppercase and Lowercase
        System.out.println("Upper: " + str.toUpperCase());
        System.out.println("Lower: " + str.toLowerCase());

        //Reverse using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed: " + sb.reverse());
    }
}