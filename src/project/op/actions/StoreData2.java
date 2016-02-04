package project.op.actions;

/**
 * This class is subclass of StoreData and 
 * is used to store the data(price(s) of gas(s) per gallon/liter)
 * @author Priyanka
 */

public class StoreData2  extends StoreData {
	
	//This method is used for storing the data (price(s) of gas(s) per gallon/liter).
	@Override
	public void storeData(){	
		float a1 = getDataStore().getTemp_a1();
		float b1 = getDataStore().getTemp_b();
		getDataStore().setRprice(a1);  //store the price of regular gas per gallon
		getDataStore().setSprice(b1);   //store the price of super gas per gallon
	}	

}
