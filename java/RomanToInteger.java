import java.util.Scanner;

public class RomanToInteger {
	// Function to get the integer value of a Roman numeral character
	int getRomanValue(char romanChar) {
		switch (romanChar) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return -1; // Invalid Roman numeral
		}
	}

	// Function to convert a Roman numeral to an integer
	int romanToInteger(String romanNumeral) {
		int result = 0;

		for (int i = 0; i < romanNumeral.length(); i++) {
			int currentValue = getRomanValue(romanNumeral.charAt(i));

			if (i + 1 < romanNumeral.length()) {
				int nextValue = getRomanValue(romanNumeral.charAt(i + 1));

				// If current value is greater than or equal to the next value, add it to the
				// result
				if (currentValue >= nextValue) {
					result += currentValue;
				} else { // If current value is less than the next value, subtract it from the result
					result += nextValue - currentValue;
					i++; // Move to the next character
				}
			} else { // Last character
				result += currentValue;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		RomanToInteger converter = new RomanToInteger();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Roman numeral: ");
		String inputRomanNumeral = scanner.nextLine().toUpperCase(); // Convert to uppercase for simplicity
		scanner.close();
		int integerValue = converter.romanToInteger(inputRomanNumeral);
		if (integerValue < 0) {
			System.out.println("Not a valid Roman numeral.");
		} else {
			System.out.println("Integer form of Roman numeral is: " + integerValue);
		}
	}
}
