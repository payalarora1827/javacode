public class FactorialDemo {
    public static void main(String[] args)
    {
        int fact = 1;
       int num =3;
        for(int i=1; i<= num; i++)
        {
         fact = fact*i;    //1*1 = 1, 1*2 = 2, 2*3 = 6
        }
        System.out.println("The factional of " +num+ " is: "+fact);
    }
}
