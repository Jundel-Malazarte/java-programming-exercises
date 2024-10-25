package Arrays; // folder name

public class Array {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {2, 4, 6, 8, 10};

        // Access and modify an element
        numbers[2] = 12;

        // Print each element using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    } // End of main
} // End of class
