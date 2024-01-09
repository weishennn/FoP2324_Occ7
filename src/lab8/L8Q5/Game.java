package lab8.L8Q5;

import java.util.Random;

public class Game {
    private String name;
    private int dice;
    private int marks;
    public Game(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }

    public int rollDice(){
        Random random = new Random();
        dice = random.nextInt(6)+1;
        marks += dice ;
        return marks;
    }
}
