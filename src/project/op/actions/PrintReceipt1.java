package project.op.actions;

/**
 * This class is subclass of PrintReceipt and is used to print receipt.
 * @author Priyanka
 */

public class PrintReceipt1 extends PrintReceipt{
	
	//This is a method for printing receipt.
	@Override
	public void printReceipt(){			
			System.out.println("Receipt :");
			System.out.printf("Total : $%d",getDataStore().getTotal());   // printing total
	}
}
