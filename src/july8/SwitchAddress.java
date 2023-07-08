package july8;
import java.util.Scanner;
public class SwitchAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Input");
        System.out.println("1 : pragra");
        System.out.println("1 : cn");
        System.out.println("1 : aquarium");
        String input = scanner.next();
        switch(input)
        {
            case "pragra" :
                System.out.println("Pragra Address");
                break;
            case "cn" :
                System.out.println("Cn Tower Address");
                break;
            case "aquarium" :
                System.out.println("acquarium Address");
                break;
            default :
                System.out.println("Wrong input");
                break;

        }

    }
}
