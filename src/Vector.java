
public class Vector {


    public static double[] sortSelect(double[] array) {
        double[] result = array.clone();          // начало сортировки
        for (int i = 0; i < result.length; i++) {
            int j = minIndex(result, i);
            swap(result, i, j);
        }
        return result;
    }

    private static void swap(double[] array, int i, int j) {
        double x = array[i];
        array[i] = array[j];
        array[j] = x;

    }

    private static int minIndex(double[] array, int startIdx) {
        int minIdx = startIdx;
        for (int a = startIdx; a < array.length; a++) {
            if (array[a] < array[minIdx]) {
                minIdx = a;
            }
        }
        return minIdx;
    }                                                     // конец соритровки

    public double array[];

    public double[] getArray() {
        return array;
    }

    public void setArray(double array[]) {
        this.array = array;
    }

    public double getValueByIndex(int index) {
        if (index <= array.length) {
            throw new RuntimeException("На ноль делить нельзя!"); // не работает при i > 6
        }
        return this.array[index];
    }

    public void setValueByIndex(double value, int index) {  // не работает
        this.array[index] = value;
    }

    public int getLenght() {
        return this.array.length;
    }

}

