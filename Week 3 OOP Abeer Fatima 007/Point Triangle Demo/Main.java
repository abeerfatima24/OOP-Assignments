public class Main {
    public static void main(String[] args) {
        // Point addition/subtraction/copy constructor demo 
        Point a = new Point(2, 3);
        Point b = new Point(4, 1);

        Point sum = a.add(b);          // addition -> new Point
        Point diff = a.subtract(b);    // subtraction -> new Point
        Point copy = new Point(a);     // copy constructor

        System.out.println("a = " + a);         // toString() called automatically
        System.out.println("b = " + b);
        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);
        System.out.println("copy of a = " + copy);

        // prove copy is a SEPARATE object (not sharing memory with a)
        copy.setX(999);
        System.out.println("after changing copy.x -> a is still: " + a);
        System.out.println("copy is now: " + copy);

        System.out.println("------------------------");

        // Triangle demo
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);

        Triangle t = new Triangle(p1, p2, p3);
        System.out.println("Triangle: " + t);
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Area: " + t.area());
        System.out.println("Type: " + t.triangleType());
    }
}