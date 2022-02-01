class StopWatch {
    private Long startTime;
    private Long endTime;
    
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
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
}
