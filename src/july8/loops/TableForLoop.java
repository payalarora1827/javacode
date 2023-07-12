package july8.loops;

import java.util.Scanner;

public class TableForLoop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        int num = scanner.nextInt();
        for(int i=1;i <= 10;i++)
        {
            System.out.println(+num+" * " +i+ " = " +num * i);
        }
    }
}
