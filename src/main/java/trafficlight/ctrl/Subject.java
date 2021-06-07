package trafficlight.ctrl;

import trafficlight.gui.Observer;
import trafficlight.states.State;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> myList = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.myList.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.myList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o: myList) {
            o.update();
        }
    }
}
