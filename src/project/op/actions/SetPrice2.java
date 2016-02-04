package project.op.actions;
import project.enums.GasTypeEnum;

/**
 * This class is subclass of SetPrice and is used to set the price of selected gas.
 * @author Priyanka
 */
public class SetPrice2 extends SetPrice {

	// This method is used to set the price of selected gas.
	@Override
	public void setPrice(int g){
		if(g == GasTypeEnum.REGULAR.getType())
			getDataStore().setPrice1(getDataStore().getRprice()); //setting price of regular gas.
		else if(g == GasTypeEnum.SUPER_OR_PREMIUM.getType())
			getDataStore().setPrice1(getDataStore().getSprice()); //setting price of super gas.
	}
}
