package ilkproje;
import java.util.Arrays;
public class Main{


	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,677,-87,66,54,32,2,1,2,3,54,54,22,22};
		System.out.println(Arrays.toString(repeatingNumbers(array)));

	}
	static int[] repeatingNumbers(int[] array) {
		int[] container = new int[array.length];
		int iterate=0;
		int control=0;
		for (int i = 0; i < array.length; i++) {

			for (int j = i; j < array.length; j++) {

				if(i!=j) {

					if(array[i]==array[j])

					{
						for (int a :container) {
							if (a==array[i]) {
								control = 1;
							}

						}
						if (control ==0) {
							container[iterate]=array[i];
							iterate++;
							
						}
						control=0;
					}
				}

			}
		}
		return container;
	}
}