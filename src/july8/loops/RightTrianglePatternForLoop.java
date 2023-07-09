package july8.loops;

import java.util.Scanner;

public class RightTrianglePatternForLoop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scanner.nextInt();
        int i;
        int j;
        //int row=6;
        for(i=0; i<row; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
