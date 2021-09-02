package com.mpei.vmss.mobile_application_development.lab_1;

public class Task_1 {

    /**
     * Лабораторная работа №1 по курсу Разработка мобильных приложений
     * Задание 1
     * Записать логическое выражение, соответствующее заданной области истинности.
     * Составить функцию, возвращающее 1 - если точка принадлежит заданной и 0 – если не принадлежит.
     * Подсчитать количество точек, попавших в заданную область.
     * Вариант: N списке mod 3 + 1 = 1 mod 3 + 1 = 2
     **/

    public static void main(String[] args) {

        // Логическое выражение для нужной области
        // ( x >= 0 ) && ( x <= 2 ) && ( y >= 1 ) && ( y <= 2 )
        // если не учитывать границы, то из выражения уйдут все знаки равенства

        // возьмём 40 случайных точек
        int countOfPoints = 40;
        int count = 0; // количество точек, попавших в область
        int range = 3; // диапазон чисел для генерации, т.е. от 0 до range

        for (int i = 0; i < countOfPoints; i++){

            double x = Math.random() * range;
            double y = Math.random() * range;

            System.out.printf("Точка (%.2f, %.2f) ", x, y);
            if (!pointInArea( x, y )) {
                System.out.println("Не принадлежит заданной области");
            } else {
                System.out.println("Принадлежит заданной области");
                count++;
            }
        }
        System.out.println("Всего: " + count + " точек из " + countOfPoints + " случайных попали в заданную область.");

    }

    // функция, определеяющая находится ли заданная точка внутри диапзона
    public static boolean pointInArea(double x, double y){
        return x >=0 && x <= 2 && y >= 1 && y <= 2;
    }
}
