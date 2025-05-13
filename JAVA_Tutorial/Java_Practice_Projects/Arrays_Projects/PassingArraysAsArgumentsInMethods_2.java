package Arrays_Projects;

public class PassingArraysAsArgumentsInMethods_2 {
    public static void arraysProject(int[] numbers){
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        arraysProject(new int[]{1, 2, 3});
    }
}

// Here in this 2nd topic of passing arrays as a parameter, we discussed how to declare an array in the method's parameter, rather to declare in the main method and then pass it in the parameter.
