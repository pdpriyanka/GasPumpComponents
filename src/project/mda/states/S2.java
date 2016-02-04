package project.mda.states;

public class S2 extends State {
	
	public S2(){
		setId(3);
	}
	
	//This method is used to reject the credit card transaction.
	public void Reject(){
		getOp().rejectMsg();
	}
	
	//This method is used to approve credit card.
	public void Approved(){
		getOp().setW(1);     //setting the value of w for credit card
		System.out.println("The Credit Card is approved.");
		getOp().displayMenu();                              //display menu
	}
	
	@Override
	public void Activate() {}
	public void PayCredit() {}
	public void Start() {}
	public void PayCash() {}
	public void Cancel() {}	
	public void StartPump() {}
	public void Pump() {}
	public void StopPump() {}
	public void SelectGas(int g) {}
	public void Receipt() {}
	public void NoReceipt() {}
}
