package com.mpei.vmss.mobile_application_development.lab_1;

public class Task_3 {

    public static void main(String[] args) {

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {

                double d = 0;
                float f = 0;

                double[] x = {
                        Math.pow( 10, a ),
                        1223,
                        Math.pow( 10, a - 1 ),
                        Math.pow( 10, a - 2 ),
                        3,
                        Math.pow( -10, a - 5 )};

                double[] y = {
                        Math.pow( 10, b ),
                        2,
                        Math.pow( -10, b + 1 ),
                        Math.pow( 10, b ),
                        2111,
                        Math.pow( 10, b + 3 )};


                for (int i = 0; i < x.length; i++) {
                    f = f + (float) x[i] * (float) y[i];
                }
                for (int i = 0; i < x.length; i++) {
                    d = d + x[i] * y[i];
                }

                System.out.println( "Одинарная точность = " + f + "\n Двойная точность = " + d + "\n a = " + a + "\n b = " + b );

            }
        }
    }

}
