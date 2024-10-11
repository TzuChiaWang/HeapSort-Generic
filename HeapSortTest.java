import java.util.Arrays;

public class HeapSortTest {
    public static void main(String[] args) {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] array = { 8, 2, 15, 20, 42, 3, 7, 26, 12, 9 };

        System.out.println("原始陣列: " + Arrays.toString(array));

        heapSort.heapSort(array);
        System.out.println("排序後陣列: " + Arrays.toString(array));

        int index = heapSort.binarySearch(array, 3);
        System.out.println("元素 3 的索引: " + index);

        index = heapSort.binarySearch(array, 4);
        System.out.println("元素 4 的索引: " + index);

        index = heapSort.binarySearch(array, 42);
        System.out.println("元素 42 的索引: " + index);

        index = heapSort.binarySearch(array, 12);
        System.out.println("元素 1 的索引: " + index);
    }
}