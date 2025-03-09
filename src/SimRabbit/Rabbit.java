package SimRabbit;

import java.util.Random; 

enum Sex {
    MALE,
    FEMALE;
}

public class Rabbit 
{   
    private int age ; // Maybe it's better to make it a calculated field
    
    // Constants
    private final Sex sex ;
    private final int InstantOfBirth;
    private final Coordonates coordonatesOfBirth;
    
    private final int hashID ;

    private int morbidity ;

    private final Random random ;

    private boolean mature ;

    public Rabbit(Coordonates inCoordonatesOfBirth, int inInstantOfBirth, Random random )
    {
        this.age = 0 ;
        this.mature = false ;

        this.InstantOfBirth = inInstantOfBirth ;
        this.coordonatesOfBirth = inCoordonatesOfBirth ;

        this.random = random ;

        this.sex =  random.nextInt(2) == 0 ? Sex.MALE : Sex.FEMALE ;
        this.hashID = this.hashCode() ;
    }

    // Hasher redifinition
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
    
    // --------------------------- Getters ---------------------------

    public int morbidity ()
    {
        return this.morbidity ;
    }

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
    
    public int hashID()
    {
        return this.hashID ;
    }

    // --------------------------- Behaviar Getters ---------------------------

    public boolean mature () 
    {   
        if ( this.age() > 5 && this.age() < 8)
        {
            if (random.nextInt(1) % 2 == 0 )
            {
                this.mature = true ;
            }
        } 
        else if ( this.age() == 8 )
        {
            this.mature = true ;
        }

        return this.mature ;
    }

    // --------------------------- Behaviar Methodes ---------------------------

    public void kill()
    {
        // Delete the object
        this.age = -1 ;
    } 
    
    public void update()
    {
        this.age ++ ;

        if (this.mature())
        {
            // if mature then look for a mate to 
        }

        // if 15 years old -> die bitch
        if (this.age() / 12 >= 15) 
        {
            this.kill();
        }
    }

}
