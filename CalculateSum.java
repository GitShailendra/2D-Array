public class CalculateSum {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        calculateSum(matrix);
    }
    public static void calculateSum( int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            int countRowSum = 0;
            for(int j = 0 ; j<m; j++){
                countRowSum = countRowSum+matrix[i][j];
            }
            System.out.println("The sum of row " + (i+1) + " is " + countRowSum);
        }
    }
}
