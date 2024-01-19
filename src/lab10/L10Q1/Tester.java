package lab10.L10Q1;

public class Tester {
    public static void main(String []args){
        PermanentEmployee permanentEmployee = new PermanentEmployee("ALi",'A');
        ContractStaff contractStaff = new ContractStaff("Abu",5500);
        TemporaryStaff temporaryStaff = new TemporaryStaff("Ahsan",200);
        System.out.println(permanentEmployee+"\n"+contractStaff+"\n"+temporaryStaff);
    }
}
