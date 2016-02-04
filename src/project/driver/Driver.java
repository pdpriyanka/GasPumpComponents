package project.driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import project.af.AbstractFactory;
import project.af.GP1Factory;
import project.af.GP2Factory;
import project.af.GP3Factory;
import project.ip.*;
import project.mda.MDAEFSM;
import project.mda.states.*;
import project.op.OutputProcessor;

/**
 * This class is used to run the GasPump components. 
 * @author Priyanka
 */

public class Driver {
	
	public static void main(String[] args) {

	Driver driver = new Driver();      
	int option = 0;
	
	OutputProcessor op = new OutputProcessor();  //create OutputProcessor object           
	
	MDAEFSM mda =new MDAEFSM();     // create MDAEFSM object
	
	//create states objects	
	State[] states = new State[8];
	
	states[0] = new Start1();
	states[0].setOp(op);
	
	states[1] = new S0();
	states[1].setOp(op);
	
	states[2] = new S1();
	states[2].setOp(op);
	
	states[3] = new S2();
	states[3].setOp(op);
	
	states[4] = new S3();
	states[4].setOp(op);
	
	states[5] = new S4();
	states[5].setOp(op);
	
	states[6] = new S5();
	states[6].setOp(op);
	
	states[7] = new S6();
	states[7].setOp(op);
	
	mda.setStates(states);	
		
	do{					
		System.out.println("Select GasPump 1, GasPump 2 or GasPump 3");
		System.out.println("1. GasPump 1");
		System.out.println("2. GasPump 2");
		System.out.println("3. GasPump 3");
		System.out.println("4. quit");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Select GasPump : ");
			
		try {
			option = Integer.parseInt(br.readLine());
				
			switch(option){
				case 1:
					
					GasPump1 gp1 = new GasPump1();                   //create GasPump1 object
					mda.setState(states[0]);	 // set current state of MDAEFSM to StartState
					AbstractFactory a1 = new GP1Factory();    //create factory class for GasPump1
					gp1.setAbstractFactory(a1);
					gp1.init();						
					gp1.setMDAEFSM(mda);																	
					op.setAbstractFactory(a1);
					op.setDataStore(gp1.getDataStore());						
					driver.GP1Driver(gp1);						
					break;
						
				case 2:
						
					GasPump2 gp2 = new GasPump2();                   //create GasPump2 object
					mda.setState(states[0]);	 // set current state of MDAEFSM to StartState
					AbstractFactory a2 = new GP2Factory(); //create factory class for GasPump2
					gp2.setAbstractFactory(a2);
					gp2.init();						
					gp2.setMDAEFSM(mda);																	
					op.setAbstractFactory(a2);
					op.setDataStore(gp2.getDataStore());						
					driver.GP2Driver(gp2);						
					break;
					
				case 3:
					GasPump3 gp3 = new GasPump3();                   //create GasPump3 object
					mda.setState(states[0]);	 // set current state of MDAEFSM to StartState
					AbstractFactory a3 = new GP3Factory();  //create factory class for GasPump3
					gp3.setAbstractFactory(a3);
					gp3.init();						
					gp3.setMDAEFSM(mda);																	
					op.setAbstractFactory(a3);
					op.setDataStore(gp3.getDataStore());						
					driver.GP3Driver(gp3);					
					break;
				
				case 4:
					break;
				
				default:
					System.out.println("Invalid option selected.");
					
				}
			} catch (NumberFormatException e) {				
				System.out.println("Invalid input.");
			} catch (IOException e) {				
				System.out.println("Invalid input.");		
			}
						
		}while(option !=4);
	}
	
