
/**
 * Write a description of class Password here.
 *
 * @author Michael Buescher for APCS-A @ Hathaway Brown
 * @version 2019-11
 */
public class Password
{
    private String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowercase = "abcdefghijklmnopqrstuvwxyz";
    private String digit = "0123456789";
    private String specialChar = "_+-*!?<=>";
    private String allChars = uppercase + lowercase + digit + specialChar;
    private String encodedPassword;
    
    public Password (String s)
    {
        WordEncryptor encryptor = new WordEncryptor(s, allChars);
        encodedPassword = encryptor.getEncrypted();
    }
    
    public String toString()
    {
        return encodedPassword;
    }
    
    public static boolean isValid (String str)
    {
        return true;
    }
}
