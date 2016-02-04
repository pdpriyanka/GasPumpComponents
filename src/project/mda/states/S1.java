package project.mda.states;

/**
 * This class is subclass of State class and represents S1 state.
 * @author Priyanka
 */

public class S1 extends State{
	
	public S1(){
		setId(2);
	}
	
	//This method is used to pay for gas by cash.
	public void PayCash(){
		getOp().storeCash();                             // store the value of cash
		getOp().setW(0);    // setting the value of w for cash
		getOp().displayMenu();                           //display menu  
	}
	
	@Override
	public void Activate() {}
	public void PayCredit() { System.out.println("Wating for approval.");}   // test message
	public void Start() {}
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
