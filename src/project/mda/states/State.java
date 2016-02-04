package project.mda.states;

import project.op.OutputProcessor;

/**
 * This class is state class of State Pattern. It represents the state for MDAEFSM.
 * @author Priyanka
 */

public abstract class State {

	private int id;               //stores state id
	private  OutputProcessor op;	

	//abstract MDA-EFSM events
	public abstract void Activate();
	public abstract void Start();
	public abstract void PayCredit();
	public abstract void PayCash();
	public abstract void Reject();
	public abstract void Cancel();
	public abstract void Approved();
	public abstract void StartPump();
	public abstract void Pump();
	public abstract void StopPump();
	public abstract void SelectGas(int g);
	public abstract void Receipt();
	public abstract void NoReceipt();

	//getter setter methods 
	public int getId()	{
		return id;
	}
	
	protected void setId(int id){
		this.id =id;
	}	
			
	public OutputProcessor getOp() {
		return op;
	}

	public void setOp(OutputProcessor op) {
		this.op = op;
	}
}
