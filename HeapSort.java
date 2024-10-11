import java.util.Arrays;

public class HeapSort<T extends Comparable<T>> {

	void swap(T[] x, int first, int second) {
		T temp = x[first];
		x[first] = x[second];
		x[second] = temp;
	}

	void insertHeap(T[] x, int low, int high) {
		int k = low;
		while (true) {
			int argmax = k;
			int left = 2 * k + 1, right = left + 1;
			if (left <= high && x[argmax].compareTo(x[left]) < 0) {
				argmax = left;
			}
			if (right <= high && x[argmax].compareTo(x[right]) < 0) {
				argmax = right;
			}
			if (argmax == k) {
				return;
			}
			swap(x, k, argmax);
			k = argmax;
		}
	}

	void restoreHeapAtTail(T[] x, int low, int high) {
		int k = high;
		while (k > 0) {
			int parent = (k - 1) / 2;
			if (x[parent].compareTo(x[k]) >= 0) {
				return;
			}
			swap(x, parent, k);
			k = parent;
		}
	}

	public void heapSort(T[] x) {
		int n = x.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			insertHeap(x, i, n - 1);
		}
		for (int i = n - 1; i > 0; i--) {
			swap(x, 0, i);
			insertHeap(x, 0, i - 1);
		}
	}

	public int binarySearch(T[] x, T key) {
		int low = 0;
		int high = x.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int cmp = x[mid].compareTo(key);
			if (cmp < 0) {
				low = mid + 1;
			} else if (cmp > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
