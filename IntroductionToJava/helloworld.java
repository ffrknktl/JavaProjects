package IntroductionToJava;
import java.util.Scanner;
public class helloworld {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");    
    int x = input.nextInt();
    System.out.print("Enter the second number: ");
    int y = input.nextInt();

    int count = x + y;
    System.out.println("The sum of two number is: " + count);

}
    
}