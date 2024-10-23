package OddEven;
import java.util.Scanner;

public class NumerOperation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.printf("Input a Number: ");
                int num = scanner.nextInt();

                if(num % 2 ==0 ) {
                    System.out.println(num+" is even");
                    } else {
                        System.out.println(num+" is odd");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input...");
            } 
        scanner.close();
        // closing the scanner
    }
}