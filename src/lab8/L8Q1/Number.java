package lab8.L8Q1;
import java.util.Random;

public class Number {
    private final int [] numbers;
    public Number(){
        this(10);
    }
    public Number(int N){
        this(N,100);
    }
    public Number(int N, int max){
        Random random = new Random();
        numbers = new int[N];
        for(int i=0; i<N;i++){
            numbers[i]= random.nextInt(max+1);
        }
    }
    public void displayAllNumbers(){
        System.out.print("All numbers: ");
        for (int number : numbers) System.out.print(number + " ");
        System.out.println();
        }
    void displayAllEven() {
        System.out.print("Even numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }
        System.out.println();
    }
    void displayPrime(){
        System.out.print("Prime numbers: ");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    boolean isPrime(int n){
        for (int i=0;i< numbers.length;i++){
            if(n==1) return false;
            for(int j=2;j<i/2;j++)
                if((n%j)==0) return false;
        }
        return true;
    }
    void displayMax(){
        System.out.print("Maximum number: ");
        int max =numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        System.out.print(max);
        System.out.println();
    }
    void displayMin(){
        System.out.print("Minimum number: ");
        int min = numbers[0];
        for (int number : numbers) {
            min = Math.min(min, number);
        }
        System.out.print(min);
        System.out.println();
    }
    void displayAverage(){
        System.out.print("Average: ");
        int total=0;
        for (int number : numbers) {
            total += number;
        }
        double average = (double)total/numbers.length;
        System.out.print(average);
        System.out.println();
    }
    void displaySquare(){
        System.out.print("Square numbers: ");
        for (int number : numbers) {
            double temp = Math.sqrt(number);
            if (temp == (int) temp) System.out.print(number + " ");
        }
        System.out.println();
    }
    void display(){
        displayAllNumbers();
        displayAllEven();
        displayPrime();
        displayMax();
        displayMin();
        displayAverage();
        displaySquare();
    }
}
