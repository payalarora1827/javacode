package july22;
import java.util.Scanner;
public class AreaString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values");
        int input = scanner.nextInt();
        String fruits[] = new String[input];
        for(int i =0;i<fruits.length;i++)
        {
            fruits[i] = scanner.next();

        }
        for(int i =0;i<input;i++)
        {
            System.out.println(fruits[i]);
        }

    }
}
