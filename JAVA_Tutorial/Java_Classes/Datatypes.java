
// Important Datatypes of JAVA:-

public class Datatypes {

    public static void main(String[] args) {
        
        boolean bool  = true;   // Only one bit, bit is simply 1 or 0, 1 and 0 are two bits. 
        System.out.println(bool);

        byte a = 120;         // Ranges from -128 to 127. One byte = 8 bits.
        System.out.println(a);

        short sh = 12000;   // it is 16 bits = 2 bytes datatype, ranges from -32768 to 32768.
        System.out.println(sh);

        int num1 = 12;   // 32 bits = 4 bytes datatype.
        System.out.println(num1);

        long lg = 265387;   // 64 bits = 8 bytes.
        System.out.println(lg); 

        float flo = 2.65654f;   //32 bit precise datatype, require f at last to specify it is float, because by default, a decimal number is double.
        System.out.println(flo);

        double dou = 4.5590000;     // 64 bit precision datatype, more precise than float.
        System.out.println(dou);

        char character = 'A';       // Accepts only single value, maybe a letter or a number, but remember to use single quotes with char.
        System.out.println(character);

        String name = "Usman Said";     // Used to store text in double quotes. BUT remember to keep 'S' of string capital.
        System.out.println(name);

        
    }
}