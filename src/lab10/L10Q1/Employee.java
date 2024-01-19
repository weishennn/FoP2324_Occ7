package lab10.L10Q1;

public abstract class Employee {
    private String name;
    private String type;

    public Employee(String name, String type){
        this.name = name;
        this.type=type;
    }

    public abstract double getTotalSalary();




    public String toString(){
        return String.format("Name: %s \nEmployee Type: %s\nTotal Salary per Month: %.2f\n",name,type,getTotalSalary());
    }
}
