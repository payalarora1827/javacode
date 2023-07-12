package july8.loops;

import java.util.Scanner;

public class OddNumberForLoop {
    public static void main(String[] args)
    {
        int odd;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the input");
        int num = scanner.nextInt();
        System.out.println("The Odd Numbers are");
        for(int i=1;i<=num;i++)
        {
            odd= 2*i-1;
            System.out.println(odd);
            sum = sum + odd;

        }
        System.out.println ("The Sum of odd Number upto " +num+" terms is: " +sum);
    }
}
