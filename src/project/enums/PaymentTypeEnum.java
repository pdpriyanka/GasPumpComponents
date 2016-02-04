package project.enums;

/**
 * This is enum for Payment Types.
 * @author Priyanka
 */

public enum PaymentTypeEnum {
	CASH(0),CREDIT(1);
	
	private int type;
	
	PaymentTypeEnum(int type)
	{
		this.type = type;
	}
	
	public int getType()
	{
		return type;
	}
}
