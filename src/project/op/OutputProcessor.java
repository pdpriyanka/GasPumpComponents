package project.op;

import project.af.AbstractFactory;
import project.datastore.DataStore;
import project.op.actions.*;

/**
 * This class represents Output processor and used to execute actions.
 * @author Priyanka
 */

public class OutputProcessor {
	
	private DataStore dataStore;				// DataStore 
	private AbstractFactory abstractFactory;    // AbstractFactory 
	
	// Actions pointers 
	private StoreData storeData;
	private PayMsg payMsg;
	private StoreCash storeCash;
	private DisplayMenu displayMenu;
	private RejectMsg rejectMsg;	
	private SetW setW;
	private SetPrice setPrice;
	private ReadyMsg readyMsg;
	private SetInitialValues setInitialValues;
	private PumpGasUnit pumpGasUnit;
	private GasPumpedMsg gasPumpedMsg;
	private StopMsg stopMsg;
	private PrintReceipt printReceipt;
	private CancelMsg cancelMsg;
	
	
	//Stores price(s) of the gas from the temporary data store.
	public void storeData(){
		storeData = abstractFactory.getStoreData();   // create StoreData object
		storeData.setDataStore(dataStore);            
		storeData.storeData();
	} 
	
	//displays a type of payment method
	public void payMsg(){
		payMsg = abstractFactory.getPayMsg();
		payMsg.payMsg();
	}
	
	//stores cash from temporary data store
	public void storeCash(){
		storeCash =abstractFactory.getStoreCash();
		storeCash.setDataStore(dataStore);
		storeCash.storeCash();
	}
	
	//display a menu with list of selections
	public void displayMenu(){
		displayMenu = abstractFactory.getDisplayMenu();
		displayMenu.displayMenu();
	} 
	
	//displays credit card not approved message
	public void rejectMsg(){
		rejectMsg = abstractFactory.getRejectMsg();
		rejectMsg.rejectMsg();
	}
	
	//set value for credit/cash flag
	public void setW(int k){
		setW = abstractFactory.getSetW();
		setW.setDataStore(dataStore);
		setW.setW(k);
	}
	
	//set the price for the gas identified by g identifier.
	public void setPrice(int g){
		setPrice = abstractFactory.getSetPrice();
		setPrice.setDataStore(dataStore);
		setPrice.setPrice(g);
	}
	
	//displays the ready for pumping message
	public void readyMsg(){
		readyMsg = abstractFactory.getReadyMsg();
		readyMsg.readyMsg();
	}
	
	//set G or L to 0 and total to 0
	public void setInitialValues(){
		setInitialValues = abstractFactory.getSetInitialValues();
		setInitialValues.setDataStore(dataStore);
		setInitialValues.setInitialValues();
	}
	
	//dispose unit of gas and count # of units disposed
	public void pumpGasUnit(){
		pumpGasUnit = abstractFactory.getPumpGasUnit();
		pumpGasUnit.setDataStore(dataStore);
		pumpGasUnit.pumpGasUnit();
	}
	
	//displays the amount of disposed gas
	public void gasPumpedMsg(){
		gasPumpedMsg = abstractFactory.getGasPumpedMsg();
		gasPumpedMsg.setDataStore(dataStore);
		gasPumpedMsg.gasPumpedMsg();
	} 
	
	//stop pump message and receipt? msg
	public void stopMsg(){
		stopMsg = abstractFactory.getStopMsg();
		stopMsg.stopMsg();
	}
	
	//print a receipt
	public void printReceipt(){
		printReceipt = abstractFactory.getPrintReceipt();
		printReceipt.setDataStore(dataStore);
		printReceipt.printReceipt();
	}
	
	//display a cancellation message
	public void cancelMsg(){
		cancelMsg = abstractFactory.getCancelMsg();
		cancelMsg.cancelMsg();		
	}

	//getter setter methods
	public AbstractFactory getAbstractFactory() {
		return abstractFactory;
	}

	public void setAbstractFactory(AbstractFactory abstractFactory) {
		this.abstractFactory = abstractFactory;
	}

	public DataStore getDataStore() {
		return dataStore;
	}

	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}		
}
