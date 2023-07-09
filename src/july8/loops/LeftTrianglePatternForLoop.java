package july8.loops;
import java.util.Scanner;
public class LeftTrianglePatternForLoop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int row = scanner.nextInt();
        int i;
        int j;
        for (i=0; i<row; i++)
        {
            for (j=2*(row-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

