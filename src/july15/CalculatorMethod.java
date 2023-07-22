package july15;

import java.util.Scanner;

public class CalculatorMethod
{
public static void cal()

    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Here are your options:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("What would you like to do?: ");
        System.out.println();
        int input = scanner.nextInt();
        if (input == 1) {
            addition(10, 20, 30);
        } else if (input == 2) {

            subtraction(10, 5);
        } else if (input == 3) {

            multiplication(2, 4, 5);
        } else if (input == 4) {
            mod(10, 5);
        } else if (input == 5) {
            division(10, 5);
        } else {
            System.out.print("Wrong Input");
        }
    }
    public static void addition(int n1, int n2, int n4)
    {
        int n3 = n1 + n2 + n4;
        System.out.print(n3);
    }
    public static void subtraction(int n1,int n2)
    {
        int n3 = n1 - n2;
        System.out.print(n3);
    }
    public static void multiplication(int n1, int n2, int n4)
    {

        int n3 = n1 * n2 * n4;
        System.out.print(n3);

    }
    public static void mod(int n1,int n2)
    {
        int n3 = n1 % n2;
        System.out.print(n3);
    }
    public static void division(int n1,int n2)
    {
        int n3 = n1 / n2;
        System.out.print(n3);
    }

}
