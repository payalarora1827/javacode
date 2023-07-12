package july8.loops;
import java.util.Scanner;
public class TableWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        int num = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num * i);
            i++;
        }
    }
}
