import java.util.Arrays;

class Strings {
    public static void main(String args[]) {
        String s1 = "Sastra Deemed To Be University";
        String s2 = "";
        char ch[] = s1.toCharArray();
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            s2 = s2 + (char) (ch[i] + 5);
        }
        System.out.println(s2);
        if (s1.equals(s2))
            System.out.println("Equal");
        System.out.println(s1.toUpperCase());
    }
}