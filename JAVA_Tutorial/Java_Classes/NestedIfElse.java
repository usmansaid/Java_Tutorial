import java.util.Scanner;

public class NestedIfElse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Enter Three numbers separated by spaces: ");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a > b && a > c){
            System.out.println(a + " = a is largest.");
        }
        else if(b > c){
            System.out.println(b + " = b is largest.");
        }
        else{
            System.out.println(c + " = c is largest.");
        }

        scanner.close();

    }

}
