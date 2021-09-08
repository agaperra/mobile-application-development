package com.mpei.vmss.mobile_application_development.lab_1;

public class Task_1 {

    /**
     * Лабораторная работа №1 по курсу Разработка мобильных приложений
     * Задание 1
     * Записать логическое выражение, соответствующее заданной области истинности.
     * Составить функцию, возвращающее 1 - если точка принадлежит заданной и 0 – если не принадлежит.
     * Подсчитать количество точек, попавших в заданную область.
     * Вариант: N списке mod 3 + 1 = 7 mod 3 + 1 = 2
     **/

    public static void main(String[] args) {

        // Логическое выражение для нужной области
        // (( x >= 0 ) && ( x <= 2 ) && ( y >= 1 ) && ( y <= 2 )) || (( x >= 1) && (x <= 2) && (y >= 0) && (y <= 1))
        // если не учитывать границы, то из выражения уйдут все знаки равенства

        int count = 0; // количество точек, попавших в область

        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                System.out.printf( "Точка (%d, %d) ", x, y );
                if (!pointInArea( x, y )) {
                    System.out.println( "Не принадлежит заданной области" );
                } else {
                    System.out.println( "Принадлежит заданной области" );
                    count++;
                }
            }
        }

        System.out.println( "Всего: " + count + " точек принадлежат заданной области." );

    }

    // функция, определеяющая находится ли заданная точка внутри диапзона
    public static boolean pointInArea(double x, double y) {
        return (( x >= 0 ) && ( x <= 2 ) && ( y >= 1 ) && ( y <= 2 )) || (( x >= 1) && (x <= 2) && (y >= 0) && (y <= 1));
    }
}
