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
    public db(String st) {// calling the super calss constructor of thread class
        super(st);
    }

    public void run() {// if run method is not being provided then ob1.start() will not be executed
                       // since no run method is present in db class
        for (int i = 1; i < 6; i++) {
            System.out.println("updating db " + Thread.currentThread());// To get full thread name use
                                                                        // Thread.currentThread().getName()
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
        db ob1 = new db("Vinesh Db");
        Thread t = new Thread(ob);// if implemented then create a object for thread class and link the relation
                                  // between the class object and thread class by passing it to the constructor
        t.start();
        ob1.start();
    }
}