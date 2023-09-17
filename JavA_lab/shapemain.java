class shape {
    public double dim1, dim2, dim3;
    final double pi = 3.14;

    public void setdim(double a, double b, double c) {
        dim1 = a;
        dim2 = b;
        dim3 = c;
    }

    public void setdim(double a) {
        dim1 = a;
    }

    public void setdim(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    public double computeArea() {
        return 0;
    }
}

class Circle extends shape {
    void dis() {
        System.out.println("hi");
    }

    public void setdim(double radius) {
        super.setdim(radius);
    }

    public double computeArea() {
        return pi * dim1 * dim1;
    }
}

class rectangle extends shape {
    public void setdim(double length, double width) {
        super.setdim(length, width);
    }

    public double computeArea() {
        return dim1 * dim2;
    }
}

class triangle extends shape {
    double s;

    public void setdim(double a, double b, double c) {
        super.setdim(a, b, c);
        s = (dim1 + dim2 + dim3) / 3;

    }

    public double computeArea() {
        double ar = s * (s - dim1) * (s - dim2) * (s - dim3);
        return Math.sqrt(ar);
    }
}

class shapemain {
    public static void main(String args[]) {
        shape sh;
        sh = new Circle();
        sh.setdim(4.5);
        System.out.println("area of circle is:" + sh.computeArea());
        rectangle rect = new rectangle();
        rect.setdim(3.0, 4.0);
        System.out.println("area of rectangle is:" + rect.computeArea());
        sh = new triangle();
        sh.setdim(2.0, 1.0, 2.4);
        System.out.println("area of triangle is:" + sh.computeArea());
    }
}
