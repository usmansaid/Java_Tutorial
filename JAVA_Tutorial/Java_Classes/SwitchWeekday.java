import java.util.Scanner;

public class SwitchWeekday {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Note! Week is starting from Monday.");
       System.out.print("Enter a number between 1 and 7: ");

       int numDay = scanner.nextInt();

       switch(numDay){
        case 1:
            System.out.println(numDay + " is Monday.");
        break;

        case 2:
            System.out.println(numDay + " is Tuesday.");
        break;

        case 3:
            System.out.println(numDay + " is Wednesday.");
        break;

        case 4:
            System.out.println(numDay + " is Thursday.");
        break;

        case 5:
            System.out.println(numDay + " is Friday.");
        break;

        case 6:
            System.out.println(numDay + " is Saturday.");
        break;

        case 7:
            System.out.println(numDay + " is Sunday.");
        break;

        default:
            System.out.println("Invalid Entry!");
       }

       scanner.close();
    }
}
