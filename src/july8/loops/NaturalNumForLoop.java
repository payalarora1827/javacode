package july8.loops;
import java.util.Scanner;
public class NaturalNumForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i=1;i<=10;i++)
        {
            sum = sum +i;
        }
        System.out.println("Sum of "+num+" numbers is :"+sum);
    }
}
