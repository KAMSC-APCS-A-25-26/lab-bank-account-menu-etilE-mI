import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu
        // 1. Create a double variable for balance
        // 2. Create a while loop for the menu
        // 3. Display the menu options
        // 4. Use Scanner to read user input
        // 5. Use switch statement to handle menu choices
        // 6. Implement add money, withdraw money, check balance, and exit functionality
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        double balance = 0.00;
        boolean menu = true;
        double amount = 0.00;
        while(menu)
        {
            System.out.println("--- Bank Account Menu ---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter amount to add: ");
                    amount = sc.nextDouble();
                    if(amount>0)
                    {
                        balance += amount;
                        System.out.println("Your balance is $" + balance);
                    }
                    System.out.print("\n\n");
                break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    if(amount>0)
                    {
                        balance -= amount;
                        System.out.println("Your balance is $" + balance);
                    }
                    System.out.print("\n\n");
                    break;

                case 3:
                    System.out.print("Your Balance is: $" + balance);
                    System.out.print("\n\n");
                    break;

                case 4:
                    System.out.print("Goodbye!");
                    menu = false;
                    break;
            }

        }
    }
}