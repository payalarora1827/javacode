package july8.loops;
import java.util.Scanner;
public class NaturalNumDoWhileLoop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        int i=1;
        int sum=0;
        do
        {
            sum = sum +i;
            i++;
        }while(i <= num);
        System.out.println("Sum of "+num+" numbers is :"+sum);
    }
}

