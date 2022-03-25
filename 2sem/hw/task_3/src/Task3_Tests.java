import org.junit.*;
public class Task3_Tests extends Assert{

    @Test
    public void heapSort_CreateNewHeapSort_TryToCompareArrays(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    public void quickSort_CreateNewQuickSort_TryToCompareArrays(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    public void quickSort_CreateNewQuickSort_TryToCompareArraysTwoItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    @Test
    public void quickSort_CreateNewQuickSort_TryToCompareArraysThreeItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1, 2, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }

    @Test
    public void quickSort_CreateNewQuickSort_TryToSortTwoItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    @Test
    public void quickSort_CreateNewQuickSort_TryToSortThreeItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }

    @Test
    public void quickSort_CreateNewQuickSort_TryToSortFourReversedItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {4, 3, 2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, array);
    }

    @Test
    public void quickSort_CreateNewQuickSort_TryToSortWithSimilarItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {4, 3, 2, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{2, 2, 3, 4}, array);
    }

    @Test
    public void mergeSort_CreateNewMergeSort_TryToCompareArrays(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }
}
