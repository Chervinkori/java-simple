import java.util.Arrays;

/**
 * 1. Дан массив целых числе с элементами от 0 до 5.  Необходимо создать новый массив, где вместо числа будет слово.
 * Пример: [0, 3, 5]
 * Результат: ["ноль", "три", "пять"]
 * 2.  Дан массив челых чисел (положительных и отрицательных). Необходимо найти максимальный по модулю элемент;
 * 3. Дан массив целых чисел. Необходимо вывести элементы массива, которые больше среднего арифметического;
 * 4. Дан массив целых чисел. Необходимо найти самую длинную последовательность, состоящую из одинаковых элементов.
 * Пример: [0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0]
 * Результат: 5 (с 9го индекса)
 * 5. Дана строка, состоящая из нескольких слов (предложение).
 * Необходимо найти самое длинное слово и вывести кол-во символов.
 */

public class Dz6 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    /**
     * 1. Дан массив целых числе с элементами от 0 до 5.  Необходимо создать новый массив, где вместо числа будет слово.
     * * Пример: [0, 3, 5]
     * * Результат: ["ноль", "три", "пять"]
     */
    public static void task1() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        String zero = null;
        String three = null;
        String five = null;
        for (int i : array) {
            if (i == 0) {
                zero = "ноль";
            }
            if (i == 3) {
                three = "три";
            }
            if (i == 5) {
                five = "пять";
            }
        }
        String[] arra = new String[]{zero, three, five};
        System.out.println(Arrays.toString(arra));
    }

    /**
     * 2.  Дан массив челых чисел (положительных и отрицательных). Необходимо найти максимальный по модулю элемент;
     */
    public static void task2() {
        int j = 0, k = 0;
        int[] array = new int[]{5, -10, 7, -3, -5, 2, -1, 2, -10, -2, 1, -6, -7, -8, 6, -6, -7, 2, -4, 9};
        for (int i : array) {
            int abs = Math.abs(i);
            if (abs > j) {
                j = abs;
            }
        }
        System.out.println(j);
    }

    /**
     * 3. Дан массив целых чисел. Необходимо вывести элементы массива, которые больше среднего арифметического;
     */

    public static void task3() {
        int[] array = new int[]{13, 10, 7, 9, 4, 9, 3, 13, 8, 7, 5, 15, 18, 20, 19, 13, 17, 8, 1, 0, 6, 20};
        int j = 0, k = 0;
        for (int i = 0; i < array.length; i++, k++) {
            j = j + array[i];
        }
        int sred = j / k;
        for (int i : array) {
            if (i > sred) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
//        System.out.println(j);
//        System.out.println(k);
//        System.out.println(sred);
    }

    /**
     * 4. Дан массив целых чисел. Необходимо найти самую длинную последовательность, состоящую из одинаковых элементов.
     */
    public static void task4() {
        int[] array = new int[]{0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        int count = 0, max = 0;//, index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
                //index = i;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
        //System.out.println(index);
    }

    /**
     * 5. Дана строка, состоящая из нескольких слов (предложение).
     * Необходимо найти самое длинное слово и вывести кол-во символов.
     */
    public static void task5() {
        String str = "Дана строка состоящая из нескольких слов";
        String[] array = str.split(" ");
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > j) {
                j = array[i].length();
            }
        }
        System.out.println(j);
    }
}
