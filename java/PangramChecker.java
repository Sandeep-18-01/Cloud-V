import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        String input1 = "The quick brown fox jumps over the lazy dog";
        String input2 = "Hello World";
        String op = ("abcdefghijklmnopqrstuvwxyz").toUpperCase();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a PangramChecker String: ");
        String PangramChecker = scanner.nextLine();
        System.out.println("Input 2 is a pangram: " + isPangram(input1));
        System.out.println("Input 2 is a pangram: " + isPangram(input2));
        System.out.println("op is a pangram: " + isPangram(op));
        System.out.println("PangramChecker for your input String is " +
                isPangram(PangramChecker));
        scanner.close();
    }

    // Function to check if a string is a pangram
    private static boolean isPangram(String input) {
        // Convert the input to lowercase to ignore case
        // input = input.toLowerCase();

        // Create a boolean array to mark if a letter is found
        boolean[] found = new boolean[26];

        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            if (c - 'A' < 0 || c - 'A' >= 26) {
                continue;
            }
            if (Character.isLetter(c)) {
                // Mark the corresponding index in the boolean array
                found[c - 'A'] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are found
        for (boolean b : found) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
