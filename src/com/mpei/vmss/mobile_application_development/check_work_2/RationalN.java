package com.mpei.vmss.mobile_application_development.check_work_2;

public class RationalN {
    private int numerator;
    private int denominator;


    public RationalN(int numerator, int denominator) {
        setNumerator( numerator );
        setDenominator( denominator );
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
        else this.denominator = 1;

    }

    @Override
    public String toString() {
        if (denominator==1)
            return String.valueOf(numerator);
        return  String.valueOf(numerator) + '/' + denominator;
    }

}
