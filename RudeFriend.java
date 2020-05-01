public class RudeFriend implements FriendInterface{
	private String name;
	public RudeFriend(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void act(){
		System.out.println(getName() + " is rifling through your pantry without asking.");
	}
}
