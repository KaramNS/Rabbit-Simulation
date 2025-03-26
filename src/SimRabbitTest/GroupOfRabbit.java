package SimRabbitTest;

import java.util.LinkedList;

public class GroupOfRabbit {
    
    LinkedList<Rabbit> males;
    LinkedList<Rabbit> females;
    Generator rabbit;


    GroupOfRabbit(){
        this.males = new LinkedList<Rabbit>();
        this.females = new LinkedList<Rabbit>();
        this.rabbit = new Generator();
    }


    /**
     * 
     * @return Return the size of the less sized list of rabbit (males / females)
     */
    public int whichMorePopulation(){

        return( this.males.size() < this.females.size()? this.males.size():this.females.size());
        
    }

    /**
     * @description removeDead remove all dead Rabbits from lists
     */
    public void removeDead(){
        for(Rabbit e : this.males){
            if(e.getAge() == -1){
                this.males.remove(e);
            }
        }
        
        for(Rabbit f : this.females){
            if(f.getAge() == -1){
                this.females.remove(f);
            }
        }


    }
    

    /**
     * need to know how many litter a female did a litter
     */
    public void reproduction(Generator rabbit){
        int size = whichMorePopulation();
        Rabbit femaleAlone;

        for (int i = 0 ; i < size ; i++){
     
            femaleAlone = this.females.get(i);

            if(femaleAlone.getNbOfLitter() < 3){


                femaleAlone.increaseNbOfLitter(); 
                Rabbit kid = new Rabbit();


                if(rabbit.getRandom() % 2 == 0){
                    this.females.add(kid);
                }
                else {
                    this.males.add(kid);
                }



            }

            if(femaleAlone.getNbOfLitter()<=7 && femaleAlone.getNbOfLitter() >= 5){
                if(rabbit.getRandom() < 70){
                    femaleAlone.increaseNbOfLitter(); 
                    Rabbit kid = new Rabbit();
    
    
                    if(rabbit.getRandom() % 2 == 0){
                        this.females.add(kid);
                    }
                    else {
                        this.males.add(kid);
                    }
    
                }
            }

        }
    }










    public static void main(String[] args) {
        
    }
}
