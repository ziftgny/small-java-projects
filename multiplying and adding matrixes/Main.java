package ilkproje;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
    
	public static void main(String[] args) {
		  Matrix matrix1 = new Matrix(3,3);
		  Matrix matrix2 = new Matrix(3,3);
		  matrix1.InsertValue(1, 2);
		  matrix2.InsertValue(1, 2);
		  matrix1.MultiplyMatrixes(matrix1,matrix2);
		
		}
	}


