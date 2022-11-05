public class QuickSortAlgorithm implements BoundedSortAlgorithm {
    @Override
    public void sort(Array array) {
        int low = 0;
        int high = array.getSize() - 1;

        if(low < high) {
            int pi = this.partition(array, low, high);
            this.sort(array, low, pi - 1);
            this.sort(array, pi + 1, high);
        }
    }

    @Override
    public void sort(Array array, int low, int high) {
        if(low < high) {
            int pi = this.partition(array, low, high);
            this.sort(array, low, pi - 1);
            this.sort(array, pi + 1, high);
        }
    }

    @Override
    public String toString() {
        return "quick sort algorithm";
    }

    private int partition(Array array, int low, int high) {
        int pivot = array.get(high);
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(array.get(j) <= pivot) {
                i++;
                array.swap(i, j);
            }
        }

        array.swap(i + 1, high);

        return i + 1;
    }
}
