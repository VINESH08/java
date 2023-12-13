public class Priority extends Thread {
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String args[]) {
        Priority p1 = new Priority();
        Priority p2 = new Priority();
        p1.setPriority(MAX_PRIORITY);
        System.out.println("Priority of 1:" + p1.getPriority());
        p2.setPriority(7);
        System.out.println("Priority of 2:" + p2.getPriority());
        p1.start();
        p2.start();
    }
}
