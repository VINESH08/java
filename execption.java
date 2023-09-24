public class execption {
    public static void main(String args[]) {
        int j = 0;
        int arr[] = new int[5];
        try {
            // System.out.println(arr[5]);
            int i = 10 / j;
            if (j == 0)
                throw new ArithmeticException("cant divide by zero");
            System.out.println("Not printed");

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);// not only printing you can also handel the exception
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        System.out.println("After try block");
    }
}
