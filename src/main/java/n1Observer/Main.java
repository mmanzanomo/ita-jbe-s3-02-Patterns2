package n1Observer;

import n1Observer.observable.Broker;
import n1Observer.observers.BrokerageHouse;

public class Main {
    public static void main(String[] args) {
        // Subject
        Broker broker = new Broker();

        // Observers
        BrokerageHouse agencyA = new BrokerageHouse(broker, "Agency A");
        BrokerageHouse agencyB = new BrokerageHouse(broker, "Agency B");


        System.out.println("First change: ");
        broker.setValue(8.25);
        System.out.println("Second change: ");
        broker.setValue(10.62);

    }
}