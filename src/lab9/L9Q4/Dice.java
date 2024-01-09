package lab9.L9Q4;

public class Dice {
    public void start(){
        int total1=0;
        int total2=0;


        while(true){
            total1 = rollDice("Player 1",total1);
            if(total1>=100) {
                System.out.println("Winner is Player 1 "+total1);
                break;
            }
            total2 = rollDice("Player 2",total2);
            if(total2>=100) {
                System.out.println("Winner is "+"PLayer 2 "+total2);
                break;
            }
        }
    }
    public int rollDice(String name,int total){
        return total;
    }

}

