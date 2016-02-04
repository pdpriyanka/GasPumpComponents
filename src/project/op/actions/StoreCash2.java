package project.op.actions;

/**
 *This class is subclass of StoreCash and is used to store cash.
 * @author Priyanka
 */

public class StoreCash2 extends StoreCash {

	//This method is used to store cash.
	@Override
	public void storeCash(){		
		float c = getDataStore().getTemp_c1();
		getDataStore().setCash1(c);  //store the cash
	}	
}
