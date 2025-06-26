public class PrintCol {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printCol(matrix);
    }
    public static void printCol (int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
            
        }
    }
}
