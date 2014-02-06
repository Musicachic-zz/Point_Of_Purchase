/*package pottst1.display;

*//*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/3/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*//*

import pottst1.data.*;
import pottst1.display.SalesDisplay;
import java.util.Arrays;

public class InvoiceDisplay
{

	private ProductList tempProdList;
	private Product[] invoice;
	private int invoiceSize;

	public InvoiceDisplay(ProductList tempProdList){
		this.tempProdList=tempProdList;
		invoice = new Product[1000];
		invoiceSize=0;
	}

	public static void add()
	{
		System.out.println("______________________________");


*//*		for (int i = 0; i < invoice.length; i++)
		{
			System.out.println(invoice[i]);
		}*//*

		for (Product anInvoice : invoice)
		{
			System.out.println(anInvoice);
		}

		System.out.println("______________________________");
		System.out.println();
	}

}*/
