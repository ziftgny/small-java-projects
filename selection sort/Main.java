package ilkproje;
import java.util.Arrays;
public class Main{


	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,677,-87,66,54,32,2,1,2,3,54,54,22,22};
		
		System.out.println(Arrays.toString(selectionSort(array)));

	}
	static int[] selectionSort(int[] array) {
		int valueContainer=0;
		int index=0;
		int lowest = 0;
		for (int i = 0; i < array.length-1; i++) {
			lowest=array[i];
			for (int j = i+1; j < array.length; j++) {
				
				if(array[j]<lowest)
				{
					lowest=array[j];
					index = j;
				}
				
			}
			if(lowest!=array[i]) {
			valueContainer=array[i];
			array[i]=lowest;
			array[index]=valueContainer;
			}
		}
		return array;
	}
}