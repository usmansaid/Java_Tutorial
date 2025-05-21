package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepHandInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        
        boolean tryAgain = false;
        
        while(!tryAgain){
            
            
            try{
            System.out.print("Enter the index: ");
            int index = scanner.nextInt();

            System.out.println(arr[index]);
            tryAgain = true;

        }catch(IndexOutOfBoundsException e){
            System.out.println("Elemnt not found! Try Again...");

        }catch(InputMismatchException e){
            System.out.println("Eneter only integer values!");
            scanner.nextLine();
        }
}
scanner.close();
    }
    
}