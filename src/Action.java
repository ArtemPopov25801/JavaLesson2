
public class Action {


    public static double[][] parse(String[][] array) {
        double[][] result = new double[array.length][];
        for (int d = 0; d < result.length; d++) {
            for (int e = 0; e < result.length; e++)
                result[d][e] = Double.parseDouble(array[d][e]);
        }
        return result;
    }

    public static double[][] sortSelect(double[][] array2) {
        double[][] result = array2.clone();
        for (int d = 0; d < result.length; d++) {
            for (int i = 0; i < result.length; i++) {
                int j = minIndex(result, i);
                swap(result, i, j);
            }

        }
        return result;
    }

    private static void swap(double[][] array2, int i, int j) {
        for (int x = 0; x < array2.length; x++) {
            double z = array2[x][i];
            array2[x][i] = array2[x][j];
            array2[x][j] = z;
        }
    }

    private static int minIndex(double[][] array2, int startIdx) {
        int minIdx = startIdx;
        for (int d = startIdx; d < array2.length; d++) {
            for (int e = 0; e < array2.length; e++) {
                if (array2[d][e] < array2[minIdx][e]) {
                    minIdx = d;
                }
            }

        }return minIdx;
    }
}
