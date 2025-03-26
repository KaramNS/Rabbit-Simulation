package SimRabbitTest;

import java.util.LinkedList;

public class GroupOfRabbit {
    
    LinkedList<Rabbit> males;
    LinkedList<Rabbit> females;
    Generator generator;


    GroupOfRabbit(){
        this.males = new LinkedList<Rabbit>();
        this.females = new LinkedList<Rabbit>();
        this.generator = new Generator();

        for(int i = 0 ; i < 5 ; i++){
            this.females.add(new Rabbit());
            this.males.add(new Rabbit());
        }

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
     * using a generator, create a baby rabbit and check if it s a female/male and add it in the better list
     * @param generator a instance of a Generator object
     */
    public void createBaby(Generator generator){
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
     * @param generator an instance of the Generator object
     */
    public void reproduction(Generator generator){
        int size = whichMorePopulation();
        Rabbit femaleAlone;

        for (int i = 0 ; i < size ; i++){
     
            femaleAlone = this.females.get(i);

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
                    for(int i; i < nbOfKids ; i++){
                        
                        this.createBaby(generator);
                    }


    
                }

            }

            if(femaleAlone.getNbOfLitter() ==8 || femaleAlone.getNbOfLitter() == 9){

                if(generator.getRandom() < 15){
                    femaleAlone.increaseNbOfLitter();
                    int nbOfKids =(generator.getRandom()%4 + 3);

                    for(int i ; i < nbOfKids ; i++){

                        this.createBaby();
                    }
                }


            }

        }
    }










    public static void main(String[] args) {
        
    }
}
