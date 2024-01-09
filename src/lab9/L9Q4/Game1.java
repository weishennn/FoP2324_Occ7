package lab9.L9Q4;
import java.util.Random;
public class Game1 extends Dice{
    Random x = new Random();

    public int rollDice(String name, int total) {
        int dice1;
        int dice2;
            do {
                dice1 = x.nextInt(6) + 1;
                dice2 = x.nextInt(6) + 1;
                total += dice1 + dice2;
                if(total>100) {
                    total -=dice2;
                    if(total>100)
                        total -=dice1;
                }
                if (total==100) break;
            } while (dice1 == dice2);
            return total;
    }
}