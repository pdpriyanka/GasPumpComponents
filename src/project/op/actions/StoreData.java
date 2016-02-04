package project.op.actions;
import project.datastore.DataStore;

/**
 * This class is used to store data (price(s) of gas(s) per gallon/liter).
 * @author Priyanka
 */

public abstract class StoreData {
	private DataStore dataStore;	
		
	//abstract method for storing the data (price(s) of gas(s) per gallon/liter)
	public abstract void storeData();

	//getter method DataStore
	public DataStore getDataStore() {
		return dataStore;
	}

	//setter method DataStore
	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}
}
