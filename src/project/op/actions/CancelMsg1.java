package project.op.actions;

/**
 * This class is subclass of CancelMsg and used to display cancel message. 
 * @author Priyanka
 */

public class CancelMsg1 extends CancelMsg{

	//This method is used for displaying cancel message.
	@Override
	public void cancelMsg() {
		System.out.println("Transaction is cancelled.");		
	}
}
