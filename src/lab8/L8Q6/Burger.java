package lab8.L8Q6;

public class Burger {
    private String ID;
    private int numberBurgerSold;
    private static int  total;

    public Burger (String ID){
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public int getNumberBurgerSold() {
        return numberBurgerSold;
    }

    public static int getTotal() {
        return total;
    }

    public void sold (int amount){
        numberBurgerSold+=amount;
        total+=amount;
    }
}
