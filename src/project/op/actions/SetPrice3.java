package project.op.actions;
import project.enums.GasTypeEnum;

/**
 * This class is subclass of SetPrice and is used to set the price of selected gas.
 * @author Priyanka
 */
public class SetPrice3 extends SetPrice {
	
	// This method is used to set the price of selected gas.
	@Override
	public void setPrice(int g){
		float p ;
		if(g == GasTypeEnum.REGULAR.getType())
		{
			p = getDataStore().getRprice();
			getDataStore().setPrice1(p);   //setting price of regular gas.
		}
		else if(g == GasTypeEnum.SUPER_OR_PREMIUM.getType())
		{
			p = getDataStore().getPprice();
			getDataStore().setPrice1(p);   //setting price of premium gas.
		}
	}

}
