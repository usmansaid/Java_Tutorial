import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            FileWriter writer = new FileWriter("file.txt");
            System.out.println("Enter the text you want to store: ");
            writer.write(scanner.nextLine());
            scanner.close();
            writer.close();
            System.out.println("Written Successfully ✏📃");
        }catch(IOException e){
            System.out.println("Error whike writing to the file ❌");
        }
    }
}
