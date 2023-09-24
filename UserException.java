import java.util.*;

class VineshException extends Exception {
    public VineshException(String str) {
        super(str);
    }
}

public class UserException {
    public static void main(String args[]) {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of divsor");
        int j = in.nextInt();
        try {
            i = 20 / j;
            if (i == 0)
                throw new VineshException("Default output will be displayed");
        } catch (VineshException e) {
            i = 20 / 1;
            System.out.println("Sorry output cant be zero" + e);
        }
        System.out.println(i);
        System.out.println("after try block");
    }
}
