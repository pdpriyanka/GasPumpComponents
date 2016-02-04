package project.mda.states;

/**
 * This class is subclass of State class and represents S5 state.
 * @author Priyanka
 */

public class S5 extends State {
	
	public S5(){
		setId(6);
	}	
	
	//This is the method for pumping one liter/gallon of gas.
	public void Pump(){		
		getOp().pumpGasUnit();     // pump one unit of gas
		getOp().gasPumpedMsg();    // display pump message
	}
	
	//This is the method to stop pumping gas
	public void StopPump(){
		getOp().stopMsg();          //display stop pump message
	}
	
	@Override
	public void Activate() {}
	public void PayCredit() {}
	public void Start() {}
	public void Reject() {}
	public void Cancel() {}
	public void Approved() {}
	public void StartPump() {}
	public void PayCash() {}	
	public void SelectGas(int g) {}
	public void Receipt() {}
	public void NoReceipt() {}
}
