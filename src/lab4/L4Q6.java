package lab4;

import java.util.Random;
public class L4Q6 {
    public static void main(String[] args) {
        Random x = new Random();
        int num = x.nextInt();
        if (num<0)
            num = num*-1;
        // num = Math.abs(num);
        System.out.println(num);
        String number = ""+num;
        System.out.println("Number of digit in the integer: "+number.length());
    }
}
