import java.util.*;

class twodimenstr {

    void check(String[][] arr, String name) {
        int n = arr.length, flag = 0;
        for (int i = 0; i < n; i++) {
            // System.out.println(name);
            String nm = arr[i][0];

            if (name.equals(nm)) {// to cmpr two strings use str1.equals(str2)
                flag = 1;
                System.out.println("the email address of " + name + " is: ");
                System.out.println(arr[i][1]);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("person not found!!");
        }
    }

    public static void main(String args[]) {
        twodimenstr td = new twodimenstr();
        // String[][] str = new String[4][2];
        String[][] str = { { "vinesh", "vineshraghu0809@gmail.com" }, { "charan", "itzctk@gmail.com" },
                { "magi", "itsmagiii@gmail.com" }, { "sanjiv", "sanjirkk@gmail.com", "hi" } };
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name");
        String nm = in.next();
        td.check(str, nm);
        // to print the entire 2d string use
        // System.out.println(Arrays.deepToString(str));

    }
}