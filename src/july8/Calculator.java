package july8;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press number");
        int input = scanner.nextInt();
        if (input == 1)
        {
            System.out.print("Enter your first number");
            int n1 = scanner.nextInt();
            System.out.print("Enter your Second  number");
            int n2 = scanner.nextInt();
            int n3 = n1 + n2;
            System.out.print(n3);
        }
        else if (input == 2) {
            System.out.print("Enter your first number");
            int n1 = scanner.nextInt();
            System.out.print("Enter your Second  number");
            int n2 = scanner.nextInt();
            int n3 = n1 - n2;
            System.out.print(n3);

        }
        else if (input == 3) {
            System.out.print("Enter your first number");
            int n1 = scanner.nextInt();
            System.out.print("Enter your Second  number");
            int n2 = scanner.nextInt();
            int n3 = n1 * n2;
            System.out.print(n3);

        }
        else if (input == 4) {
            System.out.print("Enter your first number");
            int n1 = scanner.nextInt();
            System.out.print("Enter your Second  number");
            int n2 = scanner.nextInt();
            int n3 = n1 % n2;
            System.out.print(n3);
        }
        else if (input == 5)
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
