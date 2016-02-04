package project.op.actions;

/**
 * This class is subclass of PumpGasUnit and is used to pump one liter gas 
 * (increment number of liters and calculate total).
 * @author Priyanka
 */

public class PumpGasUnit3 extends PumpGasUnit {
	
	@Override
	public void pumpGasUnit(){
		int l = getDataStore().getL();
		l = l+1;							//increment number of liter
		getDataStore().setL(l);
		float total = getDataStore().getPrice1()*l;
		getDataStore().setTotalf(total);  //calculate total
	}
}
