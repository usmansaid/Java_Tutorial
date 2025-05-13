public class Strings {
    public static void main(String[] args) {
        // String is a built in class in the package java.lang

        String str = "Length"; // How to make a string
        System.out.println(str);

        //Methods in Strings

        System.out.println(str.length()); // Prints length of the given Stirng.
        System.out.println(str.indexOf("g")); // Prints index of an element.
        System.out.println(str.indexOf("a")); // as "a" is not present, it will print -1.
        System.out.println(str.charAt(2)); // Prints the element at a given index.

    }
}
