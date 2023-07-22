package july22;
import java.util.Scanner;
public class ArrayForEach {
    public static void main(String[] args) {
        int num[] = new int[3];
        num[0] = 10;
        num[1] = 10;
        num[2] = 10;
       /* Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        for(int i =0;i<num.length;i++)
        {
            num[i] = s.nextInt();

        }*/
        for(int n : num)
        {
            System.out.println(n);
        }
    }
}
