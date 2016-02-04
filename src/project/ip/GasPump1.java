package project.ip;

import project.af.AbstractFactory;
import project.datastore.DataStore;
import project.enums.GasTypeEnum;
import project.enums.PaymentTypeEnum;
import project.mda.MDAEFSM;

/**
 * This class is used to execute operation of GasPump1.
 * @author Priyanka
 */
public class GasPump1 {
	private MDAEFSM m;
	private DataStore d;
	private AbstractFactory a;
	
	public void init()
	{		
		d = a.getDataStore();
	}
	
	/**
	 * This method is used to activate the gas pump.
	 * @param a : price of gas per gallon
	 */
	public void Activate(int a)
	{
		if(a > 0){
			d.setTemp_a(a);
			m.Activate();							
		}
	}
	
	
	// This method is used to start the transaction. 
	public void Start()
	{
		m.Start();
	}
	
	//This method is used to pay for gas by a credit card.
	public void PayCredit()
	{
		m.PayCredit();
	}
	
	//This method is used to reject the credit card.
	public void Reject()
	{
		m.Reject();
	}
	
	//This method is used to cancel the transaction.
	public void Cancel()
	{
		m.Cancel();
	}
	
	//This method is used to approve the credit card.
	public void Approved()
	{
		m.Approved();
	}
	
	/**
	 * This method is used to pay for gas by cash.
	 * @param c : cash
	 */
	public void PayCash(int c)
	{
		if(c > 0){
			d.setTemp_c(c);
			m.PayCash();
		}						

	}
	
	//This method is used to start pumping gas.
	public void StartPump()
	{
		m.SelectGas(GasTypeEnum.REGULAR.getType());
		m.StartPump();						

	}
	
	//This method is used to dispose one gallon of gas.
	public void PumpGallon()
	{
		if(d.getW() == PaymentTypeEnum.CREDIT.getType())
		{
			m.Pump();
		}
		else if(d.getW() == PaymentTypeEnum.CASH.getType()){
				if(d.getCash() < ((d.getG() + 1) * d.getPrice())){
					m.StopPump();
					m.Receipt();
				}
				else
					m.Pump();
		}
		
	}
	
	//This method is used to stop pumping gas.
	public void StopPump()
	{
		m.StopPump();
		m.Receipt();						
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
