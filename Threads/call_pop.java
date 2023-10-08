package Synchronization;

import Synchronization.Stack;

public class call_pop implements Runnable {
    Stack s;

    public call_pop(Stack s) {
        this.s = s;
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("popped:" + s.pop());
        }
    }
}
