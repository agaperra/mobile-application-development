package com.mpei.vmss.mobile_application_development.check_work_2;

import java.util.ArrayList;

public class UnitedSet<T> extends Set {
    private final ArrayList<Object> unitedSet;

    // сет неизвестной длины
    public UnitedSet() {
        this.unitedSet = new ArrayList<>();
    }

    // сет заданной длины
    public UnitedSet(short length) {
        this.unitedSet = new ArrayList<>( length );
    }

    // добавление элемента
    protected void add(Object s) {
        super.add( s );
        this.unitedSet.add( s );

    }

    //Объединение
    protected void join(UnitedSet<T> a, UnitedSet<T> b) {
        super.join( a, b );
        // добавить все элементы из одного множества
        this.unitedSet.addAll( a.unitedSet );
        // а так же те элементы, которые есть во втором множестве, но без повторений (не берем элементы из первого)
        for (int i = 0; i < b.unitedSet.size(); i++) {
            if (!this.unitedSet.contains( b.unitedSet.get( i ) ))
                // пишем в итоговое множество
                this.unitedSet.add( b.unitedSet.get( i ) );
        }
    }

    //Пересечение
    protected void intersect(UnitedSet<T> a, UnitedSet<T> b) {
        super.intersect( a, b );
        for (int i = 0; i < a.unitedSet.size(); i++) {
            // проверяем, есть ли совпадающие элементы
            if (b.unitedSet.contains( a.unitedSet.get( i ) )) {
                // и  если этого элемента ещё нет в конечном множестве пересечения
                if (!this.unitedSet.contains( a.unitedSet.get( i ) ))
                    // то записываем этот элементв  множество
                    this.unitedSet.add( a.unitedSet.get( i ) );
                // т.о. множество будет без повторений
            }
        }
    }


    //Вычитание
    protected void subtract(UnitedSet<T> a, UnitedSet<T> b) {
        super.subtract( a, b );
        for (int i = 0; i < a.unitedSet.size(); i++) {
            // проверяем, есть ли в в первом множестве элемент, которого НЕТ во втором множестве
            if (!b.unitedSet.contains( a.unitedSet.get( i ) ))
                // записываем его в конечное множество
                this.unitedSet.add( a.unitedSet.get( i ) );
        }

    }


    @Override
    public void show() {
        System.out.println(unitedSet);
        System.out.println();
    }
}

