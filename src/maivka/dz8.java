package org.example;

import java.util.Arrays;

public class dz8 {

    public static void main(String[] args) {
//        method1();
//        method2();
        method3();
    }

    public static void method1() {

        int[] array = {22, 44, 61, 412, 61, 31, 44, 512, 1254, 512};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("true " + array[i] + " " + array[j]);
                }
            }
        }
    }

    public static void method2() {

        int[] array = {432, 0, 5, 22, 52, 0, 72, 6, 41, 0, 72, 7, 0};

        int sum = 0;
        boolean zeroYes = false;
        int zeroCount = 0;

        for (int i = 0; i < array.length; i++) {
            int j = array[i];

            if (j == 0) {
                zeroCount++;

                if (zeroCount == 2) { // Найдены два нуля, завершаем цикл

                    break;
                }
            } else if (zeroYes) {  // Если мы нашли первый ноль, добавляем элемент к сумме

                sum += j;
            } else { // Найден первый ноль

                zeroYes = true;
            }
        }
        System.out.println(sum);

    }

    public static void method3() {

        int[] array = {432, 0, 5, 22, 52, 0, 72, 6, 0, 0, 72, 7, 0};

        int fisrtNonZero = 0;

        // Перемещаем нули в начало массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                // Если текущий элемент - ноль, меняем его местами с первым ненулевым элементом
                int tmp = array[i];
                array[i] = array[fisrtNonZero];
                array[fisrtNonZero] = tmp;

                // Увеличиваем индекс первого ненулевого элемента
                fisrtNonZero++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


