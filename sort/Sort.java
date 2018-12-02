/**
 * @author Wady
 * @description ≥ÈœÛ≈≈–ÚÀ„∑®
 *
 */
package pers.wady.sort;

abstract class Sort {
	Sort(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	abstract int[] algorithm(int[] arr) throws Exception;

	public final int[] run(int[] arr) throws Exception {
		System.out.println("Using '" + name + "°Ø");
		return algorithm(arr);
	}
}
