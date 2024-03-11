import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. Дан массив целых чисел. Обнулить каждый 3й элемент в исходном массиве;
 * 2. Дан массив целых чисел. Создать два дополнительных массива из элементов
 * исходного массива:с четными и нечетными числами.
 * Т.е. в итоге получится три массива: исходный, массив четных чисел, массив нечетных чисел;
 * 4. Дан массив слов. Создать одну строку из всех элементов массива (т.е. предложение);
 * 5. Дан массив целых чисел. Вывести все элементы массива пока не встретится элемент -1;
 * 6. Дан массив целых чисел. Посчитать кол-во положительных элементов.
 * 7. Дан массив целых чисел. Заменить элементы массива на противоположные.
 * Пример: [1, -5, 0, 3, -4]; решение: [-1, 5, 0, -3, 4].
 */
public class Dz5 {
    public static void main(String[] args) {
        //                           0   1   2   3  4     5   6     7   8    9    10
        //  int[] array = new int[]{-167, -2, 16, 99, 26, -1, -92, 43, -234, 35, -80};
        task1();
        task2();
        task4();
        task5();
        task6();
        task7();
    }

    /**
     * 1. Дан массив целых чисел. Обнулить каждый 3й элемент в исходном массиве;
     */

    public static void task1() {
        int j = 1;
        int[] array = new int[]{-167, -2, 16, 99, 26, -1, -92, 43, -234, 35, -80};
        for (int i = 0; i < array.length; i++, j++) {
            if (j % 3 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.print("\n");
    }

    /**
     * 2. Дан массив целых чисел. Создать два дополнительных массива из элементов
     * исходного массива: с четными и нечетными числами. Т.е. в итоге получится три массива:
     * исходный, массив четных чисел, массив нечетных чисел;
     */

    public static void task2() {
        int[] array = new int[]{-167, -2, 16, 99, 26, -1, -92, 43, -234, 35, -80};
        int countEven = 0, countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] newArrayEven = new int[countEven];
        int[] newArrayOdd = new int[countOdd];

        int j = 0, k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArrayEven[j++] = array[i];
            } else {
                newArrayOdd[k++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArrayEven));
        System.out.println(Arrays.toString(newArrayOdd));
        System.out.print("\n");
    }

    /**
     * 4. Дан массив слов. Создать одну строку из всех элементов массива (т.е. предложение);
     */

    public static void task4() {
        String[] array = new String[]{"Создать", "одну", "строку", "из", "всех", "элементов", "массива"};
        String str = "";
        for (String i : array) {
            str += i + " ";

        }
        System.out.println(str);
        System.out.print("\n");
    }

    /**
     * 5. Дан массив целых чисел. Вывести все элементы массива пока не встретится элемент -1;
     */

    public static void task5() {
        int[] array = new int[]{-167, -2, 16, 99, 26, -1, -92, 43, -234, 35, -80};
        for (int i : array) {
            if (i != -1) {
                System.out.println(i);
            } else {
                break;
            }
        }
        System.out.print("\n");
    }

    /**
     * 6. Дан массив целых чисел. Посчитать кол-во положительных элементов.
     */

    public static void task6() {
        int[] array = new int[]{-167, -2, 16, 99, 26, -1, -92, 43, -234, 35, -80};
        int j = 0;
        for (int i : array) {
            if (i > 0) {
                j++;
            }
        }
        System.out.println(j);
        System.out.print("\n");
    }

    /**
     * 7. Дан массив целых чисел. Заменить элементы массива на противоположные.
     * Пример: [1, -5, 0, 3, -4]; решение: [-1, 5, 0, -3, 4].
     */

    public static void task7() {
        int[] array = new int[]{-167, -2, 16, 99, 26, -1, -92, 43, -234, 35, -80};
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        System.out.println(Arrays.toString(array));
    }
}
