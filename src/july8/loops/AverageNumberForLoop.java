package july8.loops;
import java.util.Scanner;
public class AverageNumberForLoop
{
    public static void main(String[] args)
    {

        System.out.println("Input the 5 numbers : ");
        int number = 0;
        int sum=0;
        int avg;
        for(int i=0;i<5;i++)
        {
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            System.out.println("Value Input is  "+number);
            sum = sum + number;
        }
        avg = sum/5;
        System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);


    }
}
