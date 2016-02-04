package project.op.actions;

/**
 * This class is subclass of StopMsg and is used to display the stop message.
 * @author Priyanka
 */

public class StopMsg1 extends StopMsg {

	//This method is used for displaying the stop message.
	@Override
	public void stopMsg(){
		System.out.println("Pump is stopped.");
	}
}
