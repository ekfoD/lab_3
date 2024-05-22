package org.example.lab3.Subjects;

import org.example.lab3.Observers.SchoolWorkerObserver;

import java.util.ArrayList;
import java.util.List;

// sitas dalykas yra one-to-many relation. kiekviena SchoolWorker wrappini i observeri ir tada per cia tu zaidi su jais. gali updatinti sita list

public class SchoolWorkerSubject {
    private List<SchoolWorkerObserver> observerList;
    public SchoolWorkerSubject() {
        observerList = new ArrayList<SchoolWorkerObserver>();
    }
    public void attach(SchoolWorkerObserver observer) {
        observerList.add(observer);
    }
    public void detach(SchoolWorkerObserver observer) {
        observerList.remove(observer);
    }
    public void notifyObservers() {
        for (SchoolWorkerObserver observer : observerList) {
            observer.update();
        }
    }
}
