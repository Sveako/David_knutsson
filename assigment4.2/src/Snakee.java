/** spercalss*/

public class Snakee extends Animall {

    
	/**initials*/
    private boolean isPoisonous;

    /**constructor*/
    public Snakee( String friendlyName, String latinName, boolean isPoisonous){

        super(latinName);

        this.isPoisonous=isPoisonous;
        setFriendlyName(friendlyName);
    }
    /**method with isstatment*/
    @Override

    public String getInfo() {
    	
                String info = "";
                if(isPoisonous) {
                    info = "The snake name " + getFriendlyName() + ", latin: " + getLatinName() +
                        " and is poisonous\n";
                } else {

                    info = "The snake name " + getFriendlyName() + ", latin: " + getLatinName() +
                        "  is not poisonous \n";
                }                
                return info;
            }

            public boolean isPoisonous() {

                return isPoisonous; 
                }        

        }

