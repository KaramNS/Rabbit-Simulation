package SimRabbit;

public class Coordonates {
    private final int x_axes;
    private final int y_axes;

    /*--------------------------- getters ----------------------------------------- */  

    /**
     * @description it is the getter of the x axes
     * @return the value in x axes
     */
    public int x() 
    {
        return this.x_axes;
    }

    /**
     * @description it is the getter of the y axes
     * @return the value in y axes
     */
    public int y()
    {
        return this.y_axes;
    }

    /**
     * @descritption it is the constructor of Coordonates Object
     * @param inXAxes is the X axes value
     * @param inYAxes is the Y axes value
     * 
     */
    public Coordonates(int inXAxes, int inYAxes)
    {
        this.x_axes = inXAxes;
        this.y_axes = inYAxes;
    }

    /*----------------------- Overrided Method ------------------------------- */
    @Override
    public String toString(){
        return String.format("({}, {})", this.x(), this.y());
    }

    @Override
    public int hashCode()
    {
        
        return Integer.parseInt( String.format("{}{}", this.x(), this.y()) );

    }
}
