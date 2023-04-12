package n1Observer.observers;

import n1Observer.interfaces.IObserver;
import n1Observer.observable.Broker;

public class BrokerageHouse implements IObserver {
    private Broker broker;
    private String name;


    public BrokerageHouse(Broker broker, String name) {
        this.name = name;
        this.broker = broker;
        this.broker.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("The agency " + this.name + " gets new value: " + this.broker.getValue());
    }
}
