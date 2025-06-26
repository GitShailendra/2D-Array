public class CalculateColumnSum {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        calculateColumnSum(matrix);
    }
    public static void calculateColumnSum (int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            int columSum = 0;
            for(int j=0; j<m; j++){
                columSum = columSum+matrix[j][i];
            }
            System.out.println("curent sum of colums is "+columSum);
        }
    }
}
