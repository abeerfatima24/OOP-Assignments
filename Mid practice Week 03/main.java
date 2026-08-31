public class main {
    public static void main(String[] args) {
        point p1=new point(1,2);
        point p2=new point(3,4);
        point p3=new point(5,6);
        triangle t1=new triangle(p1,p2,p3);
        System.out.println(t1.toString());
    }
    
}
