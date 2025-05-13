public class Printf{
    public static void main(String[] args) {

        String name = "Usman";
        int age = 19;
        char firstLetter = 'U';
        double height = 29.4;

        System.out.printf("My name is %s\n", name);
        System.out.printf("My age is %d\n", age);
        System.out.printf("My name's first letter is %c\n", firstLetter);
        System.out.printf("My height is %f\n", height);

        // You can write all these in one printf

        // System.out.printf("My name is %s , my age is %d , and height is %f", name, age, height);


        // Note that % is placeholder and the letter after it is format specifier, and you must give the arguments(variable's names).

    // Width and decimal places

    System.out.printf("height is %.1f \n", height); // means to add only one decimal place

    System.out.printf("height is %9.3f \n", height); // Means total width of floating value.


    // if you want to add padding of zeros either at start or end:
    System.out.printf("height is %09.3f \n", height); // Must be completing the width we given.

    // If you want to give commas in between a large number:
    double num = 90000.0;
    System.out.printf("Big number with comma %,.2f\n", num);

    // If you want to close a negative value in braces:
    int number = -45;
    System.out.printf("Negative number with braces %(d", number);
    }
}