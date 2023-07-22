package july22;
import java.util.Scanner;
public class TwoDArrayDemo {
    public static void main(String[] args)
    {
        int arr[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                arr[i][j] = s.nextInt();
               // System.out.print(arr[i][j] + " ");

            }


        }
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                //arr[i][j] = s.nextInt();
                System.out.print(arr[i][j] + " ");

            }

            System.out.println();
        }

    }
}
