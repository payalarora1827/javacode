package stringAssignment;
import java.util.Scanner;
public class SearchCharacterString
{
    public static void main(String[] args)
    {
        String str = "Pragra";
        System.out.println("String: "+str);
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        char[] arr = new char[str.length()];
        System.out.println("Enter the element to be seached");
        char search = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++)
        {
            arr[i] = str.charAt(i);
            if (arr[i] == search)
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
