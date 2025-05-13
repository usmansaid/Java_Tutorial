import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable Declaration
        String input;
        int middleIndex;
        String firstPart;
        String lastPart;
        String lastPartReversed;

        // Initializing lastPartReversed
        lastPartReversed = "";

        // User Input for a string
        System.out.print("Enter a single word String: ");
        input = scanner.next().toLowerCase();
        scanner.close();

        if(input.length() % 2 == 0){ // For even length strings
            middleIndex = input.length() / 2;
            firstPart = input.substring(0, middleIndex);
            lastPart = input.substring(middleIndex);
        }else{ // For odd length strings
            middleIndex = (input.length() + 1) / 2;
            firstPart = input.substring(0, middleIndex);
            lastPart = input.substring(middleIndex - 1);
        }

      

        // Reverse the last part string
        for(int i = lastPart.length() - 1; i >= 0; i--){
            lastPartReversed += lastPart.charAt(i);
        }

        // Condition for checking palinrome
        if(firstPart.equals(lastPartReversed)){
            System.out.println("Your String is Palindrome!");
        }else{
            System.out.println("Your String is not a Palindrome!");
        }
    }
}