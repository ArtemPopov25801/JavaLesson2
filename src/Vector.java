
public class Vector {

    private double array[];

    public Vector(int length) { /// constructor
        this.array = new double[length];
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double array[]) {
        this.array = array;
    }

    public Double getValueByIndex(int index) {
        if (index >= array.length) {
            return null;
        }
        return this.array[index];
    }

    public void setValueByIndex(double value, int index) {
        if (index >= array.length) {
            return;
        }
        this.array[index] = value;
    }

    public int getLength() {
        return this.array.length;
    }

    public double getMinimum() {
        double min = array[0];
        for (double element : array) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    public double getMaximum() {
        double max = array[0];
        for (double element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public double evklNorm() {
        double eNorm = 0;
        for (double element : array) {
            eNorm += element * element;
        }
        return Math.sqrt(eNorm);
    }

    public void multArray(double a) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= a; // array[i] = a*array[i]
        }
    }

    // начало сортировки
    public void sortSelect() {
        for (int i = 0; i < array.length; i++) {
            int j = minIndex(array, i);
            swap(array, i, j);
        }
    }

    private void swap(double[] array, int i, int j) {
        double x = array[i];
        array[i] = array[j];
        array[j] = x;

    }

    private int minIndex(double[] array, int startIdx) {
        int minIdx = startIdx;
        for (int a = startIdx; a < array.length; a++) {
            if (array[a] < array[minIdx]) {
                minIdx = a;
            }
        }
        return minIdx;
    }

    // конец соритровки

    public void output() {
        for (double element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }
}

