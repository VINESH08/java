class lock {
    void print(int n) {
        synchronized (this) {
            for (int i = 1; i < 11; i++) {
                System.out.println(n + " * " + i + "=" + n * i);
            }
        }
    }
}

class multiplication implements Runnable {
    lock obj;
    int n;

    multiplication(lock obj, int n) {
        this.obj = obj;
        this.n = n;
    }

    public void run() {
        obj.print(n);
    }

}

class Table2 {
    public static void main(String args[]) {
        lock lockobj = new lock();
        multiplication thread1 = new multiplication(lockobj, 2);
        multiplication thread2 = new multiplication(lockobj, 10);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        for (int i = 1; i < 11; i++) {
            System.out.println("5*" + i + "=" + 5 * i);
        }
        t1.start();
        /*
         * try {
         * t1.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         */
        t2.start();
    }
}
