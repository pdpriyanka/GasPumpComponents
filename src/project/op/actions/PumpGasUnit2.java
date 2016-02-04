package project.op.actions;

/**
 * This class is subclass of PumpGasUnit and is used to pump one gallon gas
 * (increment number of gallon and calculate total).
 * @author Priyanka
 */

public class PumpGasUnit2 extends PumpGasUnit {

	//This is a method for pumping one gallon gas.
	@Override
	public void pumpGasUnit(){
		int g = getDataStore().getG();
		g = g+1;							//increment number of gallon
		getDataStore().setG(g);    
		float total = getDataStore().getPrice1()*g;
		getDataStore().setTotalf(total);   //calculate total
	}
}
