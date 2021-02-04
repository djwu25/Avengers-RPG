package avengersgameproject;

public class Move
{
    private String name;
    private int modifier;
    
    public Move( String name, int modifier )
    {
        this.name = name;
        this.modifier = modifier;
    }
    
    public String getMoveName()
    {
        return name;
    }
    
    public int damage( Avenger avenger )
    {
        return avenger.getStrength() * modifier;
    }
}