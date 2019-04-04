
public class Main {

    public static void main(String args[]) {

        double[] array1 = {6, 4, 5, 3, 1, 2};

        double[] array2 = {15, 9, 7, 11, 13, 5};

        System.out.print("Значения вектора 1 : ");

        for (double element : array1) {
            System.out.print(element + "\t");
        }
        System.out.println();

        System.out.print("Значения вектора 2 : ");

        for (double element : array2) {
            System.out.print(element + "\t");
        }

        System.out.println();

        Vector vector1 = new Vector(array1.length);

        vector1.setArray(array1);

        Vector vector2 = new Vector(array2.length);

        vector2.setArray(array2);

        System.out.println("Длина вектора 1 : " + vector1.getLength());
        System.out.println("Последний элемент 2 вектора : " + vector2.getValueByIndex(vector2.getLength() - 1));
        System.out.println("Минимальное значение 1 вектора : " + vector1.getMinimum());
        System.out.println("Максимальное значение 2 вектора : " + vector2.getMaximum());
        System.out.println("Отсортированный первый вектор : ");
        vector1.sortSelect();
        for (int i = 0; i < vector1.getLength(); i++) {
            System.out.print(vector1.getValueByIndex(i) + "\t");
        }
        System.out.println();
        System.out.println("Евклидова норма 2 вектора : " + vector2.evklNorm());
        System.out.println("Умножение вектора 1 на число 7 : ");
        vector1.multArray(7);
        vector1.output();
        System.out.println("Сложение двух векторов : ");
        Vector vector = Action.sumVectors(vector1, vector2);
        if (vector != null) {
            vector.output();
        }
        //   Action.sumVectors(vector1,vector2).output();
        System.out.println("Скалярное произведение 2-х векторов : " + Action.scalMult(vector1, vector2));


    }

}
















