package project.op.actions;

/**
 * This class is subclass of SetInitialValues and is used 
 * to initiate the number of gallons and total to 0.
 * @author Priyanka
 */

public class SetInitialValues1 extends SetInitialValues {
	
	//This is a method to initiate the number of gallons and total to 0.
	@Override	
	public void setInitialValues(){
		getDataStore().setG(0);                      //initialize number of gallons to 0
		getDataStore().setTotal(0);					 //initialize number of total to 0
	}
}
