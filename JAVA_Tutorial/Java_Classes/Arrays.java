public class Arrays {
    public static void main(String[] args) {
        
        // Declaration of Arrays
        int[] arr; // Only declared but memory has to be allocated for it

        // Memory allocation
        arr = new int[3];  // Space allocated for 3 integers

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30; // Values assigning

        // Combined structure
        // int[] arr = new int[5];

        // This was the first format for an array

        // Second format

        int[] arr2 = {10, 20, 30}; // Declaring and initializing without memory reservation, space will be reserved upon entering values. 


        // You can also do as int arr[] = new int[], but it is not used in modern styles, yet acceptable

        // System.out.println(arr[0]);


        int[] arr3 = new int[5];

        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;
        arr3[3] = 40;
        arr3[4] = 50;

        
        int a1 = arr3[1];
        int a2 = arr3[4];
        
        int temp = a1;
        arr3[1] = a2;
        arr3[4] = temp;
        
        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }



    }
}
