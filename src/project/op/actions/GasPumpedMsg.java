package project.op.actions;
import project.datastore.DataStore;

/**
 * This class is used to display pumped message.
 * @author Priyanka
 */

public abstract class GasPumpedMsg {

	private DataStore dataStore;
	
	//This is an abstract method for displaying pumped gas message.
	public abstract void gasPumpedMsg();

	//getter method for DataStore
	public DataStore getDataStore() {
		return dataStore;
	}

	//setter method for DataStore
	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}
}
