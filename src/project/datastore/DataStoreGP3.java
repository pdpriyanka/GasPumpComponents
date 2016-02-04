package project.datastore;

/**
 * This class is used to store data (platform dependent data) for GasPump3.
 * @author Priyanka
 */
public class DataStoreGP3 extends DataStore {

	//variables for Gaspump3
	private int L;           //L - Number of Liters
	private float Rprice;    //Rprice - price of regular gas per liter
	private float Pprice;    //Pprice - price of premium gas per liter
	private float price;    //price - price of selected gas per liter
	private float cash;     //cash - cash 
	private float total;    //total - total amount for pumped gas
	
	//temporary variables
	private float temp_a;   //for storing price of regular gas per liter temporary 
	private float temp_b;    //for storing price of premium gas per liter temporary
	private float temp_c;   //for storing cash temporary
	
	
	//getter setter methods for variables of GasPump3
	public int getL() {
		return L;
	}
	
	public void setL(int L) {
		this.L = L;
	}
	
	public float getRprice() {
		return Rprice;
	}
	
	public void setRprice(float Rprice) {
		this.Rprice = Rprice;
	}
	
	public float getPprice() {
		return Pprice;
	}
	
	public void setPprice(float Pprice) {
		this.Pprice = Pprice;
	}
	
	public float getPrice1() {
		return price;
	}
	
	public void setPrice1(float price) {
		this.price = price;
	}
	
	public float getCash1() {
		return cash;
	}
	
	public void setCash1(float cash) {
		this.cash = cash;
	}
	
	public float getTotalf() {
		return total;
	}
	
	public void setTotalf(float total) {
		this.total = total;
	}
	
	//getter setter methods for temporary variables.
	public float getTemp_a1() {
		return temp_a;
	}
	
	public void setTemp_a1(float temp_a) {
		this.temp_a = temp_a;
	}
	
	public float getTemp_b() {
		return temp_b;
	}
	
	public void setTemp_b(float temp_b) {
		this.temp_b = temp_b;
	}
	
	public float getTemp_c1() {
		return temp_c;
	}
	
	public void setTemp_c1(float temp_c) {
		this.temp_c = temp_c;
	}

	@Override
	public int getW() {return 0;}
	public void setW(int w) {}
	public int getCash() {return 0;}
	public void setCash(int cash) {}
	public int getPrice() {return 0;}
	public void setPrice(int price) {}
	public int getG() {return 0;}
	public void setG(int g) {}
	public int getTotal() {return 0;}
	public void setTotal(int total) {}
	public float getSprice() {return 0;}
	public void setSprice(float Sprice) {}
	public int getTemp_a() {return 0;}
	public void setTemp_a(int temp_a) {}
	public int getTemp_c() {return 0;}
	public void setTemp_c(int temp_c) {}
}
