/**
 * @author Wady
 * @description
 *
 */
package pers.wady.sort;

public class Main {
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "] = " + arr[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sortNames[] = {
			"BubbleSort",
			"InsertionSort",
			"SelectionSort",
		};

		for (int i = 0; i < sortNames.length; i++) {
			try {
				Context ctx = new Context(SortFactory.create(sortNames[i]));
				int[] arr = {6, 1, 5, 2, 4, 3};
				ctx.run(arr);
				print(arr);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

class SortFactory {
	public static Sort create(String name) throws Exception {
		Sort sort;
		switch (name) {
			case "BeadSort":
				sort = new BeadSort();
			break;
			case "BogoSort":
				sort = new BogoSort();
			break;
			case "BubbleSort":
				sort = new BubbleSort();
			break;
			case "BucketSort":
				sort = new BucketSort();
			break;
			case "CocktailShakerSort":
				sort = new CocktailShakerSort();
			break;
			case "CombSort":
				sort = new CombSort();
			break;
			case "CountingSort":
				sort = new CountingSort();
			break;
			case "GnomeSort":
				sort = new GnomeSort();
			break;
			case "HeapSort":
				sort = new HeapSort();
			break;
			case "InsertionSort":
				sort = new InsertionSort();
			break;
			case "IntroSort":
				sort = new IntroSort();
			break;
			case "MergeSortIterative":
				sort = new MergeSortIterative();
			break;
			case "MergeSortRecursive":
				sort = new MergeSortRecursive();
			break;
			case "QuickSortIterative":
				sort = new QuickSortIterative();
			break;
			case "QuickSortRecursive":
				sort = new QuickSortRecursive();
			break;
			case "RadixSort":
				sort = new RadixSort();
			break;
			case "SelectionSort":
				sort = new SelectionSort();
			break;
			case "ShellSort":
				sort = new ShellSort();
			break;
			case "SmoothSort":
				sort = new SmoothSort();
			break;
			default:
				throw new Exception("Unknown sort '" + name + "'");
		}
		return sort;
	}
}
