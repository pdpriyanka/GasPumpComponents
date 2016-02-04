package project.mda.states;

/**
 * This class is subclass of State class and represents S0 state.
 * @author Priyanka
 */

public class S0 extends State {
	
	public S0(){		
		setId(1);
	}
		
	//This method is used to start the transaction.
	public void Start(){
		getOp().payMsg();          //display pay message.
	}

	@Override
	public void Activate() {}
	public void PayCredit() {}
	public void PayCash() {}
	public void Reject() {}
	public void Cancel() {}
	public void Approved() {}
	public void StartPump() {}
	public void Pump() {}
	public void StopPump() {}
	public void SelectGas(int g) {}
	public void Receipt() {}
	public void NoReceipt() {}
}
