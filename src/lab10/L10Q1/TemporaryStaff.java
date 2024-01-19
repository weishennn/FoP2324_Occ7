package lab10.L10Q1;

public class TemporaryStaff extends Employee{
    private double hour;

    public TemporaryStaff(String name, double hour){
        super(name,"Temporary Staff");
        this.hour = hour;
    }

    @Override
    public double getTotalSalary(){
        return 15*hour;
    }
}
