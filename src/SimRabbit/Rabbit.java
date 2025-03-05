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

    // Hasher
    @Override
    public int hashCode()
    {
        final int prime = 31 ;
        int result = 1 ;
        result = prime * result + age ;

        // result = prime * result + ((sex == null) ? 0 : this.sex.hashCode()) ;

        result = prime * result + InstantOfBirth ;
        result = prime * result + ((coordonatesOfBirth == null) ? 0 : this.coordonatesOfBirth.hashCode()) ;

        return result ;
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

    public void update()
    {
        this.age ++ ;

    }
}