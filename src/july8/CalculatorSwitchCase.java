package july8;
import java.util.Scanner;
public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number");
        System.out.println("Press 1");
        System.out.println("Press 2");
        System.out.println("Press 3");
        System.out.println("Press 4");
        System.out.println("Press 5");
        int input = scanner.nextInt();
        int n1;
        int n2;
        int n3;

        switch(input)
        {
            case 1 :
                System.out.println("Enter your first number");
                n1 = scanner.nextInt();
                System.out.println("Enter your Second  number");
                n2 = scanner.nextInt();
                n3 = n1 + n2;
                System.out.print(n3);
                break;
              case 2 :
                    System.out.println("Enter your first number");
                    n1 = scanner.nextInt();
                    System.out.println("Enter your Second  number");
                    n2 = scanner.nextInt();
                    n3 = n1 - n2;
                    System.out.print(n3);
                    break;
            case 3 :
                System.out.println("Enter your first number");
                n1  = scanner.nextInt();
                System.out.println("Enter your Second  number");
                n2 = scanner.nextInt();
                n3  = n1 * n2;
                System.out.print(n3);
                break;
            case 4 :
                System.out.println("Enter your first number");
                n1 = scanner.nextInt();
                System.out.println("Enter your Second  number");
                n2 = scanner.nextInt();
                n3 = n1 % n2;
                System.out.println(n3);
                break;
            case 5 :
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

