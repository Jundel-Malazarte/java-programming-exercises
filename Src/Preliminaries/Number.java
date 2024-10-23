// This program demonstrates the use of the Math class.
// Enter an integer number and the program will display
// its square root, square, and cube.

package Preliminaries;
import java.util.*;

public class Number {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int num;

      System.out.print("Please input a number: ");
      num = scan.nextInt();

      System.out.printf("The square root of %d is %f.\n", num, Math.sqrt(num));
      System.out.printf("The square of %d is %f.\n", num, Math.pow(num, 2));
      System.out.printf("The cube of %d is %d.\n", num, num * num * num);

      scan.close();
   }
}


/*
Java Preliminaries
--Simple I/O
--Java Identifiers/Names
--Java Variables -> declaration
--Java Constants -> declaration
--Java Modifiers
--Java Data Types
   -Numeric Promotion (among expressions)
   -Automatic Initialization (field variables)
--Java Literals
--Java Operators
--Java Expressions
--Java Comments
*/

/**
This is a class that blah blah blah
*/


/*
Identifiers/Names
--Keywords (reserved) cannot be used as a name or identifier
--class/interface/exceptions/enums --use CamelCase --- ex. MyFirstJavaProgram
--methods --use camelCase() --- ex. nextInt()
--variables --use camelCase --- ex. tuitionFee
--constants --use UPPER_CASE --- ex. GRAVITATIONAL_FORCE
NAMING CONVENTIONS 
*/

/*
DATA TYPES

primitive data types = 8
   byte -2^8 up to 2^8-1 ----- -128 up to 127
   short -2^18 up to 2^16-1 ----- -32768 up to 32767
   int -2^32 up to 2^32-1
   long -2^64 up to 2^64-1
   
   char 0 up to 32767 (UNICODE)
         ALT+65 == 'A'
         ALT+165 == enyeee
   
   float -2^32 up to 2^32-1
   double -2^64 up to 2^64-1
   
   boolean true/false
   

Object data type = all classes, interfaces whether pre-defined or user-defined can be used as an Object DT
*/

/*
JAVA LITERALS

10 --- automatic integer literal or value
10L --- long literal
10f --- float literal
10lf --- double literal
10.67 -- automatic double literal
'D' --- character literal
"goodbye" --- String literal
true --- boolean literal
*/

/*
OPERATORS are  someting that acts upon an operand or literal

Unary Operators (only one operand)
+10  ---- unary plus
-10 ---- unary minus
!true ---- false
!(10>100) ---- true

Binary (two operands --left and right)
10 + 20 

Arithmetic Operators (binary)
   + Addition
   - SUbtraction
   * Multiplication
   / Division
   % Modulo / Remainder ex.   100 % 5 ---- 0
                              5 % 100 ---- 5
                              1000 % 109785  ---- 1000 because 1000 div 109785 is 0 remainder 1000

Relational Operators (binary, answer is always boolean true or false)
   < less than
   > greater than
   <= less than or equal
   >= greater than or equal
   == equal    ex. num == 78
   != not equal  ex. 102 != 100+2 ------ false

Logical Operators
   &  regular AND             ex. 100>20 & (Math.sqrt(25) == 5) --- true
   && short-circuit AND       ex. 100>20 && (Math.sqrt(25) == 5) --- true
   | regular OR               ex. 100>20 | (Math.sqrt(25) == 5) --- true
   || short-circuit OR        ex. 100>20 || (Math.sqrt(25) == 5) --- true
   ! NOT 
   ^ Exclusive OR
   
   truth table
   A     B        AND(&/&&)     OR(|/||)     EX-OR(^)
   true  true     true           true        false
   true  false    false          true        true
   false true     false          true        true
   false false    false          false       false
    
Assignment
   = ----- read as 'gets the value of', 'has', 'is assigned with' ex. num = 78;
   += ---- adding value to the variable and assigning the result to the same variable ex. num+=34; ----- num = num+34;
   -=   num-=34  ------ num = num - 34
   *=
   /=
   %= num %=34 -------- num = num % 34
   

Increment(++)/Decrement(--)
   increment to add 1
      num++; ------ post increment  ex. int num=90;  num++; is equivalent to num = num + 1;  ----- 91
      ++num; ------ pre increment   ex. int num=90;  ++num; is equivalent to num = num + 1;
   decrement to minus 1
      num--; ---- post decrement    ex. int num=90;  num--; is equivalent to num = num - 1;  ----- 89
      --num; ---- pre decrement     ex. int num=90;  num--; is equivalent to num = num - 1;  ----- 89

Ternary (three operands)

?: ------ simple if-else statement
condition?true:false;
ex.   num = 23>97?1000:100000;
      System.out.println(100*10==1001? "Hello" : "Goodbye");
      
      equivalent to:
         if(100*10==1001)
            System.out.println("Hello");
         else
            System.out.println("Goobye");

*/

/*
10
10 + 5
10 - 9 -5 *50 /34
23 /

int a = 10;
long b = 100;
double x = 23.5;
float y = 78.6;

a + b - x * y  -------- 6789.9

byte, byte ------- int
byte, short ------int
short, short ------int
int short byte --------int
int int long short byte ------- long

int long double short -------double
int short long double float chat byte String ------ String


*/

//  single line comment


/*
multiple 
line
            comment
*/

/**
Javadoc 
comment
*/