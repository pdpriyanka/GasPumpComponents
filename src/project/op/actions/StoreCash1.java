package project.op.actions;

/**
 * This class is subclass of StoreCash and is used to store cash.
 * @author Priyanka
 */

public class StoreCash1 extends StoreCash {
	
	//This method is used to store cash.
	@Override
	public void storeCash(){
		int c = getDataStore().getTemp_c();
		getDataStore().setCash(c);  // store the cash
		
	}	
}
