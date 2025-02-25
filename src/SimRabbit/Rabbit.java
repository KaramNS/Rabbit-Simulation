package SimRabbit;

import java.util.Random;

public class Rabbit 
{   
    private int age ; // Maybe it's better to make it a calculated field
    private final Sex sex ;
    private final int InstantOfBirth;

    private final Coordonates coordonatesOfBirth;

    public Rabbit(Coordonates inCoordonatesOfBirth, int inInstantOfBirth)
    {
        this.age = 0 ;
        this.InstantOfBirth = inInstantOfBirth ;
        this.coordonatesOfBirth = inCoordonatesOfBirth ;

        Random rn = new Random();

        this.sex =  rn.nextInt(2) == 0 ? Sex.MALE : Sex.FEMALE ;
    }
    
    // getters 

    public int age()
    {
        return this.age;
    }

    public Sex sex()
    {
        return this.sex ;
    }

    public int instantOfBirth()
    {
        return this.InstantOfBirth ;
    }

    public Coordonates coordonatesOfBirth()
    {
        return this.coordonatesOfBirth;
    }
    
}