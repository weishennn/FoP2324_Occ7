package lab8.L8Q6;

public class Tester {
    public static void main(String[] args) {
        Burger burgerStall1 = new Burger("1");
        Burger burgerStall2 = new Burger("2");
        Burger burgerStall3 = new Burger("3");
        Burger burgerStall4 = new Burger("4");
        burgerStall1.sold(30);
        burgerStall2.sold(40);
        burgerStall3.sold(50);
        burgerStall4.sold(25);
        System.out.println("Burger Stall    Burger sold");
        display(burgerStall1);
        display(burgerStall2);
        display(burgerStall3);
        display(burgerStall4);
        System.out.println("Total burger sold: "+Burger.getTotal());
    }
    static void display(Burger stall){
        System.out.printf("%7s%16d\n",stall.getID(),stall.getNumberBurgerSold());
    }
}
