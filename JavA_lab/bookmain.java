import java.util.*;

class Book {
    private String title;
    private String author;
    private double price;
    private int rating;

    public void getdetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the title");
        title = in.nextLine();
        System.out.println("enter the author");
        author = in.nextLine();
        System.out.println("enter the price");
        price = in.nextDouble();
        System.out.println("enter the rating");
        rating = in.nextInt();
    }

    public void showdetails() {
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
        System.out.println("rating: " + rating);
    }

    public static void highrating(Book obj[], int n) {
        int max = obj[0].rating;
        for (int i = 1; i < n; i++) {
            if (obj[i].rating > max)
                max = obj[i].rating;
        }
        System.out.println("The maximum rating is: " + max);
    }
}

class bookmain {
    public static void main(String args[]) {
        int num;
        System.out.println("enter the number of books:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        Book[] ob = new Book[num];
        for (int i = 0; i < num; i++) {
            ob[i] = new Book();
            ob[i].getdetails();
        }
        for (int i = 0; i < num; i++) {
            ob[i].showdetails();
        }
        Book.highrating(ob, num);
    }
}
