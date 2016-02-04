package project.op.actions;

/**
 * This class is subclass of PrintReceipt and is used to print receipt.
 * @author Priyanka
 */

public class PrintReceipt3 extends PrintReceipt {

	//This is a method for printing receipt.
	@Override
	public void printReceipt(){	
		System.out.println("Receipt :");
		System.out.printf("\nLiters : %d",getDataStore().getL());   //printing number of liters
		System.out.printf("\nTotal : $%.2f",getDataStore().getTotalf());  //printing total
	}
}
