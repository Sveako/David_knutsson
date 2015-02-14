/**abstract class*/
public abstract class Animall {
	
	/**initailas */
	private String latinName;

    private String friendlyName = "noname";

    /**construktor*/
    public Animall( String latinName){

        this.latinName =latinName;

    }
    /**methods*/
        public abstract String getInfo();

        

        public String getFriendlyName(){

            return friendlyName;

        }

        

        public void setFriendlyName(String friendlyName){

            

            this.friendlyName = friendlyName;

    }

        

        public String getLatinName(){

            return latinName;

        }

        

        public void setLatinName(String friendlyName){

            this.latinName = latinName;

        }

}




