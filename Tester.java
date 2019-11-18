
/**
 * This class tests the WordEncryptor class
 *
 * @author Michael Buescher and APCS-A @ Hathaway Brown
 * @version 2019-11
 */

import java.util.Scanner;

public class Tester
{
    public static void main (String[] args)
    {
        Scanner kbd = new Scanner (System.in);
        
        Password pword;
        System.out.print ("Enter a password to check and encrypt: ");
        String word = kbd.nextLine();
        while (word.length() > 0)
        {
            if (Password.isValid(word))
            {
                pword = new Password (word);
                System.out.println (word + " encoded as " + pword);
            }
            else
            {
                System.out.println("Not a valid password.  Please refer to the requirements.");
            }

            System.out.print ("Enter a password to check and encrypt (<ENTER< to quit): ");
            word = kbd.nextLine();
        }
    }
}
