package Arrays_Projects;

public class RightCircularShift {
   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int temp = arr[arr.length -1]; // Store the last value in temp

        //loop for circular shift to the right (main logic)
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }

        //update the value of the last index, b/c if you don't do that, the last index's value will still be 3
        arr[0] = temp;


        // loop for printing all the indices's values of an array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}

