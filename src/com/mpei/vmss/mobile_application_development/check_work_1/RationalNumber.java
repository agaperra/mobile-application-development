package com.mpei.vmss.mobile_application_development.check_work_1;

class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator != 0) {
            int divisor = gcd( numerator, denominator );
            this.numerator = numerator / divisor;
            this.denominator = denominator / divisor;
        }
    }


    public RationalNumber add(RationalNumber y) {
        return new RationalNumber( this.numerator * y.denominator + y.numerator * this.denominator,
                this.denominator * y.denominator );
    }

    public RationalNumber sub(RationalNumber y) {
        return new RationalNumber( this.numerator * y.denominator - y.numerator * this.denominator,
                this.denominator * y.denominator );

    }

    public RationalNumber mul(RationalNumber y) {
        return new RationalNumber( this.numerator * y.numerator, this.denominator * y.denominator );
    }

    public RationalNumber div(RationalNumber y) {
        return new RationalNumber( this.numerator * y.denominator, this.denominator * y.numerator );
    }

    private static int gcd(int numerator, int denominator) {
        return (denominator == 0 ? numerator : gcd( denominator, numerator % denominator ));
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
