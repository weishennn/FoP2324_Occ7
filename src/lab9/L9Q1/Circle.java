package lab9.L9Q1;

public class Circle extends Shape {
    private double diameter;
    public Circle(double diameter){
        this.diameter = diameter;
        compute();
    }
    public void compute (){
        setPerimeter(diameter*Math.PI);
        setArea(Math.pow(diameter/2,2)*Math.PI);
    }
}
