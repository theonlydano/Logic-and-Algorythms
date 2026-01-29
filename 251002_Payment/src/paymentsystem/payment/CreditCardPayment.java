package paymentsystem.payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment");
    }
}
