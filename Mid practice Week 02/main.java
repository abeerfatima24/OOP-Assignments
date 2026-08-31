public class main {
    public static void main (String [] args){
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
    
}
