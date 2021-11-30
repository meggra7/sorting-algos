public class InsertionSort implements SortingAlgo {
    
    public void sort(int[] sortMe) {
        for (int i = 1; i < sortMe.length; i++) {
            int j = i;
            while (j > 0 && sortMe[j] < sortMe[j-1]) {
                swap(sortMe, j);
                j--;
            }
        }
    }
    
    private void swap(int[] list, int i) {
        int tmp = list[i];
        list[i] = list[i - 1];
        list[i - 1] = tmp;
    }        
}
