package n2Callback.paymentMethods;

public class Paypal extends PaymentMethod {

    @Override
    public void call() {
        System.out.println("Paypal account accepted.");
        System.out.println("The payment has been made successfully.");
    }
}
