//example for multiple inheritance
interface A {
    void java(int a);

    void config();

    default void simple() {
        System.out.println("I am simple from interface A");
    }
}

interface B {
    void Ds();

    default void simple() {
        System.out.println("I am simple from interace B");
    }
}

interface C extends B {
    // inherits the declaration part and default part of the interface
}

class d implements A, C {
    public void java(int a) {
        System.out.println("java is good");
        System.out.println(a);
    }

    public void config() {
        System.out.println("IN config");
    }

    public void Ds() {
        System.out.println("Ds is important");
    }

    public void simple() {
        System.out.println("I am from d class");
        A.super.simple();
        C.super.simple();
    }
}

class Interface2 {

    public static void main(String[] args) {
        A obj = new d();
        obj.java(5);
        obj.config();
        C obj1 = new d();
        B obj2 = new d();
        obj1.Ds();
        // System.out.println("calling the simple method which is in diamond");
        // can be called with any object reference which contain that default
        // obj1.simple();
        System.out.println("calling the simple method which is in diamond");
        obj2.simple();
    }
}
