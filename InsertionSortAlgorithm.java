public class InsertionSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(Array array) {
        for(int i = 1; i < array.getSize(); i++) {
            int key = array.get(i);
            int j = i - 1;

            while (j >= 0 && key < array.get(j)) {
                array.set(j + 1, array.get(j));
                j--;
            }

            array.set(j + 1, key);
        }
    }

    @Override
    public String toString() {
        return "insertion sort algorithm";
    }
}
