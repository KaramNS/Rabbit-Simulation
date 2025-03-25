package SimRabbitTest;

import java.util.Random;

public class Rabbit {

    private int age = 0;
    private Random random ;
    private double mortality ;
    
/**
 * the constructor for rabbits
 * @important the mortality is a float, if you set it be careful to 0 <= mortality <= 1
 */
    public Rabbit(){
        this.age = 0;
        this.random = new Random();
        this.mortality =0.3; // /!\ it is a percentage
    }
    







/*-------------------------Getters / Setters ----------------------------- */



    /**
     * set the age of the rabbit
     * @param age is an integer, represents his age in month , don't be too greedy and don't set it over than 15 years (180 months)
     */
    public void setAge(int age) {
        this.age = age;
        
    }





    /**
     * Set the mortality of a rabbit
     * @param mortality is a float for a percent
     * @important if you set it be careful to 0 <= mortality <= 1
     */
    public void setMortality(double mortality) {
        this.mortality = mortality;
    }




 
    public int getRandom() {
        return random.nextInt(100);
    }




    /*--------------------------------- Methods ---------------------------------- */

    /**
     * Check if the rabbit dies, if he dies return the maturity with special argument to be trated in GroupOfRabbit
     * @param maturity take an instance of maturity
     * @return return the maturity
     */
    public Maturity isDying(Maturity maturity){


        this.setAge(maturity.getAge());
        if (random.nextInt(100) <= mortality*100){
            maturity.setAge(-1);
        }

        return maturity;

    }








    /**
     * @description check if the rabbit is mature, need a object maturity to change his status
     * @param  maturity maturity is a Maturity object used to initiate the age of the rabbit object to generate change the maturity stats if needed
     * @return maturity after beeing changed if needed
     */
    public Maturity isMature(Maturity maturity){
        setAge(maturity.getAge());
        if (this.age == 8  ){

            maturity.setMaturity(1);

        }
        int p =0;//probabilité
        if(this.age == 5 ||this.age == 7){
            p = 25;
            
        }
        if(this.age == 6 ||this.age == 6){
            p = 50;
            
        }


        if(this.getRandom() < p){
            maturity.setMaturity(1);
            
        }

        return(maturity);
    }
    
}