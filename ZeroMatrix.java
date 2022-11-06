/**
Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and 
column are set to 0. 
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Main obj = new Main();
		int[][] matrix = {{1,0,1,1,1},{0,1,1,1,1},{1,1,1,1,1}};
		obj.zeroMatrix(matrix,matrix.length,matrix[0].length);
	}
	void zeroMatrix(int[][] matrix, int m, int n){
	    int i,j;
	    boolean[] row = new boolean[m];
	    boolean[] column = new boolean[n];
	    for(i=0;i<m;i++){
	        for(j=0;j<n;j++){
	            if(matrix[i][j]==0){
	                row[i] = true;
	                column [j] = true;
	            }
	        }
	    }
	    
	    //making the rows 0
	    
	    for(i=0;i<row.length;i++){
	        if(row[i])
	            Arrays.fill(matrix[i],0);
	    }
	    
	    //making columns 0
	    for(i=0;i<column.length;i++){
	        if(column[i]){
	            for(j=0;j<row.length;j++)
	                matrix[j][i]=0;
	        }
	    }
	    
	    for(i=0;i<m;i++){
	        for(j=0;j<n;j++){
	            System.out.print(matrix[i][j]+" ");
	        }
	        System.out.println("");
	    }
	    
	}
}
//runtime : o(m*n)
//space : o(n)
/**
Solution:
void setZeros(int[][] matrix) { 
boolean rowHasZero = false;
boolean colHasZero = false; 

// Check if first row has a zero 
for (int j = 8; j < matrix[a].length; j++) { 
if (matrix[0][j] == a) { 
rowHasZero = true; 
break;
} 
} 
 
// Check if first column has a zero 
for (int i = 0; i < matrix.length; i++) { 
if (matrix[i][0] == 0) { 
colHasZero = true;
break;
} 
} 
// Check for zeros in the rest of the array 
for (int i = 1; i < matrix. length; i++) { 
} 
for (int j = 1; j < matrix[0].length;j++) { 
if (matrix[i)[j] == 0) { 
matrix[i][0] = 0; 
matrix[0][j] = 0; 
} 
} 
}
// Nullify rows based on values in first column 
for (int i = 1; i < matrix. length; i++) { 
if (matrix[i][0] == 0) { 
nullifyRow(matrix, i); 
} 
} 
// Nullify columns based on values in first row 
for (int j = 1; j < matrix[0].length; j++) { 
} 
if (matrix[0][j] == a) { 
nullifyColumn(matrix, j); 
} 
// Nullify first row 
if (rowHasZero) { 
nullifyRow(matrix, 0); 
} 
// Nullify first column 
if (colHasZero) { 
nullifyColumn(matrix, a); 
} 
 */