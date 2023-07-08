package july8;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int input = sc.nextInt();
        switch(input)
        {
            case 1 :
            System.out.println("Switch on the white bulb");
            break;
            case 2 :
            System.out.println("Switch on the red bulb");
            break;
            case 3 :
                System.out.println("Switch on the fan   ");
                break;
            case 4 :
                System.out.println("nothing");
                break;
            default :
                System.err.println("Wrong Input");

        }

    }
}
