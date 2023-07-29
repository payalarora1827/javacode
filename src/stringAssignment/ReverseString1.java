package stringAssignment;

public class ReverseString1
{
    public static void main(String[] args)
    {
        String str = "Pragra";
        String revStr = "";
        System.out.println("Original word: " +str);
        for(int i = str.length()-1; i >= 0; i--)
        {
            revStr = revStr + str.charAt(i);
        }
        System.out.println("Original word: " +revStr);
    }
}
