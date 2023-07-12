package july8;

import java.util.Scanner;

public class CubeIntegerWhileLoop {
    public static void main(String[] args)
    {
        int i=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        while(i<=num)
        {
            System.out.println("the cube of " + i + " is " + i*i*i);
            i++;
        }
    }
}
