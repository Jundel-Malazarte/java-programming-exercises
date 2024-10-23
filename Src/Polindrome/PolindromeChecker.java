package Polindrome;
import java.util.Scanner;

public class PolindromeChecker {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

      int r,sum=0,temp;    
      int n=454;//It is the number variable to be checked for palindrome  
  
      temp=n;    
      
      while (n > 0) {    
        r=n%10;  //getting remainder  
        sum=(sum*10)+r;    
        n=n/10;    
      }    
      // Condition for palindromic number
      if(temp==sum)    
        System.out.println("palindrome number ");    
      else {
        System.out.println("not palindrome");  
      }    
      scanner.close();
    }   
}