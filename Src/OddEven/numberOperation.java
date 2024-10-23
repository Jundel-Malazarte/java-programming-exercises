package OddEven;
import java.util.Scanner;

public class numberOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numArray = {1, 2, 3, 4, 5};

        int Odds = numArray[0]*numArray[2]*numArray[4];
        int Even = numArray[1]+numArray[3];

        System.out.println("Sum of even numbers is = "+ Even);
        System.out.println("Sum of odd numbers is = "+ Odds);
        
        
        /* 
          if(numArray[1]%2==0){
            System.out.println(numArray[1]+" is even");
        } else if(numArray[3]%2==0){
            System.out.println(numArray[3]+" is even");
        } else {
            System.out.println("invalid input");
        }
        */
       

       // closing the scanner
        scanner.close();
    }
    
}
