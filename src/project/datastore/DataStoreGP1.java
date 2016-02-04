package project.datastore;

/**
 * This class is used to store data (platform dependent data) for GasPump1.
 * @author Priyanka
 */
public class DataStoreGP1 extends DataStore {
	
	//variables for Gaspump1
	private int w;            //  W - store the value for cash or credit as integer flag
	private int cash;         // cash - cash
	private int price;        // price  - price of  selected (regular) gas per gallon. 
	private int G;            //G - Number of Gallons
	private int total;        //total - total amount for pumped gas 

	//temporary variables
	private int temp_a;       //for storing price of regular gas per gallon temporary
	private int temp_c;       //for storing cash temporary
		
	//getter setter methods for variables of GasPump1	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	//getter setter methods for temporary variables.
	public int getTemp_a() {
		return temp_a;
	}

	public void setTemp_a(int temp_a) {
		this.temp_a = temp_a;
	}

	public int getTemp_c() {
		return temp_c;
	}

	public void setTemp_c(int temp_c) {
		this.temp_c = temp_c;
	}

	@Override
	public float getPrice1() {return 0;}
	public void setPrice1(float price) {}
	public float getRprice() {return 0;}
	public void setRprice(float Rprice) {}
	public float getSprice() {return 0;}
	public void setSprice(float Sprice) {}
	public int getL() {return 0;}
	public void setL(int L) {}
	public float getPprice() {return 0;}
	public void setPprice(float Pprice) {}
	public float getCash1() {return 0;}
	public void setCash1(float cash) {}
	public float getTotalf() {return 0;}
	public void setTotalf(float total) {}
	public float getTemp_a1() {return 0;}
	public void setTemp_a1(float temp_a) {}
	public float getTemp_b() {return 0;}
	public void setTemp_b(float temp_b) {}
	public float getTemp_c1() {return 0;}
	public void setTemp_c1(float temp_c) {}
}
