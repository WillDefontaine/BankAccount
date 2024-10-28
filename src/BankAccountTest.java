import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class BankAccountTest {

    //private static boolean isValidPassword (String password) {
       // if (password.length() < 8 || !password.contains('*'))
  //  }
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        boolean isRunning = true;

        ArrayList<BankAccount> listOfAccounts = new ArrayList<>();
        while (isRunning) {
            System.out.println("1 - Create An Account");
            System.out.println("2 - Delete An Account");
            System.out.println("3 - Make An Account Deposit");
            System.out.println("4 - Make An Account Withdrawl");
            System.out.println("5 - Check An Account Balance");
            System.out.println("6 - Exit");
            int option = userinput.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter Customer Name:");
                    String customerName = userinput.next();
                    System.out.println("Enter User ID:");
                    String userID = userinput.next();
                    System.out.println("Enter User Password:");
                    String password = userinput.next();
                    BankAccount userAccount = new BankAccount(customerName, userID, password);
                    listOfAccounts.add(userAccount);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Error: Please enter a valid choice (1 thru 6)");


            }
        }
    }
    }
