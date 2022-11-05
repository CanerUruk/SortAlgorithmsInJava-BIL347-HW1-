public class SelectionSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(Array array) {
        for(int i = 0; i < array.getSize(); i++) {
            int minimumNumberIndex = i;

            for(int j = i + 1; j < array.getSize(); j++) {
                if(array.get(j) < array.get(minimumNumberIndex)) {
                    minimumNumberIndex = j;
                }
            }

            array.swap(i, minimumNumberIndex);
        }
    }

    @Override
    public String toString() {
        return "selection sort algorithm";
    }
}
