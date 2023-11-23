package lab2;

import java.util.Random;

public class L2Q5_loop {
    public static void main(String[] args) {
        Random x = new Random();
        int num = x.nextInt(10001);
        System.out.println(num);
        int total = 0;
        while(num!=0){
            total = total + num % 10;
            num = num / 10;
        }
        System.out.println(total);
    }
}