package july8.loops;
import java.util.Scanner;
public class CubeIntegerDoWhileLoop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();
        int i=1;
        do{
            System.out.println("the cube of " + i + " is " + i*i*i);
            i++;
        }while(i<=num);
    }
}
