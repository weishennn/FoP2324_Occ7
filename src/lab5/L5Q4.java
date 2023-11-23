package lab5;

public class L5Q4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("After rotates 90 degrees clockwise ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 2; j >=0; j--) {
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }

    }
}