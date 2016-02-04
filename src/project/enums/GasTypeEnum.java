package project.enums;

/**
 * This is enum for gas types.
 * @author Priyanka
 */
public enum GasTypeEnum {

	REGULAR(1),SUPER_OR_PREMIUM(2);
	
	private int type;
	
	GasTypeEnum(int type)
	{
		this.type = type;
	}
	
	public int getType()
	{
		return type;
	}
}
