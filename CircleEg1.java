
class CircleEg1 {
    double radius, area;

    public static void main(String args[]) {
        CircleEg1 cirobj; // creating reference
        cirobj = new CircleEg1(); // creating object
        cirobj.radius = 5;
        cirobj.area = 3.14 * cirobj.radius * cirobj.radius;
        System.out.println(cirobj.area);

    }
}