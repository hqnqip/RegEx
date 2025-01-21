public class ValidateInput
{
    //First Names
    public static boolean validFirst(String firstName)
    {
        return firstName.matches("[A-Z][a-zA-Z]*");
        //The first letter must be capital. After that, it can be either lowercase or uppercase.
        //* = There can be as many letters.
    }

    //Addresses
    public static boolean validAddress(String address)
    {
        return address.matches("\\d+\\s([A-Z][a-zA-Z]+\\s[a-zA-Z]+).");
        //The + in blue is a quantifier. How many of this is allowed.
    }

    //We're using RegEx, we only use Strings for text validation.
    //Zip Code
    public static boolean validZip(String zip)
    {
        return zip.matches("[0-9]{5}");
    }


    //Username
    public static boolean validUsername(String username)
    {
        return username.matches("@[a-zA-Z]+[0-9]*");
    }


    //Passwords
    public static boolean validPassword(String password)
    {
        return password.matches("[a-zA-Z]{6,}[.]+[0-9]{4,}");
    }


    //Six-Letter Word
    public static boolean validWordle(String word)
    {
        return word.matches("[A-Z]{6}");
    }


    //ID Number
    public static boolean validID(String id)
    {
        return id.matches("911([0-9]{5})");
    }


    //Hex Color Codes
    public static boolean validHex(String hex)
    {
        return hex.matches("#[a-z0-9]{6}");
    }

    //Syrups
    public static boolean validSyrup(String syrup)
    {
        return syrup.matches("[A-Z][a-z]+ Syrup");
    }

}
