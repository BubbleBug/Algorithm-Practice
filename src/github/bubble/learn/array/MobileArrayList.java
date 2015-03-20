package github.bubble.learn.array;

public class MobileArrayList {

	public int[] MobileArrayList(int[] array, int index) {
		int k=index;
		if (index > array.length) {
			k = index % array.length;
		} else if (index < 0) {
			k = index + array.length;
		}

		int[] array_int = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			if (i < k)
				array_int[i] = array[array.length - k + i];
			else
				array_int[i] = array[i - k];
		}
		return array_int;
	}

	public int[] OptimizeMobileArray(int[] array, int n) {
		int k=n;
		if (n > array.length) {
			k = n % array.length;
		} else if (n < 0) {
			k = array.length+n;
		}
		
		if (array != null ) {
			ReverseArray(array, 0, array.length - k - 1);
			ReverseArray(array, array.length - k, array.length - 1);
			ReverseArray(array, 0, array.length - 1);
		}

		return array;
	}

	private static void ReverseArray(int[] array, int left, int right) {
		for (; left < right; ++left, --right) {
			int tmp = array[left];
			array[left] = array[right];
			array[right] = tmp;
		}
	}
}
