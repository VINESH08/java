class Mobile {
    String brand;
    int price;
    static String name;
    static {
        name = "phone";
        System.out.println("in static block");
    }

    Mobile() {
        brand = "";
        price = 200;
    }

    public void show() {
        System.out.println("name:" + name + "price:" + price + "brand:" + brand);
    }
}

class static_block {
    public static void main(String args[]) {
        Mobile ob = new Mobile();
        ob.brand = "Apple";
        ob.price = 2034;
        // ob.name = "smartphone";
        ob.show();
        // ob.name = "smartphone";
    }
}// static block is always executed before the constructor call;;