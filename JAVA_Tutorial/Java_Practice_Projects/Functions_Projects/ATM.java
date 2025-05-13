import java.util.Scanner;


public class ATM {
    static int balance = 100000;

    // Method-1 for PIN Verification
    public static void pinVerification(int PIN, Scanner scanner){
        System.out.print("Enter the PIN to access your account: ");
        PIN = scanner.nextInt();
        if(PIN == 12345){
            selection(PIN, scanner);;
        }else{
            System.out.println("Pin is invalid! Exiting the System...");
            return;
        }
    }

    // Method-2 for Selection
    public static void selection(int choice, Scanner scanner){
        System.out.println("Press-1: Check Balance. \n Press-2: Deposit Money. \n Press-3: Withdraw Money. \n Press-0: Exit the System.");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            checkBalance(scanner);
        }else if(choice == 2){
            depositMoney(scanner);
        }else if(choice == 3){
            withdrawMoney(scanner);
        }else{
            return;
        }
    }

    // Method-3 for balance check
    public static void checkBalance(Scanner scanner){
        System.out.println("Your current balance is " + balance);

        System.out.print("Enter 1 to return to main menu, 0 to exit: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            selection(choice, scanner);
        }else{
            return;
        }

    }

    // Method-4 for money deposit
    public static void depositMoney(Scanner scanner){
        System.out.print("Enter the deposit amount: ");
        int depositAmount = scanner.nextInt();

        balance += depositAmount;
        System.out.println("Your new balance is " + balance);

        System.out.print("Enter 1 to return to main menu, 0 to exit: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            selection(choice, scanner);
        }else{
            return;
        }
    }

    // Method-5 for withdrawal
    public static void withdrawMoney(Scanner scanner){
        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = scanner.nextInt();

        balance -= withdrawAmount;
        System.out.println("Your new balance is " + balance);


        System.out.print("Enter 1 to return to main menu, 0 to exit: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            selection(choice, scanner);
        }else{
            return;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------- Welcome to the ATM System ---------");
        pinVerification(12345, scanner);
        
        
    }
}
