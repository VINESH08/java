class print implements Runnable {// insted of using extends its better to use interface runnable so that it can
    // extend other classes as well
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}

class db extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("updating db");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class basicthread {
    public static void main(String args[]) {
        print ob = new print();
        db ob1 = new db();
        Thread t = new Thread(ob);// if implemented then create a object for thread class and link the relation
                                  // between the class object and thread class by passing it to the constructor
        t.start();
        ob1.start();
    }
}