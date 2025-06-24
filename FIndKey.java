public class FIndKey {
    public static void main(String[] args) {
        int matrix [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int key = 5;
        findKey(matrix, key);
    }
    public static boolean findKey(int matrix[][], int key){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at: " + i + ", " + j);
                    return true;
                }
            }
        }
        return false;
    }
}
