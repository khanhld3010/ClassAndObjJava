package StopWatch;

public class StopWatch {
    private Long startTime =0L;
    private Long endTime =0L;

    public StopWatch() {
    }

    public StopWatch(Long startTime, Long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public Long getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
