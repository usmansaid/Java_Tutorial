package Arrays_Projects;

public class LeftCircularShift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int temp = arr[0]; // Store the first value in temp

        //loop for circular shift to the left (main logic)
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        //update the value of the last index, b/c if you don't do that, the last index's value will still be 3
        arr[arr.length - 1] = temp;


        // loop for printing all the indices's values of an array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
