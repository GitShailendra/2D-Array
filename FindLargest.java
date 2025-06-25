public class FindLargest {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 12, 6},
            {7, 8, 9}
        };
        int largest = findLargest(matrix);
        System.out.println("Largest element in the matrix is: " + largest);

    }
    public static int findLargest(int matrix[][]){
        int largest = Integer.MIN_VALUE; 
        int n= matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            
                if(matrix[i][j] >largest){
                    largest = matrix[i][j];
                }
            }
        }
        return largest; 
    }
}