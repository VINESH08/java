interface Computer {
    int a = 10;// all varialbes must be defined because they are final and static...
    String b = "Focus on your track!";

    void speed();
}

class Laptop implements Computer {
    public void speed() {// once implemented use public keyword to define it other wise u get error

        System.out.println("Laptop runscode,compile,stores..");
    }
}

class Desktop implements Computer {

    public void speed() {
        System.out.println("Desktop is faster than laptop ");
    }
}

class Developer {
    void Devapp(Computer lap) {
        lap.speed();
    }
}

class Inter_main {
    public static void main(String args[]) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer vini = new Developer();
        vini.Devapp(lap);
        vini.Devapp(desk);
    }
}
// use extends for class to class
// use exteds for interface to interface
// use implements for class to interface
// here the coupling is looser like the developer can be made to work with both
// laptop as well as the desktop