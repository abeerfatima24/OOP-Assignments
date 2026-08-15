public class ComplexNumber {
    // ---- Attributes ----
    private double real;
    private double imaginary;

    // Default constructor
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy constructor
    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    // Getters
    public double getReal() { return this.real; }
    public double getImaginary() { return this.imaginary; }

    // Setters
    public void setReal(double real) { this.real = real; }
    public void setImaginary(double imaginary) { this.imaginary = imaginary; }

    // Addition:
    // Formula : (a+bi) + (c+di) = (a+c) + (b+d)i
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtraction
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Multiplication:
    // Formula : (a+bi)(c+di) = (ac - bd) + (ad + bc)i
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    // toString()
    @Override
    public String toString() {
        if (this.imaginary >= 0) {
            return this.real + " + " + this.imaginary + "i";
        } else {
            return this.real + " - " + Math.abs(this.imaginary) + "i";
        }
    }
}