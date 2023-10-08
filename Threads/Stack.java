package Synchronization;

public class Stack {
    private int array[];
    private int stackTop;
    Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }

    public synchronized boolean push(int val) {
        // synchronized (lock) {
        if (isFull())
            return false;
        stackTop++;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        array[stackTop] = val;
        return true;
        // }

    }

    public synchronized int pop() { // might give array index out of bounds exception either from push or pop
        // because the two methods run parallely and the index may go negative..
        // synchronized (lock) {
        if (isEmpty())
            return Integer.MIN_VALUE;
        int data = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        stackTop--;
        return data;
        // }
    }

}
// We can use 2 lock objects as well but thats not use in our case since for
// example if say t1,t2,t3 are three different threads and t2 calls push under
// lock object then t1,and t3 cant call push as well as the pop too

// whenever we are using a synchronized block we require an explicit lock of
// type Object (for a particular piece of code go with synchronized block) if
// you want the entire method to be synchronized use synchronized keyword before
// method name......
