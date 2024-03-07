/**
 * 1. Дан массив целых числе длинной n. Необходимо вывести в консоль "true", если массив является
 * возрастающей последовательностью. Т.е. необходимо проверить, что все элементы в массиве идут строго по возрастанию.
 * 2. Дан массив целых чисел длинной n. Необходимо вычислить сумму элементов массива,
 * расположенных между первым и последним элементами.
 * 3. Дан массив целых чисел длинной n. Необходимо вычислить сумму элементов массива,
 * расположенных до последнего положительного элемента.
 * 4. Дан массив целых чисел длинной n. Необходимо создать новый массив, той же длинны
 * что и исходный, в котором все элементы исходного массива будут сдвинуты на k элементов вправо.
 * Пустые элементы заполнить "0" (поведение по умолчанию).
 * 5. Дан массив целых чисел длинной n. Необходимо добавить в массив элемент k с индексом i.
 */


public class Dz7 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
//        task4();
//        task5();
    }

    /**
     * 1. Дан массив целых числе длинной n. Необходимо вывести в консоль "true", если массив является
     * возрастающей последовательностью. Т.е. необходимо проверить, что все элементы в массиве идут строго по возрастанию.
     */
    public static void task1() {
        int[] array = new int[]{9, 5, 7, 8, 4, 6, 2, 1, 3, 10};
        boolean ok = true;
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i - 1] < array[i]) {
                ok = false;
                break;
            }
        }
        System.out.println(ok);
    }

    /**
     * 2. Дан массив целых чисел длинной n. Необходимо вычислить сумму элементов массива,
     * расположенных между первым и последним элементами.
     */

    public static void task2() {
        int j = 0;
        int[] array = new int[]{9, 5, 7, 8, 4, 6, 2, 1, 3, 10};
        for (int i = 1; i < array.length - 1; i++) {
            j = j + array[i];
        }
        System.out.println(j);
    }

    /**
     * 3. Дан массив целых чисел длинной n. Необходимо вычислить сумму элементов массива,
     * расположенных до последнего положительного элемента.
     */

    public static void task3() {
        int j = 0;
        int[] array = new int[]{9, 5, 7, 8, -4, 6, 2, 1, 3, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                j = j + array[i];
            } else {
                break;
            }
        }
        System.out.println(j);
    }

    /**
     * 4. Дан массив целых чисел длинной n. Необходимо создать новый массив, той же длинны
     * что и исходный, в котором все элементы исходного массива будут сдвинуты на k элементов вправо.
     * Пустые элементы заполнить "0" (поведение по умолчанию).
     */

//    public static void task4() {
//        int[] array = new int[]{9, 5, 7, 8, -4, 6, 2, 1, 3, 10};
//        for (){
//
//        }
//    }
}

