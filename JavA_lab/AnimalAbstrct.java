package JavA_lab;

import java.util.*;

abstract class Animal {
    String name;
    int age;

    public abstract void getData();

    public abstract void printdata();

    public abstract void eat();

    public abstract void sleep();

}

class dog extends Animal {
    String breed;
    String color;
    Scanner in = new Scanner(System.in);

    public void bark() {
        System.out.println(name + " barks!!");
    }

    public void getData() {
        System.out.println("Enter the name:");
        name = in.nextLine();
        System.out.println("Enter the age");
        age = in.nextInt();
        System.out.println("Enter the breed");
        breed = in.next();
        System.out.println("enter the color");
        color = in.next();
    }

    public void eat() {
        System.out.println(name + " eats Chiken!!");
    }

    public void sleep() {
        System.out.println(name + " sleeps 2hrs a day");
    }

    public void printdata() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Breed:" + breed);
        System.out.println("Color:" + color);
    }

}

class cat extends Animal {
    String breed;
    String color;
    Scanner in = new Scanner(System.in);

    public void meow() {
        System.out.println("cat " + super.name + " meows!!");
    }

    public void getData() {
        System.out.println("Enter the name:");
        name = in.nextLine();
        System.out.println("Enter the age");
        age = in.nextInt();
        System.out.println("Enter the breed");
        breed = in.next();
        System.out.println("enter the color");
        color = in.next();
    }

    public void eat() {
        System.out.println(name + " drinks milk!!");
    }

    public void sleep() {
        System.out.println(name + " sleeps 5hrs a day");
    }

    public void printdata() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Breed:" + breed);
        System.out.println("Color:" + color);
    }
}

class lion extends Animal {
    String breed;
    String color;
    Scanner in = new Scanner(System.in);

    public void roar() {
        System.out.println("lion " + super.name + " RoaRs!!");
    }

    public void getData() {
        System.out.println("Enter the name:");
        name = in.nextLine();
        System.out.println("Enter the age");
        age = in.nextInt();
        System.out.println("Enter the breed");
        breed = in.next();
        System.out.println("enter the color");
        color = in.next();
    }

    public void eat() {
        System.out.println(name + " eats meat!!");
    }

    public void sleep() {
        System.out.println(name + " sleeps 5hrs a day");
    }

    public void printdata() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Breed:" + breed);
        System.out.println("Color:" + color);
    }

}

class AnimalAbstrct {
    public static void main(String args[]) {
        Animal ani;
        System.out.println("enter the details for dog");
        ani = new dog();
        ani.getData();
        ani.eat();
        ani.sleep();
        ((dog) ani).bark();
        ani.printdata();
        System.out.println("enter the details for Cat");
        ani = new cat();
        ani.getData();
        ani.eat();
        ani.sleep();
        ((cat) ani).meow();
        ani.printdata();
        System.out.println("enter the details for LiOn");
        ani = new lion();
        ani.getData();
        ani.eat();
        ani.sleep();
        ((lion) ani).roar();
        ani.printdata();
    }
}