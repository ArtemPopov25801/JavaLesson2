
public class Actions {

    public class SecondClass {

        private int i;
        private int j;

        public SecondClass(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }

        public int plus() {
            return i + j;
        }

        public int mult() {
            return i * j;
        }
    }
}
