package project.mda.states;

/**
 * This class is subclass of State class and represents S6 state.
 * @author Priyanka
 */
public class S6 extends State{

	public S6(){
		setId(7);
	}
		
	//This method is used for requesting receipt.
	public void Receipt(){
		getOp().printReceipt();             //printing receipt
	}
	
	@Override
	public void Activate() {}
	public void PayCredit() {}
	public void Start() {}
	public void Reject() {}
	public void Cancel() {}
	public void Approved() {}
	public void StartPump() {}
	public void Pump() {}
	public void StopPump() {}
	public void SelectGas(int g) {}
	public void PayCash() {}
	public void NoReceipt() {}
}
