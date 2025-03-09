package SimRabbit;

public class Coordonates {
    private final int x_axes;
    private final int y_axes;

    // getters 
    public int x() 
    {
        return this.x_axes;
    }

    public int y()
    {
        return this.y_axes;
    }

    public Coordonates(int inXAxes, int inYAxes)
    {
        this.x_axes = inXAxes;
        this.y_axes = inYAxes;
    }

    public String toString(){
        return String.format("({}, {})", this.x(), this.y());
    }

    @Override
    public int hashCode()
    {
        
        return Integer.parseInt( String.format("{}{}", this.x(), this.y()) );

    }
}
