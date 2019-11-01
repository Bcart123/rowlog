package com.rowlog.rowlog.models;

import java.io.Serializable;
import java.util.Date;

public class Workout implements Serializable {
    private int distance;
    private int averageStrokeRate;
    private int totalTime;
    private Date dateCompleted;

    public Workout(int distance, int averageStrokeRate, int totalTime, Date dateCompleted) {
        this.distance = distance;
        this.averageStrokeRate = averageStrokeRate;
        this.totalTime = totalTime;
        this.dateCompleted = dateCompleted;
    }

    public int getDistance() {
        return distance;
    }

    public int getAverageStrokeRate() {
        return averageStrokeRate;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }
}
