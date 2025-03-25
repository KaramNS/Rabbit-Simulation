package SimRabbitTest;

import java.util.LinkedList;

public class GroupOfRabbit {
    
    LinkedList<Maturity> males;
    LinkedList<Maturity> females;
    Rabbit rabbit;


    GroupOfRabbit(){
        this.males = new LinkedList<Maturity>();
        this.females = new LinkedList<Maturity>();
        this.rabbit = new Rabbit();
    }


    /**
     * 
     * @return Return the size of the less sized list of rabbit (males / females)
     */
    public int wichMorePopulation(){

        return( this.males.size() < this.females.size()? this.males.size():this.females.size());
        
    }

    /**
     * @description removeDead remove all dead Rabbits from lists
     */
    public void removeDead(){
        for(Maturity e : this.males){
            if(e.getAge() == -1){
                this.males.remove(e);
            }
        }
        
        for(Maturity f : this.females){
            if(f.getAge() == -1){
                this.females.remove(f);
            }
        }


    }
    

    /**
     * need to know how many litter a female did a litter
     */
    public void reproduction(Rabbit rabbit){
        int size = wichMorePopulation();
      

        for (int i = 0 ; i < size ; i++){

            


        }
    }










    public static void main(String[] args) {
        
    }
}
