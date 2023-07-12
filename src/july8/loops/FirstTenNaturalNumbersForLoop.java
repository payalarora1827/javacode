package july8.loops;

public class FirstTenNaturalNumbersForLoop {
    public static void main(String[] args) {
        int num = 10;

        int sum = 0;
       for(int i =1; i<=10; i++)
        {
            sum = sum +i;   // 0+1=1,1+2=3 ,3+3=6 , 6+ 4=10 , 10+5= 15, 15+6=21

        }
        System.out.println("Sum of "+num+" numbers is :"+sum);
    }
}
