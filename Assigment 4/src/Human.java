
public class Human {
	
 /**initalials*/
		private Dog dog;

        private String name;

        private String Info = "";

        

        
        /**construktor*/
        public Human (String name){

            this.name = name;

            }

        /**methods for Name*/
        public String getName(){

            return name;

        }
        
        /**methods for dog*/
        public void buyDog(Dog dog){

            this.dog = dog;

         

        }

        
        /**method for info with a if statment */
        public String getInfo() {

            if (dog == null ){

                String Info = getName() +(" haven´t signed a dog \n");

                return Info;

            }else {

                String Info = getName() +(" owns a dog named ")+ this.dog.getName ();

                return Info;

            }
            
        }


}
