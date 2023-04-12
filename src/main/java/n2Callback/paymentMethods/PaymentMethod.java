package n2Callback.paymentMethods;

import n2Callback.interfaces.ICallback;
import n2Callback.paymentGateway.PaymentGateway;

public abstract class PaymentMethod implements ICallback {

    public void payment(double amount) {
        System.out.println("Total: " + amount + "€");
        // PaymentGateway.processPayment(amount, this);
    }

}
