package project.op.actions;

/**
 * This class is subclass of StoreData and 
 * is used to store the data(price of gas per gallon/liter)
 * @author Priyanka
 */

public class StoreData1 extends StoreData {
		
	//This method is used for storing the data (price of gas per gallon/liter).
	@Override
	public void storeData(){	
		int a = getDataStore().getTemp_a();
		getDataStore().setPrice(a);  // storing the price of gas per gallon/liter
	}
}
