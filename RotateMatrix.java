/**
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 
bytes, write a method to rotate the image by 90 degrees. Can you do this in place? 
 */
public class RotateMatrix
{
	public static void main(String[] args) {
		int matrix[][]={{ 1, 2, 3, 4 }, { 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 }};
		RotateMatrix obj = new RotateMatrix();
		boolean output = obj.rotate(matrix);
		System.out.println(output);
	}
	
	boolean rotate(int[][] matrix){
       if(matrix.length == 0 || matrix.length != matrix[0].length) return false;
       int n = matrix.length;
       for(int layer = 0; layer<n/2;layer++){
           int first = layer;
           int last = n-1-layer;
           for(int i = first;i<last;i++){
               int offset = i -first;
               int top = matrix[first][i];
               // left -> top 
               matrix[first][i] = matrix[last-offset][first]; 
               // bottom -> left
               matrix[last-offset][first] = matrix[last][last - offset];
               // right -> bottom  
               matrix[last][last - offset] = matrix[i][last]; 
               //top -> right 
               matrix[i][last] = top; // right <- saved top
           }
       }
       return true; 
    }
	
}
//runtime : o(n^2)
//space : o(1)
