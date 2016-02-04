package project.op.actions;

/**
 * This class is subclass of SetInitialValues and is used 
 * to set initial values for number of gallons and total.
 * @author Priyanka
 */

public class SetInitialValues2 extends SetInitialValues {

	//This is a method to initiate the number of gallons and total to 0.
	@Override
	public void setInitialValues(){
		getDataStore().setG(0);					//initialize number of gallons to 0
		getDataStore().setTotalf(0);			//initialize number of total to 0
	}
}
