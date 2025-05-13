package Arrays_Projects;

public class CopyingByArrayCopyUtility {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] copy = new int[original.length];

        System.arraycopy(original, 0, copy, 0, original.length);

        for(int i = 0; i < copy.length; i++){
            System.out.println(copy[i]);
        }
    }
}
