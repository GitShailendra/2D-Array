public class PrintDiagonal {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3,4,5 },
                { 4, 5, 6, 5, 6 },
                { 7, 8, 9, 10, 11 },
                { 12, 13, 14, 15, 16 },
        };
        printDiagonal(matrix);

    }
    public static void printDiagonal(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
