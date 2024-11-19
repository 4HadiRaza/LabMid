package labmid;

import labmid.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class AdmissionSubject {
    private final List<Observer> observers = new ArrayList<>();

    // Attach an observer
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Notify a specific observer
    public void notifyObserver(Observer observer, String message) {
        observer.update(message);
    }
}
