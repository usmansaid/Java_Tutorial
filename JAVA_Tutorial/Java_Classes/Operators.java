public class Operators {
    public static void main(String[] args) {

    // ARITHMATIC OPERATORS:

        int a = 5;
        int b = 3;
        int c = a / b;
        System.out.println(c); // It's result is 1.something, but it prints it whole integer because the result is also stored in an int. If you store the result directly in double, it will print in decimal, but only zeros you will see after decimal. To obtain your desired precise result, explicitly convert it to a double which is called type casting. Do this:

        int d = 5;
        int e = 3;
        double f = (double)d / e; // Make either d double or e, or both.
        System.out.println("Your desired result is: " + f); 

        // Remember! If you want a specific datattype result, make at least one variable of that datatype.

    /* Other arithmetic operators are:
        1) + Addition
        2) - Subtraction
        3) * Multiplication
        4) / Division
        5) % Modulus, Returns only remainder
     */


/*  ASSIGMENT OPERATORS:
        1) = Equals to
        2) += 
        3) -=
        4) *=
        5) /=
        6) %=

*/

        int num1 = 23;
        int num2 = 12;
        int result = num1 + num2;
        result += 10;               // It is the same as result = result + 10;
        System.out.println(result);




/*
 RELATIONAL OPERATORS: these operators will return boolean value.
        1) == require two values to compare them, returns a boolean value.
        2) != Not equal to
        3) > greater than
        4) < less than
        5) >= greater than or equal to
        6) <= less than or equal to
 */



/*
 LOGICAL OPERATORS:
        1) && Logical AND , returns true if both are true, if a single value is false while the other is true, result will yet be false.
        2) || Logical OR , returns true if either of the two values is true or both are true, return false only if both are false.
        3) !  Logical NOT , returns true if the result is false and vice versa.
            Let's do an example:-
 */

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 && bool2); // Will return false, as one value is false.
        System.out.println(bool1 || bool2); // Will return true, as both are not false to return false.
        System.out.println(!bool1); // Require only one variable, will return false


/*
        INCREMENT and DECREMENT operators:
        1) ++ Increment
        2) -- Decrement
 */

        int number = 10;
        number++;       // Equivalent to number = number + 1
        System.out.println(number);

        number--;        // Equivalent to number = number - 1
        System.out.println(number);

    }
}
