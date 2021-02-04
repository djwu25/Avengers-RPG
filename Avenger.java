package avengersgameproject;

public class Avenger
{
    private int health, strength;
    private String name;
    public static Move basic, secondary, shrink, expand,
            stormbreaker;
    
    public Avenger( String name, int health, int strength)
    {
        this.name = name;
        this.health = health;
        this.strength = strength;
        basic = new Move( "basic", 1 );
        secondary = new Move( "punch", 2 );
        shrink = new Move( "shrink", 0 );
        expand = new Move( "expand", 0 );
        
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void setHealth( int newHealth )
    {
        if( newHealth <= 0 )
        {
            health = 0;
            return;
        }
        if( newHealth >= 1000 )
        {
            health = 1000;
            return;
        }
        health = newHealth;
    }
    
    public int getStrength()
    {
        return strength;
    }
    
    public void setStrength( int newStrength )
    {
        strength = newStrength;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Move getBasicMove()
    {
        return basic;
    }
    
    public Move getSecondaryMove()
    {
        return secondary;
    }
    
    public void useMove( Move move, Avenger user, Avenger taker )
    {
        taker.health = taker.getHealth() - move.damage(user);
        if( taker.health <= 0 )
        {
            taker.setHealth(0);
        }
    }
}