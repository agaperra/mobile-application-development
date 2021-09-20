package com.mpei.vmss.mobile_application_development.check_work_1;

import java.util.*;

/**
 * Вариант №2
 * Задание №1
 * Напишите программу, которая находит
 * максимальную последовательность
 * последовательно расположенных
 * возрастающих целых чисел.
 * Например {3,2,3,4,2,2,4}->{2,3,4}
 * <p>
 * <p>
 * Вариант №2
 * Задание №2
 * Напишите программу
 * для поиска последовательности
 * соседних чисел в массиве, которая
 * имеет сумму определенного числа S.
 * Например {4,3,1,4,2,5,8},S=11->{4,2,5}
 **/

public class MainClass_variant_2 {

    public static void main(String[] args) {

        // Вариант 2 Задание 1
        int[] array = {4, 3, 1, 4, 2, 5, 8};
        System.out.println( "Исходный массив: " + Arrays.toString( array ) );
        int[] newArr = findUpSequence( array );
        System.out.println( "Максимальная последовательность подряд идущих возрастающих чисел " + Arrays.toString( newArr ) );
        System.out.println( "Длина этой последовательности равна " + newArr.length );

        int[] array_1 = {1, 2, 3, 4, 6, 1, 2, 7, 8, 9, 1, 6, 4, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println( "\nИсходный массив: " + Arrays.toString( array_1 ) );
        int[] newArr_1 = findUpSequence( array_1 );
        System.out.println( "Максимальная последовательность подряд идущих возрастающих чисел " + Arrays.toString( newArr_1 ) );
        System.out.println( "Длина этой последовательности равна " + newArr_1.length );

        int[] array_2 = {3, 2, 3, 4, 2, 2, 4};
        System.out.println( "\nИсходный массив: " + Arrays.toString( array_2 ) );
        int[] newArr_2 = findUpSequence( array_2 );
        System.out.println( "Максимальная последовательность подряд идущих возрастающих чисел " + Arrays.toString( newArr_2 ) );
        System.out.println( "Длина этой последовательности равна " + newArr_2.length );

        int[] array_0 = {3, 2, 3, 4, 2, 2, 4};
        System.out.println( "\nИсходный массив: " + Arrays.toString( array_0 ) );
        int[] newArr_0 = findUpSequence( array_0 );
        System.out.println( "Максимальная последовательность подряд идущих возрастающих чисел " + Arrays.toString( newArr_0 ) );
        System.out.println( "Длина этой последовательности равна " + newArr_0.length );


        // Вариант 2 Задание 2
        int[] array_3 = {4, 3, 1, 4, 2, 5, 8};
        System.out.println( "\nИсходный массив: " + Arrays.toString( array_3 ) );
        int s0 = 11;
        int[] newArr_3 = findSumSequence( array_3, s0 );
        System.out.println( "Последовательность в массиве "
                + Arrays.toString( array_3 )
                + ", дающая в сумме число "
                + s0
                + ": "
                + Arrays.toString( newArr_3 ) );

        int[] array_4 = {4, 3, 1, 4, 2, 5, 8};
        System.out.println( "Исходный массив: " + Arrays.toString( array_4 ) );
        int s1 = 8;
        int[] newArr_4 = findSumSequence( array_4, s1 );
        System.out.println( "Последовательность в массиве "
                + Arrays.toString( array_4 )
                + ", дающая в сумме число "
                + s1
                + ": "
                + Arrays.toString( newArr_4 ) );

        int[] array_5 = {4, 3, 1, 4, 2, 5, 8};
        System.out.println( "Исходный массив: " + Arrays.toString( array_5 ) );
        int s2 = 7;
        int[] newArr_5 = findSumSequence( array_5, s2 );
        System.out.println( "Последовательность в массиве "
                + Arrays.toString( array_3 )
                + ", дающая в сумме число "
                + s2
                + ": "
                + Arrays.toString( newArr_5 ) );

        int[] array_6 = {4, 3, 1, 4, 2, 5, 8};
        System.out.println( "Исходный массив: " + Arrays.toString( array_6 ) );
        int s3 = 10;
        int[] newArr_6 = findSumSequence( array_6, s3 );
        System.out.println( "Последовательность в массиве "
                + Arrays.toString( array_6 )
                + ", дающая в сумме число "
                + s3
                + ": "
                + Arrays.toString( newArr_6 ) );

        int[] array_7 = {4, 3, 1, 4, 2, 5, 8};
        System.out.println( "Исходный массив: " + Arrays.toString( array_7 ) );
        int s4 = 1000000;
        int[] newArr_7 = findSumSequence( array_7, s4 );
        System.out.println( "Последовательность в массиве "
                + Arrays.toString( array_7 )
                + ", дающая в сумме число "
                + s4
                + ": "
                + Arrays.toString( newArr_7 ) );


    }

    // программа поиска последовательности максимальной длины, где элементы должны идти по возрастанию
    public static int[] findUpSequence(int[] arr) {
        int end = 0; // позиция конца
        int count = 0; // количество подряд идущих чисел
        int temp = 0; // временная переменная
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || (arr[i] > arr[i - 1] && arr[i] == arr[i - 1] + 1)) {
                // если это первый лемент массива или если предыдущий элемент меньше текущего
                count++;
                end = i;
                temp = count;
            }
            else {
                count = 0;
            }
        }
        // копируем массив, если последовательности длиннее 1 элемента
        if (temp > 1) {
            return Arrays.copyOfRange( arr, end - temp, end+1 );
        } else // иначе возвращаем пустой массив
            return Arrays.copyOfRange( arr, 0, 0 );
    }

    // программа поиска последовательности подряд идущих чисел, дающих сумму определенного числа
    private static int[] findSumSequence(int[] arr, int s) {
        int sum = 0; // для определения сумм в цикле
        int count = 0; // для определения количства элементов в сумме
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if (sum > s) { // если сумма превышает заданную - выход из цикла
                    sum = 0;
                    count = 0;
                    break;
                } else if (sum == s) { // если сумма равна заданной - возврат скопированного массива
                    return Arrays.copyOfRange( arr, j - count + 1, j + 1 );
                }
                // если сумма меньше, то цикл продолжается
            }
        }
        // если не найдено - возвращаем пустой массив
        return Arrays.copyOfRange( arr, 0, 0 );
    }


}

