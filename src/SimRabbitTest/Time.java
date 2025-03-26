package SimRabbitTest;

public class Time {

    private int month =0;
    




    public int getMonth() {
        return month;
    }


    public int getYear(){
        return this.month/12;
    }

    /**
     * move forward the time by 1 month
     */
    public void moveForward(){
        this.month +=1;

    }

    public void reset(){
        this.month = 0;
    }
    
    @Override
    public String toString() {
        return String.format("Time passed :%d (%d years)", this.getMonth(), this.getYear());
    };
}
