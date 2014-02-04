package pottst1.display;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 1/30/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import java.util.Scanner;
import pottst1.data.Product;
import pottst1.display.InvoiceDisplay;

public class SalesDisplay
{
	public static void initialDisplay(){

		System.out.println("Sales Display\n");

		System.out.println("Would you like to do: Add, Remove, or Exit?: ");

		Scanner sc = new Scanner(System.in);
		String salesDisplayChoice = sc.next();

		if (salesDisplayChoice.equalsIgnoreCase("Add"))
		{
			System.out.println("You selected Add");
			addDisplay();
		}
		if (salesDisplayChoice.equalsIgnoreCase("Remove"))
		{
			System.out.println("You selected Remove");
			removeDisplay();
		}
		if (salesDisplayChoice.equalsIgnoreCase("Exit"))
		{
			System.out.println("You selected Exit.");
			System.exit(0);
		}
	}

		public static String addDisplay(){

		Product product = new Product();


		String upc = product.getUpc();
		//product.setUpc(upc);
		boolean isValid = false;

		while (!isValid){

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a UPC code: ");
			upc = sc.next();
			//upc = product.getUpc();

			if (upc.isEmpty())
			{
				System.out.print("Error! UPC must be entered. ");
			}
			else if (!upc.equals("12345678")){

				System.out.print("Error! UPC doesn't exist ");
			}
			else{
				upc = "12345678";
				InvoiceDisplay.add();

			}
		}
			return upc;
		}

	public static String removeDisplay(){

		Product product = new Product();
		Scanner sc = new Scanner(System.in);



		String upc = null;

		while (upc == null){
			System.out.println("Enter a UPC code: ");
			upc = sc.next();

			if (upc.equals(""))
			{
				System.out.println("Error! UPC must be entered.");
			}
			if (!upc.equalsIgnoreCase("12345678")){

				System.out.println("Error! UPC doesn't exist");
			}
			else{
				upc = "12345678";
			}
		}
		return upc;

	}
}



