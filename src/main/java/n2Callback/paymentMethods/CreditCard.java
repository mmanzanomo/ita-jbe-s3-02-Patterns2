package n2Callback.paymentMethods;

public class CreditCard extends PaymentMethod {

    @Override
    public void call() {
        System.out.println("Credit card accepted.");
        System.out.println("The payment has been made successfully.");
    }
}
