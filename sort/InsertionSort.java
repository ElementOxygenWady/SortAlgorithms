/**
 * @author Wady
 * @description ≤Â»Î≈≈–Ú
 *
 */
package pers.wady.sort;

public class InsertionSort extends Sort {
	InsertionSort() {
		super("Insertion sort");
	}

	@Override
	int[] algorithm(int[] arr) throws Exception {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0) {
				if (arr[j - 1] > arr[j]) {
					arr[j - 1] ^= arr[j];
					arr[j] ^= arr[j - 1];
					arr[j - 1] ^= arr[j];
					j--;
				} else {
					break;
				}
			}
		}
		return arr;
	}
}
