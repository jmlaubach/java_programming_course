package Part_12.Test;

import java.time.Instant;

public class Task {
    private Instant startTime;
    private Instant endTime;
    private String taskID;

    public Task (Instant startTime, Instant endTime, String taskID) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.taskID = taskID;
    }

    public String getTaskID() {
        return this.taskID;
    }

    public String setStatus() {
        String status = "";
        
        Instant currentTime = Instant.now();

        System.out.println("Current Time: " + currentTime);
        System.out.println("Start time: " + this.startTime);
        System.out.println("End Time: " + this.endTime);

        if (currentTime.isBefore(this.startTime)) {
            status = "SCHEDULED";
        } else if (currentTime.isAfter(this.startTime) && currentTime.isAfter(this.endTime)) {
            status = "FULFILLED";
        } else {
            status = "FULFILLING";
        }
        return status;
    }
}