
public class Action   {


    public static Vector sumVectors(Vector vector1, Vector vector2) {
        if (vector1.getLength() != vector2.getLength()) {
            System.out.println("Складывать нельзя вектора разной длины");
            return null;
        }
        Vector sumVector = new Vector(vector1.getLength());
        for (int i = 0; i < sumVector.getLength(); i++) {
            sumVector.setValueByIndex(vector1.getValueByIndex(i) + vector2.getValueByIndex(i), i);
        }
        return sumVector;
    }

    public static Double scalMult(Vector vector1, Vector vector2) {
        if (vector1.getLength() != vector2.getLength()) {
            System.out.println("Умножать вектора разной длинны нельзя");
            return null;
        }
        double scal = 0;
        for (int i = 0; i < vector1.getLength(); i++) {
            scal += vector1.getValueByIndex(i) * vector2.getValueByIndex(i);
        }
        return scal;
    }



}
