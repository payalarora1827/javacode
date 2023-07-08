package july8;
import java.util.Scanner;
public class CalculatorSwitchChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any one Character");
        System.out.println("Input +");
        System.out.println("Input -");
        System.out.println("Input *");
        System.out.println("Input %");
        System.out.println("Input /");
        char input = scanner.next().charAt(0);
        int n1;
        int n2;
        int n3;
        switch(input)
        {
            case '+' :
                System.out.println("Enter your first number");
                n1 = scanner.nextInt();
                System.out.println("Enter your Second  number");
                n2 = scanner.nextInt();
                n3 = n1 + n2;
                System.out.print(n3);
                break;
            case '-' :
                System.out.println("Enter your first number");
                n1 = scanner.nextInt();
                System.out.println("Enter your Second  number");
                n2 = scanner.nextInt();
                n3 = n1 - n2;
                System.out.print(n3);
                break;
            case '*' :
                System.out.println("Enter your first number");
                n1  = scanner.nextInt();
                System.out.println("Enter your Second  number");
                n2 = scanner.nextInt();
                n3  = n1 * n2;
                System.out.print(n3);
                break;
            case '%' :
                System.out.println("Enter your first number");
                n1 = scanner.nextInt();
                System.out.println("Enter your Second  number");
                n2 = scanner.nextInt();
                n3 = n1 % n2;
                System.out.println(n3);
                break;
            case '/' :
                System.out.println("Enter your first number");
                n1 = scanner.nextInt();
                System.out.println("Enter your Second  number");
                n2 = scanner.nextInt();
                n3 = n1 / n2;
                System.out.println(n3);
                break;
            default :
                System.err.println("Wrong Input");
                break;
        }

    }
}
