package lab8.L8Q1;

public class Tester {
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4, 50);
        System.out.println("Number a: ");
        displayNumber(a);
        System.out.println("Number b: ");
        displayNumber(b);
        System.out.println("Number c: ");
        displayNumber(c);
    }
    static void displayNumber(Number n){
        n.display();
        System.out.println();
    }
}
