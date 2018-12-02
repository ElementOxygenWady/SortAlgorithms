/**
 * @author Wady
 * @description
 *
 */
package pers.wady.sort;

public class Context {
	Context(Sort sort) {
		this.sort = sort;
	}

	private Sort sort;

	public int[] run(int[] arr) throws Exception {
		return sort.run(arr);
	}
}
