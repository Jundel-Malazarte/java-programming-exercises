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

                
            //  A objA = new A(); //object of class A
            // B objB = new B(); //object of class B

            // objA.Hello();
            // objB.Test();
            
            // int x = 10;
            // int y = 20;
            // int sum = x + y;
            // System.out.printf("The sum of %d and %d is %d.",x,y,sum);

            // Calling the object 
            A objA = new A();
            objA.Hello();

            // calling out the 2nd object
            B objB = new B();
            objB.GoodBye();

        } //end of method
}//end of class

class A {
    // Funtion here
    void Hello () {
        System.out.println("Hello, Thanks for using this program!");
    }
    
    public A() {
        Hello(); // Call the Hello() method from the constructor
    }
}

class B {
    // Funtion here
    void GoodBye () {
        System.out.println("GoodBye , User!!!");
    }

    public B() {
        GoodBye(); // Call the Test() method from the constructor
    }

}

//Java Preliminaries
/*
1. Java Comments
2. Literals
3. Operators
4. Expressions
*/

