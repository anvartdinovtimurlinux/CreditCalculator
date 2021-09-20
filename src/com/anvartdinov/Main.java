package com.anvartdinov;

public class Main {

    public static void main(String[] args) {
        CreditPaymentService calculator = new CreditPaymentService();

        long creditAmount = 1_000_000;
        int creditTime = 1;
        double creditPercent = 0.0999;
        double monthPayment = calculator.calculate(creditAmount, creditTime, creditPercent);
        System.out.println("Ежемесячный платеж равен " + monthPayment);

        creditAmount = 1_000_000;
        creditTime = 2;
        creditPercent = 0.0999;
        monthPayment = calculator.calculate(creditAmount, creditTime, creditPercent);
        System.out.println("Ежемесячный платеж равен " + monthPayment);

        creditAmount = 1_000_000;
        creditTime = 3;
        creditPercent = 0.0999;
        monthPayment = calculator.calculate(creditAmount, creditTime, creditPercent);
        System.out.println("Ежемесячный платеж равен " + monthPayment);
    }

}
