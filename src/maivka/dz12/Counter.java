package maivka.dz12;

public class Counter {
    private static int count = 0; // статическая переменная для подсчета количества объектов

    public Counter() {
        count++; // увеличиваем счетчик при создании нового объекта
    }

    public static int getCount() {
        return count; // возвращаем текущее количество объектов
    }
}

