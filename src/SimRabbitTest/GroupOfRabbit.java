package SimRabbitTest;

import java.util.ArrayList;
import java.util.Stack;

public class GroupOfRabbit {
    
    ArrayList<Rabbit> males;
    ArrayList<Rabbit> females;
    Generator generator;
    int numbersDead;


    GroupOfRabbit(){
        this.males = new ArrayList<Rabbit>();
        this.females = new ArrayList<Rabbit>();
        this.generator = new Generator();
        this.numbersDead =0;

        for(int i = 0 ; i < 10 ; i++){
            this.females.add(new Rabbit());
            this.males.add(new Rabbit());
        }

    }

    







    /**
     * Use to gat numbers of rabbits alive
     * @return the number (int) of rabbit alive
     */
    public int getNumberAlive(){
        removeDead();
        return(this.females.size() + this.males.size());
    }





















    /**
     * 
     * @return Return the size of the less sized list of rabbit (males / females)
     */
    public int whichMorePopulation(){

        return( this.males.size() < this.females.size()? this.males.size():this.females.size());
        
    }

    /**
     * @description removeDead remove all deads Rabbits from lists
     */
    public void removeDead(){

        this.numbersDead += this.males.removeIf(r -> r.getAge() == -1)? 1 : 0;
        this.numbersDead += this.females.removeIf(r -> r.getAge() == -1)? 1 : 0;

    }

    /**
     * using a generator, create a baby rabbit and check if it s a female/male and add it in the better list
     */
    public void createBaby(){
        //creation of a baby
        Rabbit kid = new Rabbit();


        if(kid.isFemale(generator)){
            this.females.add(kid);
        }
        else {
            this.males.add(kid);
        }
    }
    

    /**
     * For each couple of rabbits, we check if they have babies, and if it is ok, we generate 3 to 6 babies and 
     * keep in memory the number of litters the female did
     * 
     */
    public void reproduction(){
        int size = whichMorePopulation();
        Rabbit femaleAlone;

        for (int i = 0 ; i < size ; i++){
            femaleAlone = this.females.get(i);

            if(femaleAlone.getAge() <= 10*12){
                if(femaleAlone.getNbOfLitter() < 3){
    
    
                    femaleAlone.increaseNbOfLitter(); 
                    Rabbit kid = new Rabbit();
    
    
                    if(generator.getRandom() % 2 == 0){
                        this.females.add(kid);
                    }
                    else {
                        this.males.add(kid);
                    }
    
    
    
                }
    
                //if 4< numbers of litter < 8 then more chance to have babies
                if(femaleAlone.getNbOfLitter()<=7 && femaleAlone.getNbOfLitter() >= 5){
                    if(generator.getRandom() < 50){
    
                        femaleAlone.increaseNbOfLitter(); 
                        int nbOfKids = (generator.getRandom()%4+3);
                        for(int j=0; j < nbOfKids ; j++){
                            
                            createBaby();
                        }
    
    
        
                    }
    
                }
    
                if(femaleAlone.getNbOfLitter() ==8 || femaleAlone.getNbOfLitter() == 9){
    
                    if(generator.getRandom() < 15){
                        femaleAlone.increaseNbOfLitter();
                        int nbOfKids =(generator.getRandom()%4 + 3);
    
                        for(int k =0 ; k < nbOfKids ; k++){
    
                            createBaby();
                        }
                    }
    
    
                }
            }


        }
    }

    /**
     * Check if all rabbits are dying or not and set their parameters to be trated
     */
    public void checkIsDying(Time time){




        for (int i = 0; i < this.males.size(); i++) {
            Rabbit r = this.males.get(i);
            r = this.generator.isDying(r);
            this.males.set(i, r);         
        }
    
        for (int i = 0; i < this.females.size(); i++) {
            Rabbit r = this.females.get(i);
            r = this.generator.isDying(r);
            this.females.set(i, r); 
        }

    }
        



    

    public void beOlders(){
        for(Rabbit r : this.females){
            r.beOlder();
            r.verrifyMaturity(this.generator);
        }
        for(Rabbit r : this.males){
            r.beOlder();
            r.verrifyMaturity(this.generator);

        }
    }

    
    @Override
    public String toString() {
        String s = String.format("Number alive : %d \n Numbers dead since the starts : %d",this.getNumberAlive(),this.numbersDead);
        
        return s;
    }





}
