import java.util.*;

class phone {
    double width, height, price;
    String os, brand;

    phone(double width, double height, double price, String os, String brand) {
        this.width = width;
        this.height = height;
        this.price = price;
        this.os = os;
        this.brand = brand;
    }

    Scanner in = new Scanner(System.in);

    void call() {
        System.out.println("enter the person name to be called");
        String name;
        name = in.nextLine();
        System.out.println("calling " + name + " in " + brand);
    }

    void sendmsg() {
        System.out.println("enter the message");
        String msg;
        msg = in.nextLine();
        System.out.println("Message " + msg + " has been sent through" + brand);
    }

    void browse() {
        System.out.println("enter the content to be browsed");
        String browse;
        browse = in.nextLine();
        System.out.println(browse + "is being searched through " + brand);
    }

    void share() {
        System.out.println("enter the content to be shared");
        String share;
        share = in.nextLine();
        System.out.println(share + "is being shared through " + brand);
    }

    public static void main(String args[]) {
        phone samsung = new phone(6.98, 13.6, 70000, "android", "Samsung");
        phone iphone = new phone(12.3, 5.86, 100000, "ios", "Apple");
        samsung.call();
        iphone.call();
        samsung.browse();
        iphone.sendmsg();
    }
}
