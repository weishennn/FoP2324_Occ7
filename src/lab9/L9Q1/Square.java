package lab9.L9Q1;

public class Square extends Shape{
    private double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
        compute();
        }
    public void compute (){
        setPerimeter(4*sideLength);
        setArea(sideLength*sideLength);
    }

}
