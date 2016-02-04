package project.datastore;

/**
 * This class is used to store data (platform dependent data).
 * @author Priyanka
 */
public abstract class DataStore {

	public abstract int getW();           //getter method for W

	public abstract void setW(int w);		     //setter method for W
	
	public abstract int getCash();	     //getter method for cash

	public abstract void setCash(int cash);         //setter method for cash

	public abstract int getPrice();        //getter method for Price

	public abstract void setPrice(int price);	     //setter method for Price
	
	public abstract int getG();         //getter method for G

	public abstract void setG(int g);               //setter method for G
	
	public abstract int getTotal();        //getter method for total

	public abstract void setTotal(int total);       //setter method for total

	public abstract float getPrice1();     //getter method for price1

	public abstract void setPrice1(float price);   //setter method for price1
	
	public abstract float getRprice();     //getter method for Rprice
	
	public abstract void setRprice(float Rprice);   //setter method for Rprice
	
	public abstract float getSprice();     //getter method for sprice
	
	public abstract void setSprice(float Sprice);	 //setter method for sprice
	
	public abstract int getL();            //getter method for L  

	public abstract void setL(int L);               //setter method for L

	public abstract float getPprice();     //getter method for Pprice
	
	public abstract void setPprice(float Pprice);   //setter method for Pprice
	
	public abstract float getCash1();     //getter method for Cash1

	public abstract void setCash1(float cash);     //setter method for Cash1

	public abstract float getTotalf();     //getter method for total
	
	public abstract void setTotalf(float total);   //setter method for total
		
	//getter setter methods for temporary variables	
	public abstract int getTemp_a();

	public abstract void setTemp_a(int temp_a);

	public abstract int getTemp_c();

	public abstract void setTemp_c(int temp_c);

	public abstract float getTemp_a1();
	
	public abstract void setTemp_a1(float temp_a);
	
	public abstract float getTemp_b();
	
	public abstract void setTemp_b(float temp_b);
		
    public abstract float getTemp_c1();
	
	public abstract void setTemp_c1(float temp_c);
}
