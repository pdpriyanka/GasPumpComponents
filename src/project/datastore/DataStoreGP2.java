package project.datastore;

/**
 * This class is used to store data (platform dependent data) for GasPump2.
 * @author Priyanka
 */
public class DataStoreGP2 extends DataStore {
	
	//variables for Gaspump2
	private float Rprice;     //Rprice -price of regular gas per gallon
	private float Sprice;     //Sprice - price of super gas per gallon
	private float price;     //price - price of selected gas per gallon
	private int G;            //G  - Number of Gallons
	private float total;     //total - total amount for pumped gas
	
	//temporary variables
	private float temp_a;    //for storing price of regular gas per gallon temporary
	private float temp_b;     //for storing price of super gas per gallon temporary

	//getter setter methods for variables of GasPump2
	public float getRprice() {
		return Rprice;
	}
	
	public void setRprice(float Rprice) {
		this.Rprice = Rprice;
	}
	
	public float getSprice() {
		return Sprice;
	}
	
	public void setSprice(float Sprice) {
		this.Sprice = Sprice;
	}
	
	public float getPrice1() {
		return price;
	}
	
	public void setPrice1(float price) {
		this.price = price;
	}
	
	public float getTotalf() {
		return total;
	}
	
	public void setTotalf(float total) {
		this.total = total;
	}
	
	public int getG() {
		return G;
	}
	
	public void setG(int g) {
		this.G = g;
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

	@Override
	public int getW() {return 0;}
	public void setW(int w) {}
	public int getCash() {return 0;}
	public void setCash(int cash) {}
	public int getPrice() {return 0;}
	public void setPrice(int price) {}
	public int getTotal() {return 0;}
	public void setTotal(int total) {}
	public int getL() {return 0;}
	public void setL(int L) {}
	public float getPprice() {return 0;}
	public void setPprice(float Pprice) {}
	public float getCash1() {return 0;}
	public void setCash1(float cash) {}
	public int getTemp_a() {return 0;}
	public void setTemp_a(int temp_a) {}
	public int getTemp_c() {return 0;}
	public void setTemp_c(int temp_c) {}
	public float getTemp_c1() {return 0;}
	public void setTemp_c1(float temp_c) {}
}
