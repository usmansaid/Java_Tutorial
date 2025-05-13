package Arrays_Projects;

public class BinarySearch {

    public static void binarySearching(int target, int... numbers){
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if(target == numbers[middle]){
                System.out.println("Found " + target + " at index " + middle);
                return;
            }else if(target > numbers[middle]){
                low = middle + 1;
            }else{
                high = middle - 1;
            }

        }

        System.out.println(target + " not found in the data!");
    }
    public static void main(String[] args) {
        int target = 7;
        binarySearching(target, 1,2,3,4,5,6,7,8,9);
    }
}
