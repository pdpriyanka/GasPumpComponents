package project.mda.states;

/**
 * This class is subclass of State class and represents S3 state.
 * @author Priyanka
 */
public class S3 extends State{
	
	public S3(){
		setId(4);
	}
		
	//This method is used to select gas.
	public void SelectGas(int g){
		getOp().setPrice(g);           //store the price of selected gas.
	}
	
	//This method is used for canceling the transaction.
	public void Cancel(){
	    getOp().cancelMsg();           //display cancel message.
	}
	
	@Override
	public void Activate() {}
	public void PayCredit() {}
	public void Start() {}
	public void Reject() {}
	public void PayCash() {}
	public void Approved() {}
	public void StartPump() {}
	public void Pump() {}
	public void StopPump() {}	
	public void Receipt() {}
	public void NoReceipt() {}
}
