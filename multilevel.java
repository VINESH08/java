class Grandparent {
    public void show() {
        System.out.println("This is Grandparent class");
    }
}

class Parent extends Grandparent {
    public void showParent() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    public void showChild() {
        System.out.println("This is Child class");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.show(); // Accessible due to public modifier in Grandparent
        c.showParent(); // Accessible due to public modifier in Parent
        c.showChild(); // Accessible due to public modifier in Child
    }
}
