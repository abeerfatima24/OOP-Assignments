public class RationalNumber {
    // Attributes
    private int numerator;
    private int denominator;

    // Default constructor
    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Parameterized constructor (with validation)
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be 0. Setting to 1 instead.");
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Copy constructor
    public RationalNumber(RationalNumber other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    // Getters
    public int getNumerator() { return this.numerator; }
    public int getDenominator() { return this.denominator; }

    // Setters
    public void setNumerator(int numerator) { this.numerator = numerator; }
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    // Helper: greatest common divisor (for simplifying)
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Simplify fraction, e.g. 4/8 -> 1/2
    public final void simplify() {
        int commonDivisor = gcd(this.numerator, this.denominator);
        if (commonDivisor != 0) {
            this.numerator /= commonDivisor;
            this.denominator /= commonDivisor;
        }
    }

    // Addition:
    // a/b + c/d = (ad + bc) / bd
    public RationalNumber add(RationalNumber other) {
        int newNum = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDen = this.denominator * other.denominator;
        return new RationalNumber(newNum, newDen);
    }

    // Subtraction
    public RationalNumber subtract(RationalNumber other) {
        int newNum = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int newDen = this.denominator * other.denominator;
        return new RationalNumber(newNum, newDen);
    }

    // toString()
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}