package SimRabbit;

import java.util.Random;

public class Rabbit 
{
    private int age ;
    private final Sex sex ;

    public Rabbit()
    {
        this.age = 0 ;
        
        Random rn = new Random();

        this.sex =  rn.nextInt(2) == 0 ? Sex.MALE : Sex.FEMALE ;
    }

    public 
}