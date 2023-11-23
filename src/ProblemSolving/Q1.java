package ProblemSolving;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinate X and Y: ");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.print("Enter the move: ");
        String move = sc.next();
        System.out.println("Initial coordinate ("+X+","+Y+")");
        for(int i =0; i<move.length(); i++){
            if(move.charAt(i)=='L') {
                X = X - 1;
            }
            else if(move.charAt(i)=='R') {
                X = X + 1;
            }
            else if(move.charAt(i)=='D') {
                Y = Y - 1;
            }
            else if (move.charAt(i)=='U') {
                Y = Y + 1;
            }
        }
        System.out.println("Final coordinate ("+X+","+Y+")");
    }
}