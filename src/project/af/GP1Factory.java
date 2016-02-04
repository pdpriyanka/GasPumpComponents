package project.af;

import project.datastore.DataStore;
import project.datastore.DataStoreGP1;
import project.op.actions.*;

/**
 * This class is used to create the data store and actions objects for GasPump1.
 * @author Priyanka
 */
public class GP1Factory extends AbstractFactory {
	
 
	// Create DataStoreGP1 object.
	public DataStore getDataStore(){		
		return new DataStoreGP1();   		
	}
	
	// Create StoreData1 object.
	public StoreData getStoreData(){
		return new StoreData1();
	}
	
	// Create PayMsg1 object.
	public PayMsg getPayMsg(){
		return new PayMsg1();
	}
	
	// Create StoreCash1 object.
	public StoreCash getStoreCash(){
		return new StoreCash1();
	}

	// Create DisplayMenu1 object.
	public DisplayMenu getDisplayMenu(){
		return new DisplayMenu1();
	}
	
	// Create RejectMsg1 object.
	public RejectMsg getRejectMsg(){
		return new RejectMsg1();
	}
	
	// Create SetW1 object.
	public SetW getSetW(){
		return new SetW1();
	}
	
	// Create SetPrice1 object.
	public SetPrice getSetPrice(){
		return new SetPrice1();
	}
	
	// Create ReadyMsg1 object.
	public ReadyMsg getReadyMsg(){
		return new ReadyMsg1();
	}
	
	// Create SetInitialValues1 object.
	public SetInitialValues getSetInitialValues(){
		return new SetInitialValues1();
	}
	
	// Create PumpGasUnit1 object.
	public PumpGasUnit getPumpGasUnit(){
		return new PumpGasUnit1();
	}
	
	// Create GasPumpedMsg1 object.
	public GasPumpedMsg getGasPumpedMsg(){
		return new GasPumpedMsg1();
	}
	
	// Create StopMsg1 object.
	public StopMsg getStopMsg(){
		return new StopMsg1();
	}
	
	// Create PrintReceipt1 object.
	public PrintReceipt getPrintReceipt(){
		return new PrintReceipt1();
	}
	
	// Create CancelMsg1 object.
	public CancelMsg getCancelMsg(){
		return new CancelMsg1();
	}
}