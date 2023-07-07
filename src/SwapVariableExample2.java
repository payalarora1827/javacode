public class SwapVariableExample2
{
    public static void main(String[] args)
    {
       int x = 12;
       int y = 25;
       System.out.println("Original Value");
       System.out.println("x = " +x);
       System.out.println("y = " +y);
       x= x^y^(y = x);
       System.out.println("Swapped Variable");
       System.out.println("x = " +x);
       System.out.println("y = " +y);
    }
}
