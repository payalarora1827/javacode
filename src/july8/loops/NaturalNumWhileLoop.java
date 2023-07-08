package july8.loops;
import java.util.Scanner;
public class NaturalNumWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int i=1;
        int sum = 0;
        while(i <= num)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+num+" numbers is :"+sum);

    }
}
