package n2Callback.paymentGateway;


import n2Callback.interfaces.ICallback;

public class PaymentGateway {
    public static void processPayment(double amount, ICallback callback) {

        System.out.println("Processing payment of " + amount + "€");
        callback.call();
    }
}
