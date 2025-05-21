package Exception_Handling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        try{
            if(age < 18){
                throw new ArithmeticException("You are under 18, Access Denied!");
            }else{
                System.out.println("Access Granted...");
            }

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
