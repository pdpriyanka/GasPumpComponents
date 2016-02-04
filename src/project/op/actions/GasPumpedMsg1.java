package project.op.actions;

/**
 * This class is subclass of GasPumpedMsg and is used to display pumped message.
 * @author Priyanka
 */

public class GasPumpedMsg1 extends GasPumpedMsg{
	
	//This method is used for displaying pumped gas message.
	@Override
	public void gasPumpedMsg(){		
		System.out.printf("\n %d Gallon pumped",getDataStore().getG());
	} 
}
