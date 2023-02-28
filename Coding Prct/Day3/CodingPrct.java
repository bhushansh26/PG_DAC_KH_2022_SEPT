public class CodingPrct{
	
    
    // A function to rotate the matrix anti-clockwise
    public static int[][] rotateMatrix(int[][] matrix) {
        
        int n = matrix.length;
        
        
        return matrix;
    }
    
    // A function to print the matrix
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
			
	
        }
    }
    
    // Main function to test the program
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
						  {4, 5, 6}, 
						  {7, 8, 9}};
						  /*
							{00,01,02}
							{10,11,12}
							{20,21,22}}
						  */
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println("Rotated Matrix:");
        printMatrix(rotateMatrix(matrix));
    }


}