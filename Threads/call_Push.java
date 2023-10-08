package Synchronization;

import Synchronization.Stack;

public class call_Push implements Runnable {
    Stack s;

    public call_Push(Stack s) {
        this.s = s;
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Pushed:" + s.push(100));

        }
    }
}
