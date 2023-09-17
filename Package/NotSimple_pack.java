package notmypack;

import mypack.*;

class NotSimple_pack {
    public static void main(String[] args) {
        Simple_pack obj = new Simple_pack();
        Simple_pack2 obj2 = new Simple_pack2();
        obj.hello();
        obj2.hello2();
    }
}
