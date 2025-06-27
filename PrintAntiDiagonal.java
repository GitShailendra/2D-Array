public class PrintAntiDiagonal {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3},
                { 4, 5, 6 },
                { 7, 8, 9},
        };
        printAntiDiagonal(matrix);
    }
    public static void printAntiDiagonal (int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i + j == n - 1){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
