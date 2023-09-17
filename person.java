import java.util.*;

class person {
    String hairclr, eyeclr, skclr;
    double hei, wei;

    void setdetails(String hairclr, String eyeclr, String skclr, double hei, double wei) {
        this.hairclr = hairclr;
        this.eyeclr = eyeclr;
        this.skclr = skclr;
        this.hei = hei;
        this.wei = wei;
    }

    void displaydet() {
        System.out.println("hair color=" + hairclr);
        System.out.println("eye color=" + eyeclr);
        System.out.println("skclr=" + skclr);
        System.out.println("height=" + hei);
        System.out.println("weight=" + wei);

    }

    Scanner in = new Scanner(System.in);

    void eat() {
        String food;
        food = in.nextLine();
        System.out.println("the person eats" + food);
    }

    void sleep() {
        System.out.println("person sleeps at 8pm");
    }

    void play() {
        String game;
        game = in.nextLine();
        System.out.println("the person plays " + game);
    }

    public static void main(String args[]) {
        person p = new person();
        p.setdetails("black", "white-black", "white", 5.4, 70);
        p.displaydet();
        p.eat();
        p.play();
        p.sleep();
    }

}
