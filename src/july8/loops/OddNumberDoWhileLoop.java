package july8.loops;

import java.util.Scanner;

public class OddNumberDoWhileLoop {
    public static void main(String[] args)
    {
        int odd;
        int sum = 0;
        int i=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the input");
        int num = scanner.nextInt();
        System.out.println("The Odd Numbers are");
       do {
            odd= 2*i-1;
            System.out.println(odd);
            sum = sum + odd;
            i++;

        }while(i<=num);
        System.out.println ("The Sum of odd Number upto " +num+" terms is: " +sum);

    }
}
