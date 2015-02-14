

public class Cat extends Mammall{

    
	/**initial*/
    private int numberOfLives;

    /**constructor*/
    public Cat( String latinName, int numberOfLives, int gestationTime){

        super( latinName, gestationTime);

        this.numberOfLives = numberOfLives;

        }
    /**method numberoflives */
    public int getNumberOfLives(){

        return numberOfLives;

    }

    
    /** method number of lives */
    public void setNumberOfLives(int numberOflives){

        this.numberOfLives = numberOfLives;

    }

    @Override
    /**mothod for info with ifstatment */
    public String getInfo() {

        

        String info ="a cat that name is  " + getFriendlyName() + " , latin " + getLatinName() +

                "and nurses for " + getGestationTime() + "month " +

                "and have " + getNumberOfLives() + "lives\n";

        return info;

    }

}

