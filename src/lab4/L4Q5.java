package lab4;

import java.util.*;

public class L4Q5 {
    public static void main(String[] args) {
        Random x = new Random();
        int total1 = 0;
        int total2 = 0;
        int dice1 , dice2;
        while(total2<100) {
            do {
                dice1 = x.nextInt(6) + 1;
                total1 = total1 + dice1;
            }
            while (dice1 == 6&&total1<100);
            if(total1>=100)
                break;
            do {
                dice2 = x.nextInt(6) + 1;
                total2 += dice2;
            }
            while (dice2 == 6&&total2<100);
        }
        System.out.println("PLayer 1: "+total1);
        System.out.println("Player 2: "+total2);
        if(total1>=100)
            System.out.println("The winner is Player 1. ");
        else
            System.out.println("The winner is Player 2. ");
    }
}