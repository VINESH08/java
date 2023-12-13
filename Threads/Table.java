class addition implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        for (int i = 1; i < 11; i++) {
            System.out.println("10+" + i + "=" + (10 + i));
        }
    }
}

class subtraction implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        for (int i = 1; i < 11; i++) {
            System.out.println("10-" + i + "=" + (10 - i));
        }
    }
}

class multiplication implements Runnable {
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            System.out.println("10*" + i + "=" + (10 * i));
        }
    }
}

class Table {
    public static void main(String args[]) throws InterruptedException {
        addition add = new addition();
        subtraction sub = new subtraction();
        multiplication mul = new multiplication();
        Thread t1 = new Thread(add);
        Thread t2 = new Thread(sub);
        Thread t3 = new Thread(mul);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
