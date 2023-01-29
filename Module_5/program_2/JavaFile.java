
// Michael Streed
// Module 5 program 2
// 01-28-2023
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFile {
    public static void main(String[] args) {
        // This try block will create our file to put random numbers in.
        File randoNumFile = new File("./randomNumbers.txt");
        System.out.println();
        try {
            if (randoNumFile.createNewFile()) {
                System.out.println("File created: " + randoNumFile.getName());
            } else {
                System.out.println("File Already There.");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // This will write or append 10 random numbers to the file.
        PrintWriter pw;
        Scanner sc;

        System.out.println();
        try {
            pw = new PrintWriter(new FileOutputStream(randoNumFile, true));
            System.out.println("Writing to file");
            for (int i = 0; i < 10; i++) {
                pw.print((int) (Math.random() * 50 + 1) + " ");
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        System.out.println();

        // This Section will print the contents of the file into the terminal.
        try {
            System.out.println("Reading the File");
            System.out.println();
            sc = new Scanner(randoNumFile);
            while (sc.hasNext()) {
                System.out.print(sc.next() + " ");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
