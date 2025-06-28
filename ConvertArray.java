public class ConvertArray {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3},
                { 4, 5, 6 },
                { 7, 8, 9},
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int[] arr = new int[n * m];
        // Convert the 2D array to a 1D array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        convertArray(matrix, arr, n, m);
    }
    public static void convertArray (int [][] matrix, int[] arr, int n, int m){
        int idx = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                arr[idx] = matrix[i][j];
                idx++;
            }
        }
        // Print the converted array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
