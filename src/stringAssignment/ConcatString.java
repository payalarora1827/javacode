package stringAssignment;
import java.util.Scanner;
public class ConcatString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First String ");
        String first = scanner.next();
        System.out.println("Enter the Second String ");
        String second = scanner.next();
        String concat=first.concat(second);
        System.out.println("Concat String: " +concat);
    }
}
