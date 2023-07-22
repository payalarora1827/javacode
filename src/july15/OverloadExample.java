package july15;

import java.util.Scanner;

public class OverloadExample {
    public static void over(int num)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int n = scanner.nextInt();
        System.out.println("Your Age is : " +num);
    }
    public static void over(String name)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        String nme = scanner.next();
        System.out.println("Your name is : " +nme);
    }

}
