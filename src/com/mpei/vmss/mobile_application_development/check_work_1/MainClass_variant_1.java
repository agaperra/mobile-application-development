package com.mpei.vmss.mobile_application_development.check_work_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Вариант №1
 * Задание №1
 * Напишите программу, которая находит
 * максимальную последовательность
 * одинаковых элементов в массиве.
 * Например {1,1,2,3,2,2,2,1}->{2,2,2}
 * <p>
 * <p>
 * Вариант №1
 * Задание №2
 * Разработать класс
 * для работы с рациональными числами.
 * <p>
 * <p>
 **/

public class MainClass_variant_1 {

    // Контрольная работа №1 по курсу Разработка мобильных приложений
    public static void main(String[] args) {

        // Вариант 1 Задание 1
        System.out.println( "Введите количество чисел в массиве (положительное число): " );
        Scanner in = new Scanner( System.in );
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = new Random().nextInt( 10 );
        }
        System.out.println( "Исходный массив: " + Arrays.toString( array ) );
        System.out.println( "Максимальная последовательность одинаковых чисел в массиве: " + findSequence( array ) );

        // Вариант 1 Задание 2
        System.out.println( "\nРабота с рациональными числами: " );
        RationalNumber a = new RationalNumber( 5, 7 );
        RationalNumber b = new RationalNumber( 3, 6 );
        RationalNumber c = new RationalNumber( 3, 4 );

        System.out.println( "Сложение " + c + "+" + b + "=" + c.add( b ) );
        System.out.println( "Вычитание " + a + "-" + b + "=" + a.sub( b ) );
        System.out.println( "Умножение " + a + "*" + c + "=" + a.mul( c ) );
        System.out.println( "Деление " + a + "%" + b + "=" + a.div( b ) );

        a = new RationalNumber( 2, 3 );
        b = new RationalNumber( 1, 2 );
        c = new RationalNumber( 4, 5 );

        System.out.println( "Сложение " + c + "+" + b + "=" + c.add( b ) );
        System.out.println( "Вычитание " + a + "-" + b + "=" + a.sub( b ) );
        System.out.println( "Умножение " + a + "*" + c + "=" + a.mul( c ) );
        System.out.println( "Деление " + a + "%" + b + "=" + a.div( b ) );


    }

    private static ArrayList<Integer> findSequence(int[] arr) {
        int result = -1;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int k = i; k < arr.length; k++) {
                if (arr[i] == arr[k])
                    ++count;
                else break;
            }
            if (count > max) {
                max = count;
                result = arr[i];
            }
        }
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            sequence.add( result );
        }
        return sequence;
    }


}
