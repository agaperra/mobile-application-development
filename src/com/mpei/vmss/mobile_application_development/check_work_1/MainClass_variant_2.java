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
        System.out.println( "Введите количество чисел в массиве (положительное число): " );
        Scanner in = new Scanner( System.in );
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = i;
        }
        System.out.println( "Исходный массив: " + Arrays.toString( array ) );
        int[] newArr = findUpSequence( array );
        System.out.println( "Максимальная последовательность подряд идущих возрастающих чисел " + Arrays.toString( newArr ) );
        System.out.println( "Длина этой последовательности равна " + newArr.length );

        int[] array_1 = {1, 2, 3, 4, 6, 1, 2, 7, 8, 9, 1, 6, 4, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println( "Исходный массив: " + Arrays.toString( array_1 ) );
        int[] newArr_1 = findUpSequence( array_1 );
        System.out.println( "Максимальная последовательность подряд идущих возрастающих чисел " + Arrays.toString( newArr_1 ) );
        System.out.println( "Длина этой последовательности равна " + newArr_1.length );

        int[] array_2 = {3, 2, 3, 4, 2, 2, 4};
        System.out.println( "Исходный массив: " + Arrays.toString( array_2 ) );
        int[] newArr_2 = findUpSequence( array_2 );
        System.out.println( "Максимальная последовательность подряд идущих возрастающих чисел " + Arrays.toString( newArr_2 ) );
        System.out.println( "Длина этой последовательности равна " + newArr_2.length );


        // Вариант 2 Задание 2
        int[] array_3 = {4, 3, 1, 4, 2, 5, 8};
        System.out.println( "Исходный массив: " + Arrays.toString( array_3 ) );
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


    }

    public static int[] findUpSequence(int[] arr) {
        int start = 0;
        int end = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] < arr[i - 1]) {
                temp = i;
            } else if (i - temp > end - start) {
                start = temp;
                end = i;
            }
        }
        return Arrays.copyOfRange( arr, start, end + 1 );
    }

    private static int[] findSumSequence(int[] arr, int s) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if (sum > s) {
                    sum = 0;
                    count = 0;
                    break;
                } else if (sum == s) {
                    return Arrays.copyOfRange( arr, j - count + 1, j + 1 );
                }
            }
        }
        return Arrays.copyOfRange( arr, 0, 0 );
    }


}

