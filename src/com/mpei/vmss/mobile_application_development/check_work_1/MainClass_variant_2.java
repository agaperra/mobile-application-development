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


        // ариант 2 Задание 2


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



}

