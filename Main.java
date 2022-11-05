public class Main {
    public static void main(String[] args) {
        SortAlgorithm[] sortAlgorithms = {new HeapSortAlgorithm(),
                                          new MergeSortAlgorithm(),
                                          new QuickSortAlgorithm(),
                                          new RadixSortAlgorithm(),
                                          new InsertionSortAlgorithm(),
                                          new SelectionSortAlgorithm()};

        for(SortAlgorithm sortAlgorithm: sortAlgorithms) {
            for (int size = 1000; size <= 1000000; size *= 10) {
                Array array = new Array(size);
                array.randomize();
                long duration = SortAlgorithmProcessTimer.measureInNanoSeconds(sortAlgorithm, array);
                System.out.println(sortAlgorithm + " for N = " + size + " took " + duration + " nanoseconds.");
            }
            System.out.println();
        }
    }
}