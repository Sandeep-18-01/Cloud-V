import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Original array: " + Arrays.toString(arr));

        shuffleArray(arr);

        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }

    // Function to shuffle an array using Fisher-Yates shuffle algorithm
    private static void shuffleArray(int[] arr) {
        Random random = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Swap the elements at index i and index
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
