package project.af;

import project.datastore.DataStore;
import project.datastore.DataStoreGP3;
import project.op.actions.*;

/**
 * This class is used to create the data store and actions objects for GasPump3.
 * @author Priyanka
 */
public class GP3Factory extends AbstractFactory {
	
	// Create DataStoreGP3 object.
	public DataStore getDataStore(){		
		return new DataStoreGP3();
	}
	
	// Create StoreData3 object.
	public StoreData getStoreData(){
		return new StoreData3();
	}
	
	// Create PayMsg3 object.
	public PayMsg getPayMsg(){
		return new PayMsg3();
	}
	
	// Create StoreCash2 object.
	public StoreCash getStoreCash(){
		return new StoreCash2();
	}
	
	// Create DisplayMenu3 object.
	public DisplayMenu getDisplayMenu(){
		return new DisplayMenu3();
	}
	
	// Create RejectMsg1 object.
	public RejectMsg getRejectMsg(){
		return new RejectMsg1();
	}

	// Create SetW1 object.
	public SetW getSetW(){
		return new SetW1();
	}

	// Create SetPrice3 object.
	public SetPrice getSetPrice(){
		return new SetPrice3();
	}
	
	// Create ReadyMsg1 object.
	public ReadyMsg getReadyMsg(){
		return new ReadyMsg1();
	}
	
	// Create SetInitialValues3 object.
	public SetInitialValues getSetInitialValues(){
		return new SetInitialValues3();
	}
	
	// Create PumpGasUnit3 object.
	public PumpGasUnit getPumpGasUnit(){
		return new PumpGasUnit3();
	}
	
	// Create GasPumpedMsg2 object.
	public GasPumpedMsg getGasPumpedMsg(){
		return new GasPumpedMsg2();
	}
	
	// Create StopMsg2 object.
	public StopMsg getStopMsg(){
		return new StopMsg2();
	}
	
	// Create PrintReceipt3 object.
	public PrintReceipt getPrintReceipt(){
		return new PrintReceipt3();
	}
	
	// Create CancelMsg1 object.
	public CancelMsg getCancelMsg(){
		return new CancelMsg1();
	}
}

