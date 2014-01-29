package pottst1.data;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 1/28/14: 
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

    private static String main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.next();

        boolean isValid = false;

        while (!isValid)
        {

            String raw_input = sc.nextLine();

            try
            {

            }
        }
    }

/* This method is for getting the input of the password from the user. We want to use char so the password cannot
   easily stolen as a security feature. Eventually we want to validate the password is correct and meets the specs
   doc of 8-20 characters long including letters, numbers, and special characters. */

    public static char main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        char password = sc.next();

        boolean isValid = false;

        while (!isValid)
        {

        }
    }

}
