package Synchronization;

import Synchronization.Stack;
import Synchronization.call_Push;
import Synchronization.call_pop;

public class Synchro_Stack {
    public static void main(String args[]) {
        Stack s = new Stack(5);

        Thread t1 = new Thread(new call_Push(s));
        Thread t2 = new Thread(new call_pop(s));
        t1.start();
        t2.start();

    }
}
