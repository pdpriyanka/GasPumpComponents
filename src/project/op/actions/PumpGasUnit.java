package project.op.actions;
import project.datastore.DataStore;

/**
 * This class is used to pump gas unit (increment number of units and calculate total).
 * @author Priyanka
 */

public abstract class PumpGasUnit {
	private DataStore dataStore;
	
	//This is an abstract method for pumping one unit gas.
	public abstract void pumpGasUnit();

	//getter method for DataStore
	public DataStore getDataStore() {
		return dataStore;
	}

	//setter method for DataStore
	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}
}
