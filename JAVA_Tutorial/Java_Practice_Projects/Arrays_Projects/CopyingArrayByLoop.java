package Arrays_Projects;

public class CopyingArrayByLoop {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];

        // main logic for copying original array in copy
        for(int i = 0; i < original.length; i++){
            copy[i] = original[i];
        }

        //used for each loop for printing the copy array (Error)
        // Note that for-each loop does not gives you the access of indices, it only gives the elements, so it will show error here and doesn't print anything.

        // for (int i : copy) {
        //     System.out.print("original [" + i + "] = " + original[i] + " || ");
        //     System.out.println("copy [" + i + "] = " + copy[i]);
        // }


        // simple for loop(Ideal)
        for(int i = 0; i < copy.length; i++){
            System.out.print("original [" + i + "] = " + original[i] + " || ");
            System.out.println("copy [" + i + "] = " + copy[i]);
        }
    }
}
