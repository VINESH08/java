package p1;

public class one {
    public int key;

    public one(int val) {
        key = val;
    }

    public boolean search(int x[]) {
        boolean res;
        res = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == key)
                res = true;
        }
        return res;
    }
}