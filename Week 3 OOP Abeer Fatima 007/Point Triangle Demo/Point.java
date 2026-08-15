public class Point {
    //Attributes
    private double x;
    private double y;

    // Null constructor 
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor 
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // COPY CONSTRUCTOR 
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getters  
    public double getX() { return this.x; }
    public double getY() { return this.y; }  

    //Setters
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    //  ADDITION of two points
    public Point add(Point other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        return new Point(newX, newY);
    }

    //  SUBTRACTION of two points 
    public Point subtract(Point other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        return new Point(newX, newY);
    }

    //  Distance (bonus, useful for Triangle class) 
    public double distanceFrom(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //  toString() 
    // Java calls this AUTOMATICALLY when you print the object
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
