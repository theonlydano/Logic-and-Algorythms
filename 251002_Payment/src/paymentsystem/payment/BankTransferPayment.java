package paymentsystem.payment;

public class BankTransferPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Bank Transfer Payment");
    }
}
