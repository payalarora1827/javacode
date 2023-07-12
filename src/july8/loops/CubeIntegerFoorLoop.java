package july8.loops;
import java.util.Scanner;
public class CubeIntegerFoorLoop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        for(int i=1; i<=num; i++)
        {
            System.out.println("the cube of " + i + " is " + i*i*i);
        }

    }
}
