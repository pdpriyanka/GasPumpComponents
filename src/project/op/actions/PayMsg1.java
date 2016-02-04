package project.op.actions;

/**
 * This class is subclass of PayMsg and is used to display pay message.
 * @author Priyanka
 */
public class PayMsg1 extends PayMsg {
	
	//This is a method for displaying pay message.
	@Override
	public void payMsg(){		
		System.out.println("Select Payment:");
		System.out.println("Cash");
		System.out.println("Credit");
	}
}
