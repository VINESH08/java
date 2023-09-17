public class TypeCasting {
    public static void main(String args[]) {
        byte b = 127; // byte range is -128 to 127 which is 256

        int a = b; // integer has longer range so it can able to store smaller ranges
        System.out.println(a);
        int k = 12;
        byte m = (byte) k;
        System.out.println(m);// explicit type casting is being made over here int to byte
        int l = 258;
        byte c = (byte) l;
        System.out.println(c);/*
                               * since the integer range is greater than byte range so the integer value % 256
                               * is made to give the answer 2 for this case
                               */

        float f = 5.67f;
        int x = (int) f;
        System.out.println(x);// prints only the integral part of the float value
        byte d = 1;
        byte e = 3;
        byte result = (byte) (d * e); /*
                                       * since d*e goes out of range so java promotes it to integer it is called as
                                       * type promotion in java
                                       */
        System.out.println(result);
        int vin = 5000;
        char ch = 'c';// Ascii value of c is 97 so 5000/97=50(int/int =int)
        float res = (float) vin / ch;/*
                                      * gives floating value when type casted from int if (float ) is removed gives
                                      * int value with.0 endding
                                      */
        System.out.println(res + "hi");
        float shar = 9.8f;
        boolean re = shar == vin;
        System.out.println(re);
    }
}