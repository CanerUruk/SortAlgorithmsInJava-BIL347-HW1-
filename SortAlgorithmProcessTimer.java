public class SortAlgorithmProcessTimer {
    public static long measureInNanoSeconds(SortAlgorithm sortAlgorithm, Array array) {
        long startTime = System.nanoTime();
        sortAlgorithm.sort(array);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long measureInMilliSeconds(SortAlgorithm sortAlgorithm, Array array) {
        long startTime = System.currentTimeMillis();
        sortAlgorithm.sort(array);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
