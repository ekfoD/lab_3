package org.example.lab3.Observers;

import org.example.lab3.Interfaces.ISchoolWorkerObserver;
import org.example.lab3.Model.SchoolWorker;

public class SchoolWorkerObserver implements ISchoolWorkerObserver {
    SchoolWorker schoolWorker;
    public SchoolWorkerObserver() {
        schoolWorker = new SchoolWorker();
    }
    @Override
    public void update() {
        schoolWorker.setWorking(!schoolWorker.getWorking());
    }
}
