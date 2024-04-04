package maivka.dz12;

public class Main {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Количество созданных объектов: " + Counter.getCount());
    }
}
