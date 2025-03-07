package SimRabbit;

import java.util.Random;

public class Rabbit 
{   
    private int age ; // Maybe it's better to make it a calculated field
    
    // Constants
    private final Sex sex ;
    private final int InstantOfBirth;
    private final Coordonates coordonatesOfBirth;
    
    private final int hashID ;

    public Rabbit(Coordonates inCoordonatesOfBirth, int inInstantOfBirth)
    {
        this.age = 0 ;
        this.InstantOfBirth = inInstantOfBirth ;
        this.coordonatesOfBirth = inCoordonatesOfBirth ;

        Random rn = new Random();

        this.sex =  rn.nextInt(2) == 0 ? Sex.MALE : Sex.FEMALE ;
        this.hashID = this.hashCode() ;
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
    
    // Getters 

    public int age()
    {
        return this.age;
    }

    public boolean isAlive()
    {
        return this.age != -1 ;
    }
    
    public Sex sex()
    {
        return this.sex ;
    }

    /**
     * @description Get the instant of birth of the rabbit
     * @return
     */
    public int instantOfBirth()
    {
        return this.InstantOfBirth ;
    }

    /**
     * @description Get the coordonates of birth of the rabbit
     * @return
     */
    public Coordonates coordonatesOfBirth()
    {
        return this.coordonatesOfBirth;
    }

    public void kill()
    {
        // Delete the object
        this.age = -1 ;
    } 
    
    public void update()
    {
        this.age ++ ;

        // if mature then look for a mate to fuck

        // if 15 years old -> die bitch

        if (this.age() / 12 >= 15) 
        {
            this.kill();
        }
    }

    public int hashID()
    {
        return this.hashID ;
    }
}
