public class MergeSortAlgorithm implements BoundedSortAlgorithm {
    @Override
    public void sort(Array array) {
        int left = 0;
        int right = array.getSize() - 1;

        if(left < right) {
            int middle = left + (right - left) / 2;

            this.sort(array, left, middle);
            this.sort(array, middle + 1, right);
            this.merge(array, left, middle, right);
        }
    }

    @Override
    public void sort(Array array, int left, int right) {
        if(left < right) {
            int middle = left + (right - left) / 2;

            this.sort(array, left, middle);
            this.sort(array, middle + 1, right);
            this.merge(array, left, middle, right);
        }
    }

    @Override
    public String toString() {
        return "merge sort algorithm";
    }

    private void merge(Array array, int left, int middle, int right) {
        Array leftArray = new Array(middle - left + 1);
        Array rightArray = new Array(right - middle);

        for(int i = 0; i < leftArray.getSize(); i++) {
            leftArray.set(i, array.get(left + i));
        }

        for(int j = 0; j < rightArray.getSize(); j++) {
            rightArray.set(j, array.get(middle + j + 1));
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < leftArray.getSize() && j < rightArray.getSize()) {
            if(leftArray.get(i) <= rightArray.get(j)) {
                array.set(k++, leftArray.get(i++));
            }
            else {
                array.set(k++, rightArray.get(j++));
            }
        }

        while (i < leftArray.getSize()) {
            array.set(k++, leftArray.get(i++));
        }

        while (j < rightArray.getSize()) {
            array.set(k++, rightArray.get(j++));
        }
    }
}
