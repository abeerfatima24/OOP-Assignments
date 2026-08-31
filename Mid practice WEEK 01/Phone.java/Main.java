public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("Apple", "iPhone 13", 999.99);
        Phone p2 = new Phone(p1); // Using copy constructor

        System.out.println("Phone 1: " + p1.brand + " " + p1.model + " $" + p1.price);
        System.out.println("Phone 2: " + p2.brand + " " + p2.model + " $" + p2.price);
    }
}