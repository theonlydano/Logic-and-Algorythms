package paymentsystem.payment;

public class PaymentMethodFactory {
    public static PaymentMethod createPaymentMethod(String type) {
        switch (type) {
            case "Bank":
                return new BankTransferPayment();
            case "Credit":
                return new CreditCardPayment();
            case "PayPal":
                return new PayPalPayment();
            default:
                return null;
        }
    }
}
