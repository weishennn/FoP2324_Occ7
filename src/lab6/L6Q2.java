package lab6;

public class L6Q2 {
    public static void main(String[] args) {
        System.out.println("Triangle 1: ");
        for(int i=1;i<=7;i++){
            multiPrint(i,'*');
            System.out.println();
        }
        System.out.println();
        System.out.println("Triangle 2: ");
        for(int i=1,row =7;i<=13;i+=2) {
            multiPrint(--row, ' ');
            multiPrint(i, '*');
            System.out.println();
        }
        System.out.println();
        System.out.println("Diamond: ");
        for(int i=1, j=3, row=1;row<=7;row++) {
            multiPrint(j, ' ');
            multiPrint(i, '*');
            System.out.println();
            if(row<4){
                i+=2;
                j--;
            }
            else {
                i-=2;
                j++;
            }
        }
    }

    public static void multiPrint(int n, char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
        }
    }
}