package lab8.L8Q4;
public class Tester {
    public static void main(String[] args) {
        System.out.print("Enter numerator: ");
        int numerator = Fraction.inputNumerator();
        System.out.print("Enter denominator: ");
        int denominator = Fraction.inputDenominator();
        Fraction fraction = new Fraction(numerator, denominator);
        fraction.displayLowestTerm();
    }
}
