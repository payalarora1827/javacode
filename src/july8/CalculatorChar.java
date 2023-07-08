package july8;
import java.util.Scanner;

public class CalculatorChar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any one Character");
        System.out.println("Input +");
        System.out.println("Input -");
        System.out.println("Input *");
        System.out.println("Input %");
        System.out.println("Input /");
        char ch = scanner.next().charAt(0);
        if (ch == '+')
        {
            System.out.println("Enter your first number ");
            int n1 = scanner.nextInt();
            System.out.println("Enter your Second  number ");
            int n2 = scanner.nextInt();
            int n3 = n1 + n2;
            System.out.println(n3);
        }
        else if (ch == '-') {
            System.out.println("Enter your first number ");
            int n1 = scanner.nextInt();
            System.out.print("Enter your Second  number ");
            int n2 = scanner.nextInt();
            int n3 = n1 - n2;
            System.out.println(n3);

        }
        else if (ch == '*') {
            System.out.println("Enter your first number ");
            int n1 = scanner.nextInt();
            System.out.println("Enter your Second  number ");
            int n2 = scanner.nextInt();
            int n3 = n1 * n2;
            System.out.print(n3);

        }
        else if (ch == '%') {
            System.out.print("Enter your first number");
            int n1 = scanner.nextInt();
            System.out.print("Enter your Second  number");
            int n2 = scanner.nextInt();
            int n3 = n1 % n2;
            System.out.print(n3);
        }
        else if (ch == '/')
        {
            System.out.print("Enter your first number");
            int n1 = scanner.nextInt();
            System.out.print("Enter your Second  number");
            int n2 = scanner.nextInt();
            int n3 = n1 / n2;
            System.out.print(n3);
        }
        else {
            System.out.print("Wrong Input");
        }

    }

}
