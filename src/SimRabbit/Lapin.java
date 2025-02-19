package SimRabbit;

import java.util.Random;

class Lapin {
    private int age ;
    private final Sex sex ;

    public Lapin()
    {
        this.age = 0 ;
        
        Random rn = new Random();

        this.sex =  rn.nextInt(2) == 0 ? Sex.MALE : Sex.FEMALE ;
    }
}