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
// Q)why we are passing object to thread class while only implementing it?
/*
 * If we look into the definetion of the thread class since it implements the
 * runnable interface
 * so it must have provided an implementation of the run method so according to
 * that implementation
 * there is a instance named task(in my case) of runnable class which calls the
 * run only if task is not null
 * so to make the task as not null we have to pass object of runnable interface
 * to the constructor of the thread class
 * ...................
 * but while extending we actually override the run method and assigining
 * the(instantiationing our own class)
 * class instance to the thread
 * class and calling the start method
 */