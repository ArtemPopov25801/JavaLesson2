
public class Main {
    public static void main(String[][] args) {

        double[][] array = Action.parse(args);

        for (double[][] element : array) {
            System.out.print(element + " ");
        }

        System.out.println();

        double[][] arr = Action.sortSelect(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(arr[i] + " ");
            }
        }




        double[][] array1 = new double[2][2];

        array1[0][0] = 1;
        array1[0][1] = -1;
        array1[1][0] = 2;
        array1[1][1] = 3;


        for (int a = 0; a < array1.length; a++) {
            for (int b = 0; b < array1[a].length; b++) {
                System.out.println(array1[a][b] + "\t");
            }
            System.out.println();
        }

        double[][] array2 = new double[2][2];

        array2[0][0] = -1;
        array2[0][1] = -2;
        array2[1][0] = 5;
        array2[1][1] = 2;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j] + "\t");
            }
            System.out.println();


        }


        System.out.println(array1.length + " " + "- Длина массива 1 ");

        System.out.println(array2.length + " " + "- Длина массива 2 ");


    }


}











