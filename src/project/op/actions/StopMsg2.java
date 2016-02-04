package project.op.actions;

/**
 * This class is subclass of StopMsg and is used to display the stop message.
 * @author Priyanka
 */

public class StopMsg2 extends StopMsg {

	@Override
	public void stopMsg(){
		System.out.println("Pump is stopped.");
		System.out.println("Do you want receipt?");
		System.out.println("Select");
		System.out.println("Receipt");
		System.out.println("NoReceipt");
	}
}
