package pottst1.data;

import java.util.Scanner;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 1/28/14: 
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/
public class Validator
{
//  UPCs Can only be 8 digits

/*  Usernames are 6 to 12 alphanumeric characters long. No
    punctuation, whitespace, or other special characters are
    permitted.*/

    public static String getUsername(Scanner sc, String prompt)
    {
        String s = "";
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s == null || s.equals(""))
            {
                System.out.println("Error! You must enter a valid username.");
            }
            else
            {
                isValid = true;
            }
        }
        return s;
    }

    public static char[] getPassword(Scanner sc, String prompt)
    {
        String s = "";
        boolean isValid = false;
        while(!isValid)
        {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s==null || s.equals(""))
            {
                System.out.println("Error! You must enter a valid password.");
            }
            else
            {
                isValid = true;
            }
        }
        return s.toCharArray();
    }
}


/*  Passwords are 8 to 20 characters long including letters,
    numbers, and special characters. However, no form of whitespace
    is allowed.*/


//  Item quantities range from 0 to 999.


/*  Item descriptions are no longer than 30 characters, including
    whitespace. They may not include special characters or
    punctuation.*/
}
