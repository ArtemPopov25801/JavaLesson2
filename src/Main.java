
public class Main {
    public static void main(String[] args) {

        double[][] array1 = new double[2][2];

        array1[0][0] = -1;
        array1[0][1] = 1;
        array1[1][0] = 2;
        array1[1][1] = 3;

        for (int a = 0; a < array1.length; a++) {
            for (int b = 0; b < array1[a].length; b++) {
                System.out.print(array1[a][b] + "\t");
            }
            System.out.println();
        }

        double[][] array2 = new double[2][2];

        array2[0][0] = -2;
        array2[0][1] = -1;
        array2[1][0] = 5;
        array2[1][1] = 2;


        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}





