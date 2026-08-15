/*
 * File: MainDemo.java
 * Purpose: Creates and tests ComplexNumber and RationalNumber objects.
 * Folder: ComplexRationalDemo
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(" COMPLEX NUMBER DEMO ");

        // Normal case
        ComplexNumber c1 = new ComplexNumber(3, 5);      // 3 + 5i
        ComplexNumber c2 = new ComplexNumber(2, -4);     // 2 - 4i

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        ComplexNumber sum = c1.add(c2);
        ComplexNumber diff = c1.subtract(c2);
        ComplexNumber product = c1.multiply(c2);

        System.out.println("c1 + c2 = " + sum);
        System.out.println("c1 - c2 = " + diff);
        System.out.println("c1 * c2 = " + product);

        //  Copy constructor
        ComplexNumber c3 = new ComplexNumber(c1);
        System.out.println("c3 (copy of c1) = " + c3);
        c3.setReal(100);   // change copy
        System.out.println("after changing c3 -> c1 is still: " + c1);
        System.out.println("c3 is now: " + c3);

        // Edge case: zero imaginary part 
        ComplexNumber c4 = new ComplexNumber(7, 0);   // purely real
        System.out.println("Edge case (zero imaginary): " + c4);

        System.out.println();
        System.out.println("RATIONAL NUMBER DEMO ");

        // Normal case 
        RationalNumber r1 = new RationalNumber(1, 2);   // 1/2
        RationalNumber r2 = new RationalNumber(1, 3);   // 1/3

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        RationalNumber rSum = r1.add(r2);
        RationalNumber rDiff = r1.subtract(r2);

        System.out.println("r1 + r2 = " + rSum);   // 5/6
        System.out.println("r1 - r2 = " + rDiff);  // 1/6

        // Simplify demo 
        RationalNumber r3 = new RationalNumber(4, 8);   // should auto-simplify to 1/2
        System.out.println("4/8 simplified = " + r3);

        //  Copy constructor
        RationalNumber r4 = new RationalNumber(r1);
        System.out.println("r4 (copy of r1) = " + r4);

        //  Edge case: zero denominator (should be handled, not crash) 
        System.out.println("Edge case - denominator 0:");
        RationalNumber r5 = new RationalNumber(5, 0);
        System.out.println("r5 = " + r5);

        // Edge case: numerator 0 
        RationalNumber r6 = new RationalNumber(0, 7);
        System.out.println("Edge case - numerator 0: " + r6);
    }
}