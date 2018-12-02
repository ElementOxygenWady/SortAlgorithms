/**
 * @author Wady
 * @description ц╟ещеепР
 *
 */
package pers.wady.sort;

public class BubbleSort extends Sort {
	BubbleSort() {
		super("Bubble sort");
	}

	@Override
	int[] algorithm(int[] arr) throws Exception {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < (arr.length - i); j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] ^= arr[j + 1];
					arr[j + 1] ^= arr[j];
					arr[j] ^= arr[j + 1];
				}
			}
		}
		return arr;
	}
}
