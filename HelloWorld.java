import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // Array to be sorted
        int[] numbers = {12, 4, 8, 1, 5, 9, 3};

        // Sorting the array in ascending order
        Arrays.sort(numbers);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
