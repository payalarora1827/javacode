package july8.loops;

import java.util.Scanner;

public class CubeIntegerWhileLoop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int i=1;
        while(i<=num)
        {
            System.out.println("the cube of " + i + " is " + i*i*i);
            i++;
        }

    }
}
