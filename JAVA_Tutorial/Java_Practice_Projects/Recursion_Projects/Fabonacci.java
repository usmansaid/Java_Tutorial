package Recursion_Projects;

public class Fabonacci {

    public static long fib(int n){
        if(n == 0) return -1; // Will return -1, which means there is no 0th term
        else if(n == 1) return 0;
        else if(n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int x = 0;
        System.out.println(fib(x));
    }
}
