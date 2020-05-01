public class NiceFriend implements FriendInterface{
	private String name;
	public NiceFriend(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void act(){
		System.out.println("You are sipping tea with " + getName() + ".");
	}
}
