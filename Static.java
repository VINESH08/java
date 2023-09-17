class Static {
    String model;

    static int total_cars = 0;

    Static(String model) {
        this.model = model;
        total_cars++;
    }

    public static void main(String args[]) {
        Static s = new Static("bmw");
        System.out.println("Total cars=" + Static.total_cars);
        Static s1 = new Static("audi");
        // System.out.println("Total cars=" + Static.total_cars);
        System.out.println("Total cars=" + Static.total_cars);
    }
}