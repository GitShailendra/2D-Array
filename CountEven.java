public class CountEven {
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,12,14}
        };
        countEven(matrix);
    }
    public static void countEven( int matrix[][]){
        int n= matrix.length;
        int m=matrix[0].length;
        int evenCount = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]%2 == 0){
                    evenCount++;
                }
            }
        }
        System.out.println("The count of even numbers in a given matrix is " + evenCount);
    }
}
