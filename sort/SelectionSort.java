/**
 * @author Wady
 * @description —°‘Ò≈≈–Ú
 *
 */
package pers.wady.sort;

public class SelectionSort extends Sort {
	SelectionSort() {
		super("Selection sort");
	}

	@Override
	int[] algorithm(int[] arr) throws Exception {
		int min;
		for (int i = 0; i < (arr.length - 1); i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			arr[min] ^= arr[i];
			arr[i] ^= arr[min];
			arr[min] ^= arr[i];
		}
		return arr;
	}
}
