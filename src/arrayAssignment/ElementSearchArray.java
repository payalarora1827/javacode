package arrayAssignment;
import java.util.Scanner;
public class ElementSearchArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int flag = 0;
        int input = scanner.nextInt();
        int num[] = new int[input];
        for (int i = 0; i < num.length; i++)
        {
            num[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to be seached");
        int search = scanner.nextInt();
        for (int i = 0; i < input; i++)
        {
            if (num[i] == search)
            {
                System.out.println("Element " + search + " found at " + i + " position");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println("Element " + search + " not found");
        }
    }
}

