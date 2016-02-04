package project.af;

import project.datastore.DataStore;
import project.op.actions.*;

/**
 *  This class is used to create DataStore and actions objects.
 * @author Priyanka
 */
public abstract class AbstractFactory {
	
	// Abstract methods
	public abstract DataStore getDataStore();                                           
	public abstract StoreData getStoreData();
	public abstract PayMsg getPayMsg();
	public abstract StoreCash getStoreCash();
	public abstract DisplayMenu getDisplayMenu();	
	public abstract RejectMsg getRejectMsg();
	public abstract SetW getSetW();
	public abstract SetPrice getSetPrice();
	public abstract ReadyMsg getReadyMsg();
	public abstract SetInitialValues getSetInitialValues();
	public abstract PumpGasUnit getPumpGasUnit();
	public abstract GasPumpedMsg getGasPumpedMsg();
	public abstract StopMsg getStopMsg();
	public abstract PrintReceipt getPrintReceipt();	
	public abstract CancelMsg getCancelMsg();
}
