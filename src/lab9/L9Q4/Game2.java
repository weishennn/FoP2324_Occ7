package lab9.L9Q4;

import java.util.Random;

public class Game2 extends Dice {
    Random x = new Random();
    public int rollDice(String name, int total) {
        int dice1 = x.nextInt(6) + 1;
        if (dice1 != 6) {
            if (total + dice1 <= 100)
                total += dice1;
            if(total>100) total-=dice1;
        }
        else {
            int dice2 = x.nextInt(6) + 1;
            if (dice2 != 6) {
                if (total + dice1 <= 100) {
                    total += dice1;
                    if (total + dice2 <= 100)
                        total += dice2;
                }
                if(total>100) total-=dice2;
            }
        }
        return total;
    }
}
