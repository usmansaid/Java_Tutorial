import java.util.Scanner;

public class PasswordValidator2 {

    public static boolean isValidPassword(Scanner scanner, String password){

        System.out.print("Enter a password: ");
        password = scanner.nextLine();

        if(password.length() >= 8){
            int digitCount = 0; // Password must contain at least two digits
            for(int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);


                if(ch >= '0' && ch <= '9'){
                    digitCount++;
                    if(digitCount < 2){
                        return false;
                    }
                }else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                    return true;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(isValidPassword(scanner, null)){
            System.out.println("Password is Valid!");
        }else{
            System.out.println("Password is not Valid!");
        }

    }
}
