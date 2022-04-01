package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.printf("Decorate %s with TimeLogging.\n", worker.getName());
    }

    @Override
    public void service() {
        System.out.print(new Date() + ": ");
        super.service();
    }
}