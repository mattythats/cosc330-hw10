import java.util.Scanner;

public class VisitorDriver{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    Home h;
    FriendInterface friend;
    System.out.println("Enter the name of a nice friend.");
    String niceName = input.nextLine();
    System.out.println();
    friend = new NiceFriend(niceName);
    h = new Home(friend);
    h.visitorAct();
    System.out.println("\nEnter the name of a rude friend.");
    String rudeName = input.nextLine();
    System.out.println();
    friend = new RudeFriend(rudeName);
    h = new Home(friend);
    h.visitorAct();
  }
}