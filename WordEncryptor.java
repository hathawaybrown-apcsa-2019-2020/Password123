
/**
 * WordEncryptor encrypts a string of text composed of the
 * characters in a given String (default = capital English letters)
 * The actual encryption method stays hidden if you have
 * a class that uses WordEncryptor.
 *
 * @author [default version]
 * @version 2019-11
 */
public class WordEncryptor
{
    private String encrypted;
    private String okLetters;
    
    public WordEncryptor (String s)
    {
        okLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        encrypt(s);
    }
    
    public WordEncryptor (String s, String ok)
    {
        okLetters = ok;
        encrypt(s);
    }
    
    private void encrypt (String s)
    {
        // This is currently a default method that does not
        // do any encrypting.  Change that!  Duh.
        encrypted = s;
    }
    
    public String getEncrypted()
    {
        return encrypted;
    }
}
