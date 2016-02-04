package project.op.actions;
import project.datastore.DataStore;

/**
 * This class is used to print receipt.
 * @author Priyanka
 */

public abstract class PrintReceipt {
	private DataStore dataStore;
	
	//This is an abstract method for printing receipt.
	public abstract void printReceipt();

	//getter method for DataStore 
	public DataStore getDataStore() {
		return dataStore;
	}

	//setter method for DataStore
	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}	
}
