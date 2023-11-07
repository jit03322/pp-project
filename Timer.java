public class Timer {
    long startTime;
    public void timer_start(){
        startTime=System.nanoTime();
    }
    long endTime;
    public void timer_end(){
        endTime=System.nanoTime();
    }
    long time_of_execution()
    {
        return endTime-startTime;
    }
    public void reset_timer(){
        startTime=0;
    }
}
