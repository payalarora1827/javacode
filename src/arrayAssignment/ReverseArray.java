package arrayAssignment;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        //int num[] = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value: ");

        int input = scanner.nextInt();
        int num[] = new int[input];
        for (int i = 0; i < num.length; i++)
        {
            num[i] = scanner.nextInt();

        }
        System.out.println("Original array: ");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = num.length-1; i >= 0; i--)
        {
            System.out.print(num[i] + " ");
        }
    }
}
