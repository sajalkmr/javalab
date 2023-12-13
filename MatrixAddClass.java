package sajal;
import java.util.*;

public class MatrixAddClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter order of matrix ");
		int n = sc.nextInt();
		
		int mat1[][] = new int[n][n];
		int mat2[][] = new int[n][n];
		
		
		System.out.println(" matrix 1: ");
		enterElement(mat1,sc);
		System.out.println(" matrix 2: ");
		enterElement(mat2,sc);
		System.out.println(" matrix 1: ");
		printMat(mat1);
		System.out.println(" matrix 2: ");
		printMat(mat2);
		
		System.out.println(" resultant matrix : ");
		printMat(addMatrix(mat1,mat2));
		
	}
		public static void enterElement(int[][]mat, Scanner sc) {
		
		System.out.println(" enter elements: ");
		
		int n= mat.length;
		for(int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				
				mat[i][j] = sc.nextInt();
					
			}
		}
		}
		public static int[][] printMat(int[][]mat1) {
			int n=mat1.length;
			
			for(int i = 0; i<n; i++) {
				for (int j = 0; j<n; j++) {
					
					System.out.print(mat1[i][j]+" ");
						
				}
				System.out.println(" ");
			}
			return mat1;
		}
		
      
		public static int[][] addMatrix(int[][] mat1, int [][] mat2) {
			int n=mat1.length;
			int res[][] = new int[n][n];
			for(int i = 0; i<n; i++) {
				for (int j = 0; j<n; j++) {
					
					res[i][j]= mat1[i][j]+mat2[i][j];
						
				}
				
			}
			return res;
		}
		
	

}
