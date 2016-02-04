package project.ip;

import project.af.AbstractFactory;
import project.datastore.DataStore;
import project.enums.GasTypeEnum;
import project.mda.MDAEFSM;

/**
 * This class is used to execute operation of GasPump3.
 * @author Priyanka
 */
public class GasPump3 {
	private MDAEFSM m;
	private DataStore d;	
	private AbstractFactory a;

	public void init()
	{
		d = a.getDataStore();
	}
	
	/**
	 * This method is used to activate the gas pump.
	 * @param a : price of regular gas per gallon
	 * @param b : price of premium gas per gallon
	 */
	public void Activate(float a, float b)
	{
		if((a > 0) && (b >0)){
			d.setTemp_a1(a);
			d.setTemp_b(b);
			m.Activate();							
		}

	}
	
	// This method is used to start the transaction.
	public void Start(){
		m.Start();
	}
	
	/**
	 * This method is used to pay for gas by cash.
	 * @param c : cash
	 */
	public void PayCash(float c){		
		if(c > 0){
			d.setTemp_c1(c);
			m.PayCash();
		}
	}
	
	//This method is used to cancel the transaction.
	public void Cancel(){
		m.Cancel();
	}
	
	//This method is used to select premium gas.
	public void Premium(){
		m.SelectGas(GasTypeEnum.SUPER_OR_PREMIUM.getType());
	}
	
	//This method is used to select regular gas.
	public void Regular(){
		m.SelectGas(GasTypeEnum.REGULAR.getType());
	}
	
	//This method is used to start pumping gas.
	public void StartPump(){
		m.StartPump();
	}
	
	//This method is used to dispose one liter of gas.
	public void PumpLiter(){
		if(d.getCash1() < ((d.getL() + 1) * d.getPrice1())){
			m.StopPump();
		}
		else
			m.Pump();
	}
	
	//This method is used to stop pumping gas.
	public void StopPump(){
		m.StopPump();
	}
	
	//This method is used to request receipt.
	public void Receipt(){
		m.Receipt();
	}
	
	//This method is used for no receipt.
	public void NoReceipt(){
		m.NoReceipt();
	}
	
	
	//setter getter methods
	public MDAEFSM getMDAEFSM() {
		return m;
	}

	public void setMDAEFSM(MDAEFSM m) {
		this.m = m;
	}

	public DataStore getDataStore() {
		return d;
	}

	public void setDataStore(DataStore d) {
		this.d = d;
	}

	public AbstractFactory getAbstractFactory() {
		return a;
	}

	public void setAbstractFactory(AbstractFactory a) {
		this.a = a;
	}

}
