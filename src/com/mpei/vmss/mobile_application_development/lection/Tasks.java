package com.mpei.vmss.mobile_application_development.lection;

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
    }
}
