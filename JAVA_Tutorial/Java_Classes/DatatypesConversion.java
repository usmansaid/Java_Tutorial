
// Conversion of Datatypes in JAVA:-
 
// Implicit (Direct) Conversion:- From a small bits datatype to a large bits datatype. It is easy.
public class DatatypesConversion {
    public static void main(String[] args) {
        int small = 23;
        System.out.println(small + " Before Conversion: " + ((Object)small).getClass().getSimpleName()); // To access type of data.

        // Now to convert it to a large or short:=

        long convertedSmall = small;
        System.out.println(convertedSmall + " After Conversion: " + ((Object)convertedSmall).getClass().getSimpleName());     // Converted to long


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// Explicit (Indirect) Conversion:- From a large to small bits datatype. Require an additional step, yet simple:

        long number = 345;
        System.out.println(number + " Before Explicit Conversion: " + ((Object)number).getClass().getSimpleName());
        int convertedNumber = (int)number;  // Only you need to put that datatype which we wants to convert to it explicitly, prior to the variable name
        System.out.println(convertedNumber + " Before Explicit Conversion: " + ((Object)convertedNumber).getClass().getSimpleName());
    }
}




