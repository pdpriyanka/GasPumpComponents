package project.op.actions;

/**
 * This class is subclass of PumpGasUnit and is used to pump one gallon gas
 * (increment number of gallons and calculate total).
 * @author Priyanka
 */
public class PumpGasUnit1 extends PumpGasUnit{
	
	//This is a method for pumping one gallon gas.
	@Override
	public void pumpGasUnit(){
		int g = getDataStore().getG();
		g = g+1;    						//increment number of gallon
		getDataStore().setG(g);
		int t = getDataStore().getPrice() * g;
		getDataStore().setTotal(t);		//calculate total
	}
}
