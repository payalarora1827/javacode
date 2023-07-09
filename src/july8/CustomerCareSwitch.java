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
        int customer;
        int  phone;

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
                 System.out.println("Press 1 for New Customer ");
                 System.out.println("Press 2 for Existing Customer ");

                 customer = scanner.nextInt();
                 switch(customer)
                 {
                            case 1 :
                                System.out.println("New Customer");
                                System.out.println("Please wait transferring your call to agent");
                                break;
                            case 2:
                                System.out.println("Existing Customer");
                                System.out.println("Enter your mobile number");
                                phone = scanner.nextInt();
                                System.out.println(phone);
                                System.out.println("Transferring your call to agent");
                                break;
                            default :
                                System.out.println("Choose right option");
                                break;
                 }
                 break;
                 case 2:
                        System.out.println("welcome to internet Department");
                        System.out.println("Press 1 for New Customer ");
                        System.out.println("Press 2 for Existing Customer ");
                        customer = scanner.nextInt();
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
                        System.out.println("Press 1 for New Customer ");
                        System.out.println("Press 2 for Existing Customer ");

                        customer = scanner.nextInt();
                        switch(customer)
                        {
                            case 1 :
                                System.out.println("New Customer");
                                System.out.println("Please wait transferring your call to agent");
                                break;
                            case 2:
                                System.out.println("Existing Customer");
                                System.out.println("Enter your mobile number");
                                phone = scanner.nextInt();
                                System.out.println(phone);
                                System.out.println("Transferring your call to agent");
                                break;
                            default :
                                System.out.println("Choose right option");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("welcome to internet Department");
                        System.out.println("Press 1 for New Customer ");
                        System.out.println("Press 2 for Existing Customer ");
                        customer = scanner.nextInt();
                        switch(customer)
                        {
                            case 1 :
                                System.out.println("New Customer");
                                break;
                            case 2:
                                System.out.println("Existing Customer");
                                System.out.println("Enter your mobile number");
                                phone = scanner.nextInt();
                                System.out.println(phone);
                                System.out.println("Transferring your call to agent");
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

