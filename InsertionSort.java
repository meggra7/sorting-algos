public class InsertionSort implements SortingAlgo {
    public void sort(int[] sortMe) {
        for (int i = 1; i < sortMe.length; i++) {
            int j = i;
            while (j > 0 && sortMe[j] < sortMe[j-1]) {
                int tmp = sortMe[j];
                sortMe[j] = sortMe[j-1];
                sortMe[--j] = tmp;
            }
        }
    }
}
