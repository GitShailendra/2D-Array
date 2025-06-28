public class ReverseRow {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3},
                { 4, 5, 6 },
                { 7, 8, 9},
        };
        
        reverseRow(matrix);
    }
    public static void reverseRow(int [][]matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int last =  m-1;
                int first = 0;
                while(first<last){
                    int temp = matrix[i][last];
                    matrix[i][last] = matrix[i][first];
                    matrix[i][first] = temp;
                    first++;
                    last--;
                    
                } 

            }
        }
        // Print the reversed matrix
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
