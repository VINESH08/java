class animal {
    private String name, family, sound;
    private int age;

    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    animal(String name, String family, String sound, int age) {
        this.name = name;
        this.family = family;
        this.sound = sound;
        this.age = age;
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Family:" + family);
        System.out.println("Sound:" + sound);
        System.out.println("Age:" + age);
    }
}

class dog extends animal {
    dog(String name, String family, String sound, int age) {
        super(name, family, sound, age);
    }

    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void display() {
        super.display();
    }
}

class cat extends animal {
    cat(String name, String family, String sound, int age) {
        super(name, family, sound, age);
    }

    public void makeSound() {
        System.out.println("cat meows");
    }

    public void display() {
        super.display();
    }
}

class cow extends animal {
    cow(String name, String family, String sound, int age) {
        super(name, family, sound, age);
    }

    public void makeSound() {
        System.out.println("cow sounds maaa!!!");
    }

    public void display() {
        super.display();
    }
}

class animalmain {
    public static void main(String args[]) {
        animal ani; // calling subclass with help of dynamic dispatch method..!..
        System.out.println("Dog class");
        ani = new dog("jimmy", "germanshep", "woof woof", 5);
        ani.makeSound();
        ani.display();
        System.out.println("cat class");
        ani = new cat("mose", "catfam", "meow", 3);
        ani.makeSound();
        ani.display();
        System.out.println("cow class");
        ani = new cow("baba", "cowfam", "maaa", 6);
        ani.makeSound();
        ani.display();
    }
}
