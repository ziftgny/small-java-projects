package ilkproje;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
public class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array = {{1,2,3},{4,5,677},{-87},{66,54,32,2,1}};
		System.out.println(Arrays.toString(highestAndLowest(array)));

	}
	static int[] highestAndLowest(int[][] array) {
		int[] container= new int[2];
		int lowest=array[0][0];
		int highest=array[0][0];

		for(int[] i : array) {

			for(int j : i) {
				if (lowest>j)
					lowest=j;
			}

		}
		container[0]=lowest;
		for(int[] i : array) {

			for(int j : i) {
				if (highest<j)
					highest=j;
			}

		}

		container[1]=highest;
		return container;
	}
}