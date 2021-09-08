package com.mpei.vmss.mobile_application_development.lab_1;

public class Task_2 {

    public static void main(String[] args) {

//        Student stud1 = new Student();
//        Student stud2 = new Student("Агапова Варвара Сергеевна");
//        Student stud3 = new Student("Агапова Варвара Сергеевна", "agaperra@yandex.ru", "+79153935708");
//        Student stud4 = new Student("Агапова Варвара Сергеевна", "2", "Разработка мобильных приложений", "ИВТИ", "agaperra@yandex.ru", "+79153935708");

        Student stud1 = new Student();
        Student stud2 = new Student("Троян Карина Михайловна");
        Student stud3 = new Student("Троян Карина Михайловна", "troyankarina@yandex.ru", "+79167510085");
        Student stud4 = new Student("Троян Карина Михайловна", "2", "Разработка мобильных приложений", "ИВТИ", "troyankarina@yandex.ru", "+79167510085");

        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);
        System.out.println(stud4);
    }

}
