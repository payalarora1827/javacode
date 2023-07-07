public class SumOfNaturalNumber {
    public static void main(String[] args)
    {
        int i;
        int num = 10;
        int sum = 0;
        for(i=1; i <= num; ++i)
        {
            //sum = sum+1;
            sum += i;
        }
        System.out.println(sum);

       /* int sum = 0;
        for(int i=1; i<=10; ++i)
        {
            sum += i;
            //sum = sum+1;
        }
        System.out.println("Sum of first 10 natural numbers: " +sum);*/
    }

    }
