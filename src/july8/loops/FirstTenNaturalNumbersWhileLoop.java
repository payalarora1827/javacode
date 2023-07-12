package july8.loops;

import java.util.Scanner;

public class FirstTenNaturalNumbersWhileLoop {
    public static void main(String[] args)
    {
        int num = 10;
        int i=1;
        int sum = 0;
        while(i <= num)
        {
            sum = sum +i;    // 0+1=1,1+2=3 ,3+3=6 , 6+ 4=10 , 10+5= 15, 15+6=21
            i++;
        }
        System.out.println("Sum of "+num+" numbers is :"+sum);
    }
}
