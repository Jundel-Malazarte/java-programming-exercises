package Arrays; // folder name

import java.util.Arrays; // Import for sorting

public class Array {
    public static void main(String[] args) {
        // Declare and initialize an array of numbers
        int[] numbers = {2, 4, 6, 8, 10};

        // Access and modify an element
        numbers[2] = 12;

        // Print each element in the numbers array
        System.out.println("Number array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Declare and initialize an array of animal names
        String[] animals = {"Zebra", "Elephant", "Monkey", "Cat", "Dog", "Cow"};

        // Sort the array of animals
        Arrays.sort(animals);

        // Print each element in the sorted animals array
        System.out.println("\nSorted animal names:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    } // End of main
} // End of Array class

class Animals {
    void cow() {
        System.out.println("I am a cow! Mooooo...");
    }
    void dog() {
        System.out.println("I am a dog! Arf arf!");
    }
    void cat() {
        System.out.println("I am a cat! Meow, Meow!");
    }

    void elephant() {
        System.out.println("I am an elephant! Toot toot!");
    }
}
