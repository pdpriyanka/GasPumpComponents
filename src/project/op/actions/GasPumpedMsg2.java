package project.op.actions;

/**
 * This class is subclass of GasPumpedMsg and is used to display pumped message.
 * @author Priyanka
 */

public class GasPumpedMsg2 extends GasPumpedMsg{
	
	@Override	
	public void gasPumpedMsg(){						
		System.out.printf("\n %d Liter pumped",getDataStore().getL());		
	} 
}
