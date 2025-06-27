public class CountRowColumn {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3,4,5},
            {4,5,6,5,6},
            
        };
        int rowCount = matrix.length; // Number of rows
        int colCount = matrix[0].length; // Number of columns
        System.out.println("Number of rows: " + rowCount);
        System.out.println("Number of columns: " + colCount);
    }
}
