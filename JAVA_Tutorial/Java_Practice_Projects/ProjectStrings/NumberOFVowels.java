package ProjectStrings;

import java.util.Scanner;

public class NumberOFVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables Declaration
        String paragraph;
        String vowels;
        int totalVowels;
        char ch;

        // Initialization
        vowels = "aeiouAEIOU";
        totalVowels = 0;

        // User Input
        System.out.println("++++++++  Total number of vowels calculator +++++++");
        System.out.println("Enter your Paragraph here: ");
        paragraph = scanner.nextLine();

        // Loop
        for (int i = 0; i < paragraph.length(); i++) {
            
            ch = paragraph.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                    totalVowels ++;
                }

        }

        System.out.print("Total number of vowels in the given Paragraph are: " + totalVowels);

        scanner.close();
    }

}