package lab3;

import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        Random x = new Random();
        int total1 =0;
        int total2 = 0;
        for (int i = 1; i < 3; i++) {
            int dice1 = x.nextInt(6) + 1;
            int dice2 = x.nextInt(6) + 1;
            System.out.println("Round "+i+": Player 1: "+dice1+" Player 2: "+dice2);
            total1 += dice1;
            total2 += dice2;
        }
        if(total1>total2)
            System.out.println("The winner is player 1. ");
        else if(total1==total2)
            System.out.println("Tie. ");
        else
            System.out.println("The winner is player 2. ");

    }
}