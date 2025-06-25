public class FindSmallest {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 12, 6},
            {7, 8, 9}
        };
        int smallest = findSmallest(matrix);
        System.out.println("Smallest element in the matrix is: " + smallest);
    }
    public static int findSmallest (int matrix[][]){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix cannot be null or empty");
        }
        int smallest = Integer.MAX_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }
}
