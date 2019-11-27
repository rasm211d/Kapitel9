package Opg9_6;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return getEndTime()-getStartTime();
    }

    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
}
