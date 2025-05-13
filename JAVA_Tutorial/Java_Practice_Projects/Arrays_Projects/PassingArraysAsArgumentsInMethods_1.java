package Arrays_Projects;

public class PassingArraysAsArgumentsInMethods_1 {

    public static void arrayAsParameter(int[] arr){
      
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arrayAsParameter(arr);
    }
}
