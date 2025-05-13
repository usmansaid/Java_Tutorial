import java.util.Scanner;

public class VowelsCount {

    public static void vowelsCount(Scanner scanner) {

        String vowels = "aeiou";
        int sum = 0;

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                sum++;
            }

        }
        System.out.println("Number of vowels in the given sentence/word are: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vowelsCount(scanner);

    }
}
