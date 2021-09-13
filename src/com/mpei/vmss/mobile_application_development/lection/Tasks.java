package com.mpei.vmss.mobile_application_development.lection;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Лекция №2
 * 13.09.2021
 * Задачи с лекции
 **/

public class Tasks {

    public static void main(String[] args) {

        // Задача 1
        for (int i = 1000; i <= 9999; i++) {
            if ((i / 1000 + i / 100 % 10) == (i / 10 % 10 + i % 10)) {
                System.out.println( i );
            }

        }

        // Задача 2
        Scanner keyboard = new Scanner( System.in );
        int rand = new Random().nextInt( 10 ) + 1;
        while(true){
            System.out.println("Введите число:");
            int number = keyboard.nextInt();
            if (number<rand) System.out.println("Число меньше загаданного");
            else if (number>rand) System.out.println("Число больше загаданного");
            else {
                System.out.println("Вы угадали!");
                break;
            }

        }

        // Работа с классами
        Box box = new Box(1,5,6);
        System.out.println(box);
        System.out.println(box.getVolume());
        System.out.println("Высота коробки: " + box.getHeight());
        System.out.println("Ширина коробки: " + box.getWidth());
        System.out.println("Длина коробки: " + box.getLength());

        // Коллекции
        ArrayList<String> employees = new ArrayList<String>();
        employees.add( "Работник 1" );
        employees.add( "Работник 2" );
        employees.add( "Работник 3" );
        employees.add( "Работник 4" );
        // вывод в виде массива
        System.out.println( employees );
        // вывод всех сотрубников
        for (int i = 0; i < employees.size(); i++) {
            System.out.println( employees.get( i ) );
        }
        // удаление
        employees.remove( 1 );
        // вывод в виде массива
        System.out.println( employees );
        // вывод
        for (int i = 0; i < employees.size(); i++) {
            System.out.println( employees.get( i ) );
        }
        // for each вывод
        for (String person : employees) {
            System.out.println( person );
        }


    }
}
