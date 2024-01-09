package lab9.L9Q1;

public class Rectangle extends Shape{
    private double side;
    private double length;
    public Rectangle(double side,double length){
        this.side = side;
        this.length=length;
        compute();
    }
    public void compute (){
        setPerimeter(2*side+2*length);
        setArea(side*length);
    }

}
