public class RadixSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(Array array) {
        int exp = 1;
        while(array.getMax() / exp > 0) {
            this.countingSort(array, exp);
            exp *= 10;
        }
    }

    @Override
    public String toString() {
        return "radix sort algorithm";
    }

    private void countingSort(Array array, int exp) {
        Array outputArray = new Array(array.getSize());
        Array countArray = new Array(10);

        for (int i = 0; i < array.getSize(); i++) {
            int index = array.get(i) / exp;
            countArray.increment(index % 10);
        }

        for(int i = 1; i < 10; i++) {
            countArray.increment(i, countArray.get(i - 1));
        }

        int i = array.getSize() - 1;
        while(i >= 0) {
            int index = array.get(i) / exp;
            outputArray.set(countArray.get(index % 10) - 1, array.get(i));
            countArray.decrement(index % 10);
            i--;
        }

        for(i = 0; i < array.getSize(); i++) {
            array.set(i, outputArray.get(i));
        }
    }
}
