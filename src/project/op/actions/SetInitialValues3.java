package project.op.actions;

/**
 * This class is subclass of SetInitialValues and is used 
 * to set initial values for number of liters and total.
 * @author Priyanka
 */
public class SetInitialValues3 extends SetInitialValues {
	
	//This is a method to initiate the number of liters and total to 0.
	@Override
	public void setInitialValues(){
		getDataStore().setL(0);				//initialize number of liters to 0
		getDataStore().setTotalf(0);		//initialize number of total to 0
	}
}
