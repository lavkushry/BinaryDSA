package classes_and_objects;

public class ComplexNumberUse {

    public static void main(String[] args) {
        // Creating complex numbers
        ComplexNumbers c1 = new ComplexNumbers(2, 3);
        c1.print();

        // Modifying the values
        c1.setReal(4);
        c1.setImaginary(10);
        c1.print();

        // Creating another complex number
        ComplexNumbers c2 = new ComplexNumbers(2, 3);

        // Adding c2 to c1
        c1.add(c2);
        c1.print();
        c2.print();

        // Creating another complex number
        ComplexNumbers c3 = new ComplexNumbers(2, 3);

        // Multiplying c3 with c2
        c3.multiply(c2);
        c3.print();
        c2.print();

        // Adding c1 and c2 to create a new complex number c4
        ComplexNumbers c4 = ComplexNumbers.add(c1, c2);
        c1.print();
        c2.print();
        c4.print();
    }
}
