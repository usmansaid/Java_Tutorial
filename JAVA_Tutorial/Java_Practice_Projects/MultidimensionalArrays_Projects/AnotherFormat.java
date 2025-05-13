package MultidimensionalArrays_Projects;

public class AnotherFormat {
    public static void main(String[] args) {
        // Here the Direct value method will be discussed as you are already familiar with the new keyword Method

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // This will make a 3 x 3 2D array
        // Note that to use commas in between two rows or it will show error
        // These multidimensional arrays are also called nested arrays

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
