public class Home{
	FriendInterface visitor;
	public Home(FriendInterface visitor){
		this.visitor = visitor;
		System.out.println("Hello " + visitor.getName() + ", it's good to see you");
	}
	
	public void visitorAct(){
		visitor.act();
	}
}