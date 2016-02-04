package project.op.actions;
import project.datastore.DataStore;

/**
 * This class is used to set the value of w.
 * @author Priyanka
 */

public abstract class SetW {
	private DataStore dataStore;
	
	//This is an abstract method for setting the value of w.
	public abstract void setW(int k);

	//getter method for DataStore
	public DataStore getDataStore() {
		return dataStore;
	}

	//setter method for DataStore
	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}
}
