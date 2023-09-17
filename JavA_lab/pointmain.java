class point {
    private double x;
    private double y;

    point() {
        x = 0;
        y = 0;
    }

    point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    point(point obj) {
        x = obj.x;
        y = obj.y;
    }

    public double findDistance(double A, double B) {
        double a = Math.pow(A - this.x, 2);
        double b = Math.pow(B - this.y, 2);
        double c = a + b;
        return Math.sqrt(c);
    }

    public double findDistance(point obj) {
        double a = Math.pow(this.x - obj.x, 2);
        double b = Math.pow(this.y - obj.y, 2);
        double c = a + b;
        return Math.sqrt(c);
    }
}

class pointmain {
    public static void main(String args[]) {
        point p1 = new point(3.25, 7.89);
        point p2 = new point(5.37, 18.12);
        point p3 = new point(p2);
        double res1 = p1.findDistance(7.9, 16.25);
        System.out.format("The distance between p1 and point is: %.3f\n ", res1);
        double res2 = p1.findDistance(p3);
        System.out.format("The distance betwwen p1 and p3 is: %.3f \n", res2);

    }
}