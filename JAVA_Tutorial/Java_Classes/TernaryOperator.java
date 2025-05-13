public class TernaryOperator {
    public static void main(String[] args) {
        // For Example:

        int num1 = 12;
        int num2 = 24;
        int max;

     /*
         if(a > b){
            max = a;
        } else{
            max = b;
        }
      */
        // Simply the short form of if-else is done by ternary operator.
        max = num1 > num2 ? num1 : num2;

        // a > b ? => if(a > b)
        // then max = a
        // : b => else max = b
        
        System.out.println("max is: " + max);

        // You can also do nesting in it, like:

        
         int a = 13;
        int b = 14;
        int c = 15;
        int largest;

        /*
       if(a > b && a > c){
            System.out.println(a + " = a is largest.");
        }
        else if(b > c){
            System.out.println(b + " = b is largest.");
        }
        else{
            System.out.println(c + " = c is largest.");
        }
        }
         */

    // To avoid above lengthy block of code, we can wrap it in only one line:

        largest = a>b && a>c? a :b>c? b : c;
        System.out.println(largest);


    }
}
