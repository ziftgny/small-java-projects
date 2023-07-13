package ilkproje;
import java.util.Scanner;
public class Matrix {
	int rows,columns;
	int[][] matrix;
	Matrix(int rows,int columns){
		this.rows=rows;
		this.columns=columns;
		matrix = new int[rows][columns];
	}
	int GetColumns() {
		return this.columns;
	}
	int GetRows() {
		return this.rows;
	}
	void InsertValue(int row,int column) {
		System.out.println("Text the value you want to put in the element");
		Scanner scanner = new Scanner(System.in);
		this.matrix[row][column]=scanner.nextInt();
	}
	void ShowMatrix() {
		int count = 0;
		for(int[] i : matrix) {
			for (int j :i) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
			count++;
		}
	}
	void AddMatrixes(Matrix m1,Matrix m2) {
		if(m1.columns!=m2.columns || m1.rows!=m2.rows ) {
			System.out.println("cannot be added together");
			
		}
		else {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(m1.matrix[i][j]+m2.matrix[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}
	void MultiplyMatrixes(Matrix m1,Matrix m2) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(m1.matrix[i][j]*m2.matrix[i][j]+" ");
			}
			System.out.print("\n");
	}
	}

}
