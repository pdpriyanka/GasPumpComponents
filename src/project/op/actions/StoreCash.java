package project.op.actions;
import project.datastore.DataStore;

/**
 * This class is used to store cash.
 * @author Priyanka
 */

public abstract class StoreCash {
	private DataStore dataStore;
	
	//This is an abstract method for storing cash.
	public abstract void storeCash();

	//getter method for DataStore
	public DataStore getDataStore() {
		return dataStore;
	}

	//setter method for DataStore
	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}
}
