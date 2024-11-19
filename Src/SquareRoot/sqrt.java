/*
 * Squareroot, cuberoot and square using the Math.sqrt function
 * 
 * 
 * function: Math.sqrt, Math.cbrt, 
 * squre == num * num;
 */

package SquareRoot;

import java.util.Scanner;

public class sqrt {
    public static void main(String args[]) {
        
        try (Scanner in = new Scanner(System.in)) {
            
                // Read the number from the user
                System.out.print("Enter the number: ");
                int num = in.nextInt();
                
                double sqrtValue = Math.sqrt(num);
                double cbrtValue = Math.cbrt(num);
                int square = num*num;
                
                // Print the results
                System.out.println("Square root of " + num + " = " + sqrtValue);
                System.out.println("Cube root of " + num + " = " + cbrtValue);         
                System.out.println("Square of "+ num + " is: "+ square);
		    } catch (Exception e) {
                System.out.println("Invalid input...");
        }
    }
}
