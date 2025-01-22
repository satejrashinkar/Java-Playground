import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prog55_FileHandling {
    public static void main(String[] args) {

        // Create a new file
        /*
        File file = new File("Prog55.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file " + e);
        }

        // Write to a file
        try {
            FileWriter fileWriter = new FileWriter("Prog55.txt");
            fileWriter.write("Writing to the file\nHello World");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Reading a file
        File file = new File("Prog55.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */

        // Deleting a file
        File file = new File("Prog55.txt");
        if (file.delete()){
            System.out.println(file.getName() + " deleted successfully");
        }else {
            System.out.println("Unable to delete file");
        }
    }
}
