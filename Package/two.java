package p2;

import java.util.*;
import p1.*;

class two {
    public static void main(String args[]) {
        int n;
        System.out.println("enter the size of the array");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the key");
        int k = in.nextInt();
        one obj = new one(k);
        System.out.println(obj.search(arr));
    }
}