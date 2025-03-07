package SimRabbit;

public class Time {

    private int time ; // months passed

    public Time()
    {
        this.time = 0;
    }

    public int time()
    {
        return this.time ; 
    }

    public void step()
    {
        this.time++;
    }


}
