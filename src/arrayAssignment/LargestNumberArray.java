package arrayAssignment;
import java.util.Scanner;
public class LargestNumberArray {
    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        for(int i =0;i<num.length;i++)
        {
            num[i] = s.nextInt();

        }
        int max = num[0];

        for(int i =0;i<num.length;i++)
        {
            if(num[i] > max)
            {
                max = num[i];
            }
        }
        System.out.println("Largest element present in given array: " + max);
    }
}

