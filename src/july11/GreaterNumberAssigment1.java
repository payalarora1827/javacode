package july11;
import java.util.Scanner;
public class GreaterNumberAssigment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String input;
        char input ;
        do{
        System.out.println("Input First number");
        int n1 = scanner.nextInt();
        System.out.println("Input Second number");
        int n2 = scanner.nextInt();
        System.out.println("Input Third number");
        int n3 = scanner.nextInt();

            if (n1 > n2 && n1 > n3)
            {
                System.out.println("Second numnber is largest " + n1);
            } else if (n2 > n3) {
                System.out.println("Second numnber is largest " + n2);
            } else if (n1 == n2 && n2 == n3) {
                System.out.println("All numbers are equal");
            }
            else
            {
                System.out.println("Third numnber is largest " + n3);
            }
            System.out.println("Do you want to exit? Press y for Yes and Press n for No");
            //input = scanner.next();
            input = scanner.next().charAt(0);

        }while(input!='y');
    }
    }

