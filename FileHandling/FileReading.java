import java.util.*;
import java.io.*;

/**
 * FileReading
 */
public class FileReading {
    public static void main(String[] args) {
        FileInputStream fin;
        int i;
        if (args.length != 1) {
            System.out.println("File not provided");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be opened");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading the file");

        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Cannot close the file");
        }
    }

}