	/**
	 * This function display GasPump 1 Operations
	 * @param gp1 : GasPump 1
	 */
	public void GP1Driver(GasPump1 gp1) 
	{
		int option = -1;
				
		System.out.println("****GasPump 1 is selected.****");	
		System.out.println("Operations for GasPump 1");
		System.out.println("--------------------------------------");
		System.out.println("0.  Activate(int a)");
		System.out.println("1.  Start()");
		System.out.println("2.  PayCredit()");
		System.out.println("3.  Reject()");
		System.out.println("4.  Cancel()");
		System.out.println("5.  Approved()");
		System.out.println("6.  PayCash(int c)");
		System.out.println("7.  StartPump()");
		System.out.println("8.  PumpGallon()");
		System.out.println("9.  StopPump()");
		System.out.println("10. Quit");
		System.out.println("Please make a note of these operations.");
		System.out.println("GasPump 1 execution.");
		System.out.println("--------------------------------------");
		do{
			
			
			System.out.printf("\n\nPlease select operation.");
			System.out.printf("\n0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-Cancel, 5-Approved, 6-PayCash, 7-StartPump, 8-PumpGallon, 9-StopPump, 10-Quit");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.printf("\nEnter the operation number : ");
			
			try {
				option = Integer.parseInt(br.readLine());
				
				switch(option){
					case 0:
						System.out.println("Operation: Activate(int a)");						
						System.out.println("Enter the value of parameter a : ");
						int a = Integer.parseInt(br.readLine());
						gp1.Activate(a);													
						break;
						
					case 1:
						System.out.println("Operation: Start()");												
						gp1.Start();
						break;
					
					case 2:
						System.out.println("Operation: PayCredit()");						
						gp1.PayCredit();						
						break;
						
					case 3:
						System.out.println("Operation: Reject()");						
						gp1.Reject();						
						break;
					
					case 4:
						System.out.println("Operation: Cancel()");						
						gp1.Cancel();						
						break;
						
					case 5:
						System.out.println("Operation: Approved()");						
						gp1.Approved();						
						break;
						
					case 6:
						System.out.println("Operation: PayCash(int c)");						
						System.out.println("Enter the value of parameter c : ");
						int c = Integer.parseInt(br.readLine());
						gp1.PayCash(c);											
						break;
						
					case 7:
						System.out.println("Operation: StartPump()");												
						gp1.StartPump();						
						break;
					
					case 8:
						System.out.println("Operation: PumpGallon()");						
						gp1.PumpGallon();						
						break;
					
					case 9:
						System.out.println("Operation: StopPump()");						
						gp1.StopPump();											
						break;
						
					case 10:
						break;
						
					default:
						System.out.println("Invalid option selected.");
														
				}
			} catch (NumberFormatException e) {				
				System.out.println("Invalid input.");
			} catch (IOException e) {				
				System.out.println("Invalid input.");
			}
			
		}while(option != 10);
	}
		
	/**
	 * This function display GasPump 2 Operations
	 * @param gp2 : GasPump 2
	 */
	public void GP2Driver(GasPump2 gp2) 
	{
		int option = -1;	
				
		System.out.println("****GasPump 2 is selected.****");	
		System.out.println("Operations for GasPump 2");
		System.out.println("--------------------------------------");
		System.out.println("0.  Activate(float a,float b)");
		System.out.println("1.  Start()");
		System.out.println("2.  PayCredit()");
		System.out.println("3.  Reject()");
		System.out.println("4.  Cancel()");
		System.out.println("5.  Approved()");
		System.out.println("6.  Super()");
		System.out.println("7.  Regular()");
		System.out.println("8.  StartPump()");
		System.out.println("9.  PumpGallon()");
		System.out.println("10. StopPump()");
		System.out.println("11. Quit");
		System.out.println("Please make a note of these operations.");
		System.out.println("GasPump 2 execution.");
		System.out.println("--------------------------------------");
		
		do{			
			System.out.printf("\n\nPlease select operation.");
			System.out.printf("\n0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-Cancel, 5-Approved, 6-Super, 7-Regular, 8-StartPump, 9-PumpGallon, 10-StopPump, 11-Quit");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.printf("\nEnter the operation number : ");
			
			try {
				option = Integer.parseInt(br.readLine());				
				switch(option){
					case 0:
						System.out.println("Operation: Activate(float a, float b)");						
						System.out.println("Enter the value of parameter a : ");
						float a = Float.parseFloat(br.readLine());
						System.out.println("Enter the value of parameter b : ");
						float b = Float.parseFloat(br.readLine());
						gp2.Activate(a,b);							
						break;
						
					case 1:
						System.out.println("Operation: Start()");												
						gp2.Start();
						break;
					
					case 2:
						System.out.println("Operation: PayCredit()");						
						gp2.PayCredit();						
						break;
						
					case 3:
						System.out.println("Operation: Reject()");						
						gp2.Reject();						
						break;
					
					case 4:
						System.out.println("Operation: Cancel()");						
						gp2.Cancel();						
						break;
						
					case 5:
						System.out.println("Operation: Approved()");						
						gp2.Approved();						
						break;
						
					case 6:
						System.out.println("Operation: Super()");						
						gp2.Super();											
						break;
						
					case 7:
						System.out.println("Operation: Regular()");						
						gp2.Regular();		
						break;
						
					case 8:
						System.out.println("Operation: StartPump()");						
						gp2.StartPump();		
						break;
						
					case 9:
						System.out.println("Operation: PumpGallon()");						
						gp2.PumpGallon();						
						break;
					
					case 10:
						System.out.println("Operation: StopPump()");						
						gp2.StopPump();											
						break;

					case 11:
						break;
						
					default:
						System.out.println("Invalid option selected.");
				}
			} catch (NumberFormatException e) {				
				System.out.println("Invalid input.");
			} catch (IOException e) {				
				System.out.println("Invalid input.");
			}						
		}while(option!=11);
	}
	
