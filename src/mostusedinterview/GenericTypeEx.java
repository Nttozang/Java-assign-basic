package mostusedinterview;

public class GenericTypeEx {
    public static void main(String[] args) {

        Box<Integer> box = new Box<Integer>();
        box.setT(new Integer(10));

        System.out.println(box.getT());
    }
    static class Box<T>{
        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }
}
