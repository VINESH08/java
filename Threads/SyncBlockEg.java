// Synchronized block
class Callme {
    Object lock;

    Callme() {
        lock = new Object();
    }

    void call(String msg) {
        synchronized (this) {// use this or lock in brackets
            System.out.print("[" + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("]");
        }
    }
}

class Caller extends Thread {
    Callme target;
    String message;

    Caller(Callme c, String s) {
        target = c;
        message = s;
    }

    public void run() {
        // synchronized (target) {
        target.call(message);
        // }
    }
}

class SyncBlockEg {
    public static void main(String args[]) {
        Callme obj = new Callme();
        Caller one = new Caller(obj, "Hello");
        Caller two = new Caller(obj, "Synchronized");
        Caller three = new Caller(obj, "Example");
        one.start();
        two.start();
        three.start();
    }
}