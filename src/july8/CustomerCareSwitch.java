package july8;
import java.util.Scanner;
public class CustomerCareSwitch
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Input");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        int input = scanner.nextInt();
       int num;

        switch(input)
        {
            case 1 :
                System.out.println("Welcome to Customer care - English Department");
                System.out.println("Choose right option ");
                System.out.println("Choose 1 for mobile");
                System.out.println("Choose 2 for Internet");
                num = scanner.nextInt();
                switch(num)
                {
                    case 1 :
                 System.out.println("welcome to mobile department");
                 System.out.println("Enter your mobile number");
                       int  phone = scanner.nextInt();
                        System.out.println(phone);
                        break;
                    case 2:
                        System.out.println("welcome to internet Department");
                        System.out.println("Press 1 for New Customer ");
                        System.out.println("Press 2 for Existing Customer ");
                        int customer = scanner.nextInt();
                        switch(customer)
                        {
                            case 1 :
                                System.out.println("New Customer");
                                break;
                            case 2:
                                System.out.println("Existing Customer");
                                break;
                            default :
                                System.out.println("Choose right option");
                                break;

                        }
                        break;
                    default :
                        System.out.println("Choose right option");

                }

                break;
            case 2 :
                System.out.println("Welcome to Customer care - French Department");
                System.out.println("Choose right option ");
                System.out.println("Choose 1 for mobile");
                System.out.println("Choose 2 for Internet");
                num = scanner.nextInt();
                switch(num)
                {
                    case 1 :
                        System.out.println("welcome to mobile department");
                        System.out.println("Enter your mobile number");
                        int  phone1 = scanner.nextInt();
                        System.out.println(phone1);
                        break;
                    case 2:
                        System.out.println("welcome to internet Department");
                        System.out.println("Press 1 for New Customer ");
                        System.out.println("Press 2 for Existing Customer ");
                        int customer1 = scanner.nextInt();
                        switch(customer1)
                        {
                            case 1 :
                                System.out.println("New Customer");
                                break;
                            case 2:
                                System.out.println("Existing Customer");
                                break;
                            default :
                                System.out.println("Choose right option");
                                break;

                        }
                        break;
                    default :
                        System.out.println("Choose right option");

                }
                break;

            default :
                System.out.println("Please choose right option");
        }
        }
}

