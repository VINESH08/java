class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class dynamic_poly {
    public static void main(String[] args) {
        Animal a; // Reference of type Animal

        a = new Dog(); // Object of type Dog
        a.sound(); // Outputs "Dog barks"

        a = new Cat(); // Object of type Cat
        a.sound(); // Outputs "Cat meows"

        a = new Animal(); // Object of type Animal
        a.sound(); // Outputs "Animal makes a sound"
    }
}
