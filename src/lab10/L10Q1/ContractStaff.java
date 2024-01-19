package lab10.L10Q1;

public class ContractStaff extends Employee{
    private double totalSales;

    public ContractStaff(String name, double totalSales){
        super(name,"Contract Staff");
        this.totalSales = totalSales;
    }
    @Override
    public double getTotalSalary(){
        return 500+0.5*totalSales;
    }
}
