import java.util.Scanner;
public class biggest_number 
{
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("The biggest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("The biggest number is:"+y);
        }
        else
        {
            System.out.println("The biggest number is:"+z);
        }
 
    }
}
