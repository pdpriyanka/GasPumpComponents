package project.op.actions;

/**
 * This class is a subclass of SetW and is used to set the value of W.
 * @author Priyanka
 */

public class SetW1 extends SetW {
	
	//This method is used for setting the value of w.
	@Override
	public void setW(int k){
		getDataStore().setW(k);          //setting the value of W
	}
}
