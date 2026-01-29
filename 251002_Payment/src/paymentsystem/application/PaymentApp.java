package paymentsystem.application;

import paymentsystem.payment.PaymentMethod;
import paymentsystem.payment.PaymentMethodFactory;

import java.util.Scanner;

public class PaymentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        try {
            PaymentMethod p = PaymentMethodFactory.createPaymentMethod(type);
            p.pay(100.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
