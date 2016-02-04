package project.op.actions;

/**
 * This class is  subclass of RejectMsg and is used to display reject message.
 * @author Priyanka
 */

public class RejectMsg1 extends RejectMsg{
	
	//This method is used for display reject message.
	@Override
	public void rejectMsg(){
		System.out.println("Credit Card is not approved.");
	}
}
