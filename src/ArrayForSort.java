import java.util.Arrays;

// Concrete aggregate
public class ArrayForSort implements Aggregate{
    int [] array = {5,4,6,7,3,6,33,56,79,95,78,99};

    @Override
    public Sort getSort() {
        return new ArraySort();
    }
//    Concrete iterator
    private class ArraySort implements Sort{

    @Override
    public void sort() {
        System.out.println(Arrays.toString(array));
        for (int s = array.length - 1; s >= 0; s--) {
            for (int i = 0; i < s; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
}
