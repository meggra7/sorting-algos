public class ShellSort implements SortingAlgo {
    public void sort(int[] sortMe) {
        for (int gap = (sortMe.length / 2) + 1; gap > 0; gap = gap / 2) {
            for (int start = 0; start < gap; start++) {
                for (int i = start + gap; i < sortMe.length; i += gap) {
                    for (int j = i; j > start && sortMe[j] < sortMe[j - gap]; j -= gap) {
                        int tmp = sortMe[j];
                        sortMe[j] = sortMe[j - gap];
                        sortMe[j - gap] = tmp;
                    }
                }
            }
        }
    }
}

