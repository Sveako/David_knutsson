
/**superclass*/
public class Dog extends Mammall {
	
	/**boolean initaial*/
    private boolean isStupid;

    /**constructor*/
    public Dog( String latinName, int gestationTime, boolean isStupid) {

        super(latinName, gestationTime);

        this.isStupid = isStupid;

        

    }    /**secound constructor */

    public Dog( String friendlyName, String latinName, int gestationTime, boolean isStupid){

        super(latinName, gestationTime);

        this.isStupid= isStupid;

        setFriendlyName(friendlyName);

    }
    /**method for is stupid */
    public boolean isStupid(){

        return isStupid;

    }

    @Override
    /**method for info with ifstatment*/
    public String getInfo() {

        String info = "";

        if(isStupid){

            info = "The dog named: "+ getFriendlyName() + ", latin: " + getLatinName() +

                    "nurse for " + super.getGestationTime() +" month and is stupid\n";

        }else { info = "the dog named: " + getFriendlyName() + "latin: " + getLatinName() +

                "nurse for " + super.getGestationTime() + "month and is not stupid\n";

        }
        
        return info;
             

        }

    }

