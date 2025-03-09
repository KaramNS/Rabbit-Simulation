package SimRabbit;

import java.util.ArrayList;

public class Cezeaux{

    // Statistics

    private double numberAlive;
    private double numberDead;
    private double numberBirth;

    // Time counter
    private final Time time ;

    // Space 
    private ArrayList<Rabbit> rabbits;
    private ArrayList<Rabbit> FemaleRabbits ;

    /*-------------------------------- Constructor ---------------------------------- */

    /**
     * @description default constructor
     * @return   initialize a instance
     */
    public Cezeaux()
    {
        this.numberBirth = 0 ;
        this.numberDead = 0 ;

        this.time = new Time() ;

        this.rabbits = new ArrayList<Rabbit>();

        this.numberAlive = rabbits.size();
        this.FemaleRabbits = new ArrayList<Rabbit>();
    }
  
    /**
     * @description          The method initialize an instance of Cezeaux from a list of rabbits
     * @param  listOfRabbits is a list of rabbits instances. 
     * @return               return an instance of Ceseaux
     */
    public Cezeaux(ArrayList<Rabbit> listOfRabbits)
    {

        this.rabbits = listOfRabbits;

        this.numberBirth = 0;
        this.numberDead = 0;
        this.time = new Time() ;
        this.numberAlive = rabbits.size();
    }

    /*-------------------------------- Getter/Setter ---------------------------------- */

    /**
     * @description Get numbers months passed
     * @return   return number of months passed
     */
    public int getNumberMonth()
    {
        return this.time.time() ;
    }

    /**
     * @description get how many rabbits died since the start of the simulation
     * @return   return the number of rabbits dead
     */
    public double getNumberDead()
    {
        return this.numberDead;
    }

    /**
     * @description get how many rabbits were born since the start of the simulation
     * @return   return the number of rabbits born
     */
    public double getNumberBirth()
    {
        return this.numberBirth;
    }

    /**
     * @description get the number of rabbits
     * @return   return the number of rabbits alive
     */
    public double getNumberAlive()
    {
        return this.numberAlive;
    }

    /*-------------------------------- Methods ------------------------------------ */

    @Override
    public String toString() 
    {
        return String.format("Number of month passed: %lf Number of rabbits alive: %lf \n Number of birth since simulation started : %lf \n Number of rabbits dead: %lf\n", 
        this.time.time(),this.numberAlive,this.numberBirth,this.numberDead);
    }

    /**
     * @description move the Cezeau world forward (1 month)
     */
    public void update()
    {
        this.time.step() ;

        // generer de nouveaux lapins et les stocker dans le tableau
        
        // pour chaque lapin faire update()
        for (int i = 0 ; i < this.rabbits.size() ; i++)
        {   
            if(this.rabbits.get(i).age() == -1)
            {
                this.rabbits.remove(i);
                this.numberDead ++ ;
            }
            else 
            {
                this.rabbits.get(i).update();
            }
        }

        this.numberAlive = rabbits.size();
    }

    /**
     * @description update move forward the time of a number of months in parameter
     * @param  numberMonths is the number of months you want to move forward
     */
    public void simulate(int numberMonths )
    {
        for(int i = 0; i < numberMonths; i++)
        {
            update();
        }
    }
    
    public static void main (String[] args)
    {
        Cezeaux world = new Cezeaux();
        System.out.println(world.toString());
        world.simulate(12);
        System.out.println(world.toString());
    }
}