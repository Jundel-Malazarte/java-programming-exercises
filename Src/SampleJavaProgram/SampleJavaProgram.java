//heirarchy of a java program

//package
//-----class
//-----------methods in Java aka functions in C/C++
//-----------------statements/block of statements

package SampleJavaProgram; // Package name

import java.util.Scanner; //#include<stdio.h>
    public class SampleJavaProgram { //start of class
        public static void main(String args[]) { //start of method

            System.out.print("Hello World!!!\n\n\n\n"); //equivalent to printf in C or cout in C++
            System.out.println("Hello, Universe!!!"); //statement
            
            try (Scanner scan = new Scanner(System.in)) {
                System.out.print("Input x: ");
                int x = scan.nextInt();
                
                System.out.print("Input y: ");
                int y = scan.nextInt();
                
                int sum = x + y; //+ is used for addition
                
                System.out.printf("The sum of %d and %d is %d.",x,y,sum); // + is used for concatenation
                } catch(Exception e) {
                    System.out.println("Invalid... input only integers");
                }
        } //end of method
}//end of class

class A {
    // Function here !
}

class B {
    // Funtion here
}

//Java Preliminaries
/*
1. Java Comments
2. Literals
3. Operators
4. Expressions
*/

