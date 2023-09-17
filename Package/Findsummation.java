 package summation;

import factorial.*;
import java.util.*;

class Findsummation {

    public void sum(int n, FindFactorial ob) {

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) i / ob.fact(i);
        }
        System.out.println("Sum= " + sum);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("enter the number to find the sum");
        FindFactorial obj = new FindFactorial();
        Findsummation obj2 = new Findsummation();
        num = in.nextInt();
        obj2.sum(num, obj);
    }
}