	/**
	 * This function display GasPump 3 Operations
	 * @param gp3 : GasPump 3
	 */
	public void GP3Driver(GasPump3 gp3)
	{
		int option = -1;		
		
		System.out.println("****GasPump 3 is selected.****");	
		System.out.println("Operations for GasPump 3");
		System.out.println("--------------------------------------");
		System.out.println("0.  Activate(float a, float b)");
		System.out.println("1.  Start()");
		System.out.println("2.  PayCash(float c)");
		System.out.println("3.  Cancel()");
		System.out.println("4.  Premium()");
		System.out.println("5.  Regular()");
		System.out.println("6.  StartPump()");
		System.out.println("7.  PumpLiter()");
		System.out.println("8.  StopPump()");
		System.out.println("9.  Receipt()");
		System.out.println("10. NoReceipt()");
		System.out.println("11. Quit");
		System.out.println("Please make a note of these operations.");
		System.out.println("GasPump 3 execution.");
		System.out.println("--------------------------------------");
		
		do{			
			System.out.printf("\n\nPlease select operation.");
			System.out.printf("\n0-Activate, 1-Start, 2-PayCash,3-Cancel, 4-Premium, 5-Regular, 6-StartPump, 7-PumpLiter, 8-StopPump,9-Receipt,10-NoReceipt,11-Quit");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.printf("\nEnter the operation number : ");
			
			try {
				option = Integer.parseInt(br.readLine().trim());				
				switch(option){
					case 0:
						System.out.println("Operation: Activate(float a, float b)");						
						System.out.println("Enter the value of parameter a : ");
						float a = Float.parseFloat(br.readLine());
						System.out.println("Enter the value of parameter b : ");
						float b = Float.parseFloat(br.readLine());					
						gp3.Activate(a,b);													
					
					break;
						
					case 1:
						System.out.println("Operation: Start()");												
						gp3.Start();
						break;
						
					case 2:
						System.out.println("Operation: PayCash(float c)");						
						System.out.println("Enter the value of parameter c : ");
						float c = Float.parseFloat(br.readLine());
						gp3.PayCash(c);
											
					break;
											
					case 3:
						System.out.println("Operation: Cancel()");						
						gp3.Cancel();						
						break;
						
					case 4:
						System.out.println("Operation: Premium()");						
						gp3.Premium();
						break;
						
					case 5:
						System.out.println("Operation: Regular()");						
						gp3.Regular();
						break;
						
					case 6:
						System.out.println("Operation: StartPump()");												
						gp3.StartPump();						
						break;
					
					case 7:
						System.out.println("Operation: PumpLiter()");						
						gp3.PumpLiter();
						break;
					
					case 8:
						System.out.println("Operation: StopPump()");						
						gp3.StopPump();						
						break;
						
					case 9:
						System.out.println("Operation: Receipt()");						
						gp3.Receipt();						
						break;
						
					case 10:
						System.out.println("Operation: NoReceipt()");						
						gp3.NoReceipt();	
						break;
					
					case 11:
						break;
					
					default:
						System.out.println("Invalid option selected.");
				}
			} catch (NumberFormatException e) {				
				System.out.println("Invalid input.");
			} catch (IOException e) {				
				System.out.println("Invalid input.");
			}					
		}while(option!=11);
	}	
}
