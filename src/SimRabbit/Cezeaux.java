package SimRabbit;

import java.util.ArrayList;



public class Cezeaux{

    private double numberAlive;
    private double numberDead;
    private double numberBirth;
    private int numberMonth;
    private ArrayList<Rabbit> rabbits;



    /*-------------------------------- Constructor ---------------------------------- */

    /**
     * @description default constructor
     * @return   initialize a instance
     */


    public Cezeaux(){

        this.numberBirth = 0;
        this.numberDead = 0;
        this.numberMonth = 0;

        this.rabbits.add(new Rabbit(new Coordonates(0, 0),this.numberMonth ));
        this.numberAlive = rabbits.size();

    }
  

    /**
     * @description          The method initialize an instance of Cezeaux from a list of rabbits
     * @param  listOfRabbits is a list of rabbits instances. 
     * @return               return an instance of Ceseaux
     */
    public Cezeaux(ArrayList<Rabbit> listOfRabbits){

        this.rabbits = listOfRabbits;

        this.numberBirth = 0;
        this.numberDead = 0;
        this.numberMonth = 0;
        this.numberAlive = rabbits.size();

    }

    /*-------------------------------- Getter/Setter ---------------------------------- */

    /**
     * @description Get numbers months passed
     * @return   return number of months passed
     */
    public double getNumberMonth(){
        return this.numberMonth;
    }


    /**
     * @description get how many rabbits died since the start of the simulation
     * @return   return the number of rabbits dead
     */
    public double getNumberDead(){
        return this.numberDead;
    }


    /**
     * @description get how many rabbits were born since the start of the simulation
     * @return   return the number of rabbits born
     */
    public double getNumberBirth(){
        return this.numberBirth;
    }

    /**
     * @description get the number of rabbits
     * @return   return the number of rabbits alive
     */

    public double getNumberAlive(){
        return this.numberAlive;
    }

    /*-------------------------------- Methods ------------------------------------ */


    @Override
    public String toString() {
        return String.format("Number of month passed: %d Number of rabbits alive: %d \n Number of birth since simulation started : %d \n Number of rabbits dead: %d \n", this.numberMonth,this.numberAlive,this.numberBirth,this.numberDead);
    }


    
}