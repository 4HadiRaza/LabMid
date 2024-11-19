package labmid.observer;

public class AdmissionObserver implements Observer {
    private final String name;

    public AdmissionObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
