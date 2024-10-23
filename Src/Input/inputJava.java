package Input;
import java.util.Scanner;

public class inputJava {
        public static void main(String[] args) {
            Scanner Input = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int number = Input.nextInt();
            System.out.println(number);

            Input.close();

        }
}
