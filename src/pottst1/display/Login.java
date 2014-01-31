package pottst1.display;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 1/30/14:
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import java.util.Scanner;

public class Login
{
/* This method is for getting the input of the username from the user. Eventually I will need a validator class to call
to verify that the username is 6-12 alphanumeric characters long as per the spec document.*/


	public static String username(String[] args)
	{

		//Will use this boolean more when actually validating the password.
		boolean isValid = false;

		String username = "employee";
		Scanner sc = new Scanner(System.in);

		//Change to !isValid once you have more of a list to compare to.
		while (!isValid)
		{
			System.out.println("Login Display");
			System.out.println();

			System.out.print("Enter your username: ");
			username = sc.next();

			if (username.equals(""))
			{
				System.out.println("Error! Username is required. Try again.");
			}
			if (!username.equalsIgnoreCase("employee"))
			{
				System.out.println("Error! Username doesn't exist. Try again.");
			}
			else
			{
				isValid = true;
			}

		}
		return username;
	}

/* This method is for getting the input of the password from the user. We want to use char so the password cannot
   easily stolen as a security feature. Eventually we want to validate the password is correct and meets the specs
   doc of 8-20 characters long including letters, numbers, and special characters. */

	public static char[] password()
	{

		Scanner sc = new Scanner(System.in);

		char[] password = "password".toCharArray();

		boolean isValid = false;

		while (!isValid)
		{
			System.out.print("Enter your password: ");
			password = sc.next().toCharArray();

			if (password.equals(""))
			{
				System.out.println("Error! Password is required. Try again.");
			}
			if (password.equals("password"))
			{
				isValid = true;
			}
			else
			{

				System.out.println("Error! Password is invalid. Try again.");
			}
		}
		return password;
	}

}
