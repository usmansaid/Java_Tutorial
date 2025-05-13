public class MultidimensionalArrays {

    public static void main(String[] args) {
        int[][] arr = new int[2][2];

        // For easy understanding, recall matrices.
        // the first index operator is for rows and the second is for coloumns

        // First row
        arr[0][0] = 1;
        arr[0][1] = 2;

        // Second row
        arr[1][0] = 3;
        arr[1][1] = 4;
         
        // This is a square array of order 2 x 2

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // Note that this loop for printing is same as we used in the stars patterns.
        // Outer loop is for controlling rows and inner is for coloumns

        // See the patterns solution if you get stuck here

    }
}