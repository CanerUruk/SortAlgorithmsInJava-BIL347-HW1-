public class HeapSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort (Array array) {
        for (int i = array.getSize() / 2 - 1; i > -1; i--) {
            this.heapify(array, array.getSize(), i);
        }

        for (int i = array.getSize() - 1; i > 0; i--) {
            array.swap(i, 0);
            this.heapify(array, i, 0);
        }
    }

    @Override
    public String toString() {
        return "heap sort algorithm";
    }

    private void heapify (Array array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array.get(i) < array.get(left)) {
            largest = left;
        }

        if (right < n && array.get(largest) < array.get(right)) {
            largest = right;
        }

        if (largest != i) {
            array.swap(i, largest);
            this.heapify(array, n, largest);
        }
    }
}
