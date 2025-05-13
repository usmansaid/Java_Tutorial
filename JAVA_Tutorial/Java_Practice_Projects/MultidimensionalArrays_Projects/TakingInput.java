package MultidimensionalArrays_Projects;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The program should take input from the user to make a rectangular matrix of order 2 x 3
        int[][] arr = new int[2][3];

        // I am adding 1 to i and j values so that there will be no confusion in index values
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("Enter the value for row " + (i + 1) + " column " + (j + 1) + " :");
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        scanner.close();

        // for loop for output
        System.out.println("Your final matrix is: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
