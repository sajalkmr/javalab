package sajal;
import java.util.*;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enters number of rows: ");
		int row = sc.nextInt();
		
		System.out.println("Enters number of columns: ");
		int col = sc.nextInt();
		
		
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];
		
		
		
		System.out.println("Enters numbers in matrix 1: ");
		
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				
				mat1[i][j] = sc.nextInt();
					
			}
		}
		
		System.out.println("You entered: ");
		
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				
				System.out.print(mat1[i][j]+ "  ");
					
			}
			System.out.println("");
		}
		
		
        System.out.println("Enters numbers in matrix 2: ");
		
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				
				mat2[i][j] = sc.nextInt();
					
			}
		}
		
		System.out.println("You entered: ");
		
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				
				System.out.print(mat2[i][j]+ "  ");
					
			}
			System.out.println("");
		}
		
		
		
		
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				
				res[i][j] = mat1[i][j] + mat2[i][j];
					
			}
		}
		
		
		System.out.println("Matrix addition result: ");
		
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				
				System.out.print(res[i][j]+ "    ");
					
			}
			System.out.println("");
		}
		

		
		sc.close();

	}

}
