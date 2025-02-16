package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bd = new BigData();
        bd.data = new Data();
        System.out.println("bd.count=" + bd.count);
        System.out.println("bd.data=" + bd.data);

        System.out.println("bd.data.value=" + bd.data.value);
    }
}
