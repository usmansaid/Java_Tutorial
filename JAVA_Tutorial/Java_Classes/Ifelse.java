import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int userInput = scanner.nextInt();

        if(userInput >= 18){
            System.out.println("You are eligible to Vote.");
        } else{
            System.out.println("You aren't eligible to Vote.");
        }
        scanner.close();
    }
}
