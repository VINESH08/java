import java.io.*;
import java.util.*;

public class CharReading {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        c = (char) br.read();// reading bytes from console and converting it into character
        System.out.println(c);
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

    }
}
