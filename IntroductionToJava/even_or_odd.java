package IntroductionToJava;
import java.util.Scanner;
public class even_or_odd {
public static void main(String[] args) {
    int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
	}
}
    
}
