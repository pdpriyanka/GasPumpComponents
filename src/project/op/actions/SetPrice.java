package project.op.actions;
import project.datastore.DataStore;

/**
 * This class is used to set the price of selected gas.
 * @author Priyanka
 */

public abstract class SetPrice {	
	private DataStore dataStore;
	
	//This is an abstract method for setting the price of selected gas.
	public abstract void setPrice(int g);

	//getter method for DataStore
	public DataStore getDataStore() {
		return dataStore;
	}

	//setter method for DataStore
	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}	
}
