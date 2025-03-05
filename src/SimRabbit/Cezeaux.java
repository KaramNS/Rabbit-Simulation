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

        Coordonates tempCoordonates = new Coordonates(0, 0);
        Rabbit tempRabbit = new Rabbit(tempCoordonates, numberMonth);
        

        this.rabbits.add(tempRabbit);
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

    /**
     * @description move the time forward (1 month)
     */
    public void moveTimeForward(){
        
        this.numberMonth += 1;

        //generer de nouveaux lapins et les stocker dans le tableau
        // pour chaque nouveau lapin faire this.numberBirth += 1;
        //pour chaque lapin mort faire this.numberDead += 1;

        this.numberAlive = rabbits.size();
    }

    /**
     * @description moveTimeForward move forward the time of a number of months in parameter
     * @param  numberMonths is the number of months you want to move forward
     */
    public void moveTimeForward(int numberMonths ){

        for(int i = 0; i < numberMonths; i++){
            moveTimeForward();
        }
    }
    
}