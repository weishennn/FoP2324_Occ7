package lab8.L8Q5;

public class Tester {
    public static void main(String[] args) {
        Game player1 = new Game("Ali");
        Game player2 = new Game("Abu");
        while(player1.getMarks()<=100 || player2.getMarks()<=100){
            player1.rollDice();
            player2.rollDice();
            if(player1.getMarks()>=100) {
                System.out.println("Winner is " + player1.getName());
                System.out.println("Mark: "+player1.getMarks());
                break;
            }
            else if(player2.getMarks()>=100){
                System.out.println("Winner is "+player2.getName());
                System.out.println("Mark: "+player2.getMarks());
                break;
            }
        }
    }
}


