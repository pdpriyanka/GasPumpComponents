package project.mda.states;

/**
 * This class is subclass of State class and represents S4 state.
 * @author Priyanka
 */
public class S4 extends State{
	
	public S4(){
		setId(5);
	}
			
	//This is method to start pumping gas
	public void StartPump(){
		getOp().setInitialValues();
		getOp().readyMsg();
	}
	
	@Override
	public void Activate() {}
	public void PayCredit() {}
	public void Start() {}
	public void Reject() {}
	public void Cancel() {}
	public void Approved() {}
	public void PayCash() {}
	public void Pump() {}
	public void StopPump() {}
	public void SelectGas(int g) {}
	public void Receipt() {}
	public void NoReceipt() {}
}
