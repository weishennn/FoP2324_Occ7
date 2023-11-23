package ProblemSolving;

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Random x = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of staff[N]: ");
        int N = sc.nextInt();
        int [] staff = new int[N];
        int id;
        int MAX = 99999;
        int MIN = 10000;
        for(int i=0; i<staff.length;i++){
            id = x.nextInt(MAX-MIN+1)+MIN;
            System.out.println(id);
            if((id/10%10%2==0)&&(id/1000%10%2!=0)) {
                System.out.println("Weekend Duty");
            }
            else {
                System.out.println("Weekend off");
            }
        }
    }
}
