public class Array {
    public Array() {
        this.coreArray = new int[10];
    }

    public Array(int size) {
        this.coreArray = new int[size];
    }

    public void randomize() {
        int maximumNumber = 100;
        int minimumNumber = 0;

        for(int i = 0; i < this.coreArray.length; i++) {
            this.coreArray[i] = (int)(Math.random() * (maximumNumber - minimumNumber + 1) + minimumNumber);
        }
    }

    public void randomize(int maximumNumber, int minimumNumber) {
        for(int i = 0; i < this.coreArray.length; i++) {
            this.coreArray[i] = (int)(Math.random() * (maximumNumber - minimumNumber + 1) + minimumNumber);
        }
    }

    public int getSize() {
        return this.coreArray.length;
    }

    public void setSize(int size) {
        this.coreArray = new int[size];
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int element : this.coreArray) {
            result.append(element).append(" -> ");
        }
        result.append("NULL");

        return result.toString();
    }

    public int get(int index) {
        return this.coreArray[index];
    }

    public void set(int index, int value) {
        this.coreArray[index] = value;
    }

    public void swap(int firstIndex, int secondIndex) {
        int temp = this.coreArray[firstIndex];
        this.coreArray[firstIndex] = this.coreArray[secondIndex];
        this.coreArray[secondIndex] = temp;
    }

    public void decrement(int index) {
        this.coreArray[index]--;
    }

    public void decrement(int index, int value) {
        this.coreArray[index] -= value;
    }

    public void increment(int index) {
        this.coreArray[index]++;
    }

    public void increment(int index, int value) {
        this.coreArray[index] += value;
    }

    public int getMax() {
        int max = this.coreArray[0];

        for(int i = 1; i < this.coreArray.length; i++) {
            if(this.coreArray[i] > max) {
                max = this.coreArray[i];
            }
        }

        return max;
    }

    private int[] coreArray;
}
