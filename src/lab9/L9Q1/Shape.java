package lab9.L9Q1;

public class Shape{
    private String name;
    private double perimeter;
    private double area;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    public void display(String name,double perimeter,double area){
        System.out.printf("Name of shape: %s Perimeter: %.2f Area: %.2f\n",name,perimeter,area);
    }

}


