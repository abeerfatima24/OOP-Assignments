public class Triangle {
    // Attributes
    private Point p1;
    private Point p2;
    private Point p3;

    // Default constructor 
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    // Parameterized constructor
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    //  Getters 
    public Point getP1() { return this.p1; }
    public Point getP2() { return this.p2; }
    public Point getP3() { return this.p3; }

    //  Setters
    public void setP1(Point p1) { this.p1 = p1; }
    public void setP2(Point p2) { this.p2 = p2; }
    public void setP3(Point p3) { this.p3 = p3; }

    //  Perimeter
    public double perimeter() {
        double side1 = p1.distanceFrom(p2);
        double side2 = p2.distanceFrom(p3);
        double side3 = p3.distanceFrom(p1);
        return side1 + side2 + side3;
    }

    //  Area 
    public double area() {
        double x1 = p1.getX(), y1 = p1.getY();
        double x2 = p2.getX(), y2 = p2.getY();
        double x3 = p3.getX(), y3 = p3.getY();
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    // Type of triangle 
    public String triangleType() {
        double a = p1.distanceFrom(p2);
        double b = p2.distanceFrom(p3);
        double c = p3.distanceFrom(p1);

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    //  toString()
    @Override
    public String toString() {
        return "Triangle[" + p1 + ", " + p2 + ", " + p3 + "]";
    }
}
