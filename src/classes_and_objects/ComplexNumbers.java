package classes_and_objects;

public class ComplexNumbers {
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public int getReal() {
        return real;
    }
    public int getImaginary() {
        return imaginary;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    public void add(ComplexNumbers other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public void multiply(ComplexNumbers other) {
        int newReal = this.real * other.real - this.imaginary * other.imaginary;
        int newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        this.real = newReal;
        this.imaginary = newImaginary;
    }
    public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumbers F= new ComplexNumbers(newReal, newImaginary);
        return F;
    }
    public void print() {
        System.out.println(real + " + " + imaginary + "i");
    }

}
