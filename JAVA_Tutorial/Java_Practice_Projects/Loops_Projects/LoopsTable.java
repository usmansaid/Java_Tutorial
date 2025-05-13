public class LoopsTable {
    public static void main(String[] args) {

        int i;
        int j;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }
}