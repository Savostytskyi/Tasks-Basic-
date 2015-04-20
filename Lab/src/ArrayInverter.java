public class ArrayInverter {
	public int[] invert(int[] arr) {
		for (int k = arr.length / 2; k >= 0; k--) {
		int tmp = arr[k];
		arr[k] = arr[arr.length - k - 1];
		arr[arr.length - k - 1] = tmp;
		}
		return arr;
	}
}