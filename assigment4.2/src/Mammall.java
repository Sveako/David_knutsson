
/**abstract class*/
public abstract class Mammall extends Animall {

    
	/**initials*/
    private int gestationTime;

    
    /**constructor*/
    public Mammall( String latinName, int gestationTime){
        super(latinName);
        this.gestationTime = gestationTime;

    }

    /**methods*/
    public int getGestationTime(){
        return gestationTime;
    }
}
