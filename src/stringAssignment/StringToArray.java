package stringAssignment;

public class StringToArray
{
    public static void main(String[] args)
    {
        String str = "Pragra";
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            arr[i] = str.charAt(i);
            System.out.println(arr[i] );
        }
    }
}
