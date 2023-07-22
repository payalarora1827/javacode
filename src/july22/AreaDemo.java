package july22;
import java.util.Scanner;
public class AreaDemo {
    public static void main(String[] args) {

        int num[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");

        for(int i =0;i<num.length;i++)
        {
            num[i] = s.nextInt();

        }
        for(int i =0;i<5;i++)
        {
            System.out.println(num[i]);
        }
    }
}
