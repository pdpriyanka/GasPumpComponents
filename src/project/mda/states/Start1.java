package project.mda.states;

/**
 * This class is subclass of State class and represents Start state.
 * @author Priyanka
 */

public class Start1 extends State{
	
	public Start1(){
		setId(0);
	}
	
	//This is the method to activate the gas pump
	public void Activate(){
		getOp().storeData();            // storing the price(s) of gas(s) per gallon/liter
		System.out.println("Gas pump is activated.");
	}
	
	@Override
	public void PayCash() {}
	public void PayCredit() {}
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

