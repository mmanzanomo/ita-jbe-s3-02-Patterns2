package n2Callback.paymentMethods;

public class BankAccount extends PaymentMethod {

    @Override
    public void call() {
        System.out.println("Bank account accepted.");
        System.out.println("The payment has been made successfully.");
    }
}
