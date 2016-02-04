package project.mda;
import project.mda.states.State;

/**
 * This class represents the MDA-EFSM model which is platform independent.
 * @author Priyanka
 */
public class MDAEFSM{
	
	private State states[];        //Store the objects of different states classes   
	private State state;           //Pointer to current state
		
	//This is method for activate gas pump.
	public void Activate(){
		state.Activate();
		switch(state.getId()){
			case 0: state = states[1];  //change state to S0
					break;					
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7: // no change of state
					break;
				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is method for start the transaction.
	public void Start(){
		state.Start();
		switch(state.getId()){
			case 0: 
					break;			
			case 1: state = states[2]; //change state to S1
					break;			
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7: // no change of state
					break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method for pay for gas by credit card.
	public void PayCredit(){
		state.PayCredit();
		switch(state.getId()){
			case 0:			
			case 1: 
					break;			
			case 2: state = states[3]; //change state to S2
					break;			
			case 3:
			case 4:
			case 5:
			case 6:
			case 7: // no change of state
				break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method for pay for gas by cash.
	public void PayCash(){
		state.PayCash();
		switch(state.getId()){
			case 0:			
			case 1: 
				break;			
			case 2: state = states[4]; //change state to S3
				break;			
			case 3:
			case 4:
			case 5:
			case 6:
			case 7: // no change of state
				break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method for rejecting the credit card.
	public void Reject(){
		state.Reject();
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2: 
					break;			
			case 3: state = states[1]; //change state to S0
					break;			
			case 4:
			case 5:
			case 6:
			case 7: // no change of state
					break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method for cancel the transaction.
	public void Cancel(){
		state.Cancel();
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2:
			case 3:
					break;			
			case 4: state = states[1];  //change state to S0
					break;					
			case 5:
			case 6:
			case 7: // no change of state
					break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method for approving credit card.
	public void Approved(){
		state.Approved();
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2:
					break;			
			case 3: state = states[4]; //change state to S3
					break;
			case 4:
			case 5:
			case 6:
			case 7: // no change of state
					break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method to start pumping gas.
	public void StartPump(){
		state.StartPump();
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2:
			case 3:
			case 4:
					break;			
			case 5: state = states[6]; //change state to S5
					break;					
			case 6:
			case 7: // no change of state
					break;				
			default:
				System.out.println("Invalid state id.");
		}
	}
	
	//This is the method for disposing one gallon/liter(unit) of gas
	public void Pump(){				
		state.Pump();		
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2:
			case 3:
			case 4:
			case 5:
					break;			
			case 6: state = states[6];   //remains in state  S5
					break;
			case 7: // no change of state
					break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method to stop pumping gas.
	public void StopPump(){
		state.StopPump();
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2:
			case 3:
			case 4:
			case 5:
					break;				
			case 6: state = states[7];   //change state to S6
					break;
			case 7: // no change of state
					break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method for selecting gas.
	public void SelectGas(int g){
		state.SelectGas(g);
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2:
			case 3:			
					break;			
			case 4: state = states[5];    //change state to S4
					break;
			case 5:
			case 6:			
			case 7: // no change of state
					break;				
			default:
				System.out.println("Invalid state id.");				
		}
	}
	
	//This is the method for requesting receipt.
	public void Receipt(){
		state.Receipt();
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: // no change of state				
					break;			
			case 7: state = states[1];   //change state to S0
					break;							
			default:
				System.out.println("Invalid state id.");			
		}
	}
	
	//This is the method for requesting no receipt.
	public void NoReceipt(){
		state.NoReceipt();
		switch(state.getId()){
			case 0:			
			case 1: 						
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: // no change of state				
					break;			
			case 7: state = states[1];  //change state to S0
					break;														
			default:
				System.out.println("Invalid state id.");
		}
	}

	
	//getter setter methods
	public State[] getStates() {
		return states;
	}

	public void setStates(State[] states) {
		this.states = states;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}		
}
