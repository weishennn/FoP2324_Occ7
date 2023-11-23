package lab6;

public class L6Q1 {
    public static void main(String[] args) {
        String num = "";
        for (int i = 1; i <= 20; i++) {
            num += triangularNum(i) + ", ";
        }
        System.out.print(num.substring(0, num.length() - 2));
    }
    public static int triangularNum(int n){
        int total = 0;
        for(int i=1; i<=n;i++){
            total +=i;
        }
        return total;
    }
}