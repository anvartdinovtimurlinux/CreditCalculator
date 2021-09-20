package com.anvartdinov;

public class CreditPaymentService {

    public double calculate(long creditAmount, int creditTimeInYear, double creditPercent) {
        int creditTimeInMonth = creditTimeInYear * 12;
        double creditPercentInMonth = creditPercent / 12;
        double monthPayment = creditAmount * creditPercentInMonth  /
                (1 - Math.pow((1 + creditPercentInMonth), -creditTimeInMonth));

        return monthPayment;
    }

}
