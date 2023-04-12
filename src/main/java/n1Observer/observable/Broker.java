package n1Observer.observable;

import n1Observer.interfaces.IObservable;
import n1Observer.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;


public class Broker implements IObservable {
    private List<IObserver> observers;
    private double value;

    public Broker() {
        this.observers = new ArrayList<IObserver>();
        this.value = 0;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
        notifyAllObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        this.observers.forEach(o -> o.update());
    }

}
