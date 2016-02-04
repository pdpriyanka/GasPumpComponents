package project.af;

import project.datastore.DataStore;
import project.datastore.DataStoreGP2;
import project.op.actions.*;

/**
 *  This class is used to create the data store and actions objects for GasPump2.
 * @author Priyanka
 */
public class GP2Factory extends AbstractFactory {
		
	// Create DataStoreGP2 object.
	public DataStore getDataStore(){		
		return new DataStoreGP2();
	}
	
	// Create StoreData2 object.
	public StoreData getStoreData(){
		return new StoreData2();
	}
	
	// Create PayMsg2 object.
	public PayMsg getPayMsg(){
		return new PayMsg2();
	}

	// Create DisplayMenu2 object.
	public DisplayMenu getDisplayMenu(){
		return new DisplayMenu2();
	}
	
	// Create RejectMsg1 object.
	public RejectMsg getRejectMsg(){
		return new RejectMsg1();
	}
	
	// Create SetW1 object.
	public SetW getSetW(){
		return new SetW1();
	}
	
	// Create SetPrice2 object.
	public SetPrice getSetPrice(){
		return new SetPrice2();
	}
	
	// Create ReadyMsg1 object.
	public ReadyMsg getReadyMsg(){
		return new ReadyMsg1();
	}
	
	// Create SetInitialValues2 object.
	public SetInitialValues getSetInitialValues(){
		return new SetInitialValues2();
	}
	
	// Create PumpGasUnit2 object.
	public PumpGasUnit getPumpGasUnit(){
		return new PumpGasUnit2();
	}
	
	// Create GasPumpedMsg1 object.
	public GasPumpedMsg getGasPumpedMsg(){
		return new GasPumpedMsg1();
	}
	
	// Create StopMsg1 object.
	public StopMsg getStopMsg(){
		return new StopMsg1();
	}
	
	// Create PrintReceipt2 object.
	public PrintReceipt getPrintReceipt(){
		return new PrintReceipt2();
	}
	
	// Create CancelMsg1 object.
	public CancelMsg getCancelMsg(){
		return new CancelMsg1();
	}
		
	@Override
	public StoreCash getStoreCash() {return null;}
}
