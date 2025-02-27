package SimRabbit;

import java.util.ArrayList;



public class Ceseaux{

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


    public Ceseaux(){

        this.numberBirth = 0;
        this.numberDead = 0;
        this.numberMonth = 0;

        this.rabbits.add(new Rabbit(new Coordonates(0, 0),this.numberMonth ));
        this.numberAlive = rabbits.size();

    }
  


    /*-------------------------------- Getter/Setter ---------------------------------- */

    /**
     * @description Get numbers months passed
     * @return   return number of months passed
     */
    public getNumberMonth(){
        return this.numberMonth;
    }


    /**
     * @description get how many rabbits died since the start of the simulation
     * @return   return the number of rabbits dead
     */
    public getNumberDead(){
        return this.numberDead;
    }


    /**
     * @description get how many rabbits were born since the start of the simulation
     * @return   return the number of rabbits born
     */
    public getNumberBirth(){
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

    
}