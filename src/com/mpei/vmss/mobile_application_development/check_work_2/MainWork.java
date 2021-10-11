package com.mpei.vmss.mobile_application_development.check_work_2;

public class MainWork {

    public static void main(String[] args) {

        //длина множеств
        short length1 = 3;
        short length2 = 5;
        //множества рациональных чисел
        UnitedSet<RationalN> sr1 = new UnitedSet<>( length1 );
        UnitedSet<RationalN> sr2 = new UnitedSet<>( length2 );

        //множества строк
        UnitedSet<String> sr3 = new UnitedSet<>( length1 );
        UnitedSet<String> sr4 = new UnitedSet<>( length2 );

        RationalN r1 = new RationalN( 1, 1 );
        RationalN r2 = new RationalN( 1, 2 );
        RationalN r3 = new RationalN( 1, 3 );
        RationalN r4 = new RationalN( 2, 3 );

        String s1 = "Привет я java";
        String s2 = "Привет я не java";
        String s3 = "Привет я kotlin";
        String s4 = "бугагашенька kotlin";

        sr1.add( r1 );
        sr1.add( r2 );
        sr1.add( r4 );

        sr3.add( s1 );
        sr3.add( s2 );
        sr3.add( s4 );

        sr2.add( r1 );
        sr2.add( r1 );
        sr2.add( r2 );
        sr2.add( r3 );
        sr2.add( r3 );

        sr4.add( s1 );
        sr4.add( s1 );
        sr4.add( s2 );
        sr4.add( s3 );
        sr4.add( s3 );

        System.out.println( "Список чисел 1" );
        sr1.show();
        System.out.println( "Список чисел 2" );
        sr2.show();

        System.out.println( "Список строк 1" );
        sr3.show();
        System.out.println( "Список строк 2" );
        sr4.show();

        UnitedSet<RationalN> intersectRes = new UnitedSet<>();
        intersectRes.intersect( sr1, sr2 );
        System.out.println( "Результат пересечения множеств чисел" );
        intersectRes.show();

        UnitedSet<RationalN> joinRes = new UnitedSet<>();
        joinRes.join( sr1, sr2 );
        System.out.println( "Результат объединения  множеств чисел" );
        joinRes.show();

        UnitedSet<RationalN> subtractRes = new UnitedSet<>();
        subtractRes.subtract( sr1, sr2 );
        System.out.println( "Результат вычитания  множеств чисел" );
        subtractRes.show();

        UnitedSet<String> intersectStr = new UnitedSet<>();
        intersectStr.intersect( sr3, sr4 );
        System.out.println( "Результат пересечения множеств строк" );
        intersectStr.show();

        UnitedSet<String> joinStr = new UnitedSet<>();
        joinStr.join( sr3, sr4 );
        System.out.println( "Результат объединения  множеств строк" );
        joinStr.show();

        UnitedSet<String> subtractStr = new UnitedSet<>();
        subtractStr.subtract( sr3, sr4 );
        System.out.println( "Результат вычитания  множеств строк" );
        subtractStr.show();


    }

}
