
public class Main {

    public static void main(String args[]) {


        double[] array1 = {6, 4, 5, 3, 1, 2};

        double[] array2 = {15, 9, 7, 11, 13, 5};

        System.out.print("Значения вектора 1 : ");

        for (int a = 0; a < array1.length; a++) {
            System.out.print(array1[a] + "\t");
        }
        System.out.println();

        System.out.print("Значения вектора 2 : ");

        for (int b = 0; b < array2.length; b++) {
            System.out.print(array2[b] + "\t");
        }

        System.out.println();

        System.out.println("Длина вектора 1 : " + array1.length);

        System.out.println("Длина вектора 2 : " + array2.length);

        System.out.print("Сортировка вектора 1 по возрастанию : ");

        double[] arr1 = Vector.sortSelect(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.print("Сортировка вектора 2 по возрастанию : ");

        double[] arr2 = Vector.sortSelect(array2);

        for (int i = 0; i < array2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        double arrayX[] = {9, 8, 2, 4, 6, 5};

        Vector vector = new Vector();
        vector.setArray(arrayX);

        double[] vectorArray = vector.getArray();

        for (double element : vectorArray) {
            System.out.print(element + " ");
        }

        System.out.println();



        System.out.println("Вывод начения i-того элемента : " + vector.getValueByIndex(8));


        System.out.println("Длина вектора : " + vector.getLenght());



    }

}
















