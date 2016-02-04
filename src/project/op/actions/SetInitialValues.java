package project.op.actions;
import project.datastore.DataStore;

/**
 * This is an abstract class used to initiate number of unit and total to 0.
 * @author Priyanka
 */

public abstract class SetInitialValues {
	private DataStore dataStore;
	
	//abstract method to initiate number of unit and total to 0.
	public abstract void setInitialValues();

	//getter method for DataStore
	public DataStore getDataStore() {
		return dataStore;
	}

	//setter method for DataStore
	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}
}
