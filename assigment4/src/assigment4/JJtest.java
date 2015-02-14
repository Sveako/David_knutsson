package assigment4;

public class JJtest {
	public void main(String[] args){
		Human human = new Human ("David");
		System.out.println(human.getInfo());
		
		human.buyDog(new Dog("human"));
		System.out.println(human.getInfo());
	}

}
