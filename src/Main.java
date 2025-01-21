//RegEx is used for text validation. Are we doing it in the correct format?

public class Main
{
    public static void main(String[] args)
    {
        //First Names
        String first1 = "Starbucks";
        String first2 = "caffeine cookie";
        String first3 = "101cafe";
        String first4 = "strawberry bakery36";
        String first5 = "E s p r e s s o";
        String first6 = "Mocha L Americano";
        String first7 = " ";
        System.out.println("Which First Names Are Valid?");
        System.out.println("Starbucks: " + ValidateInput.validFirst(first1));
        System.out.println("caffeine cookie: " + ValidateInput.validFirst(first2));
        System.out.println("101cafe: " + ValidateInput.validFirst(first3));
        System.out.println("strawberry bakery36: " + ValidateInput.validFirst(first4));
        System.out.println("E s p r e s s o: " + ValidateInput.validFirst(first5));
        System.out.println("Mocha L Americano: " + ValidateInput.validFirst(first6));
        System.out.println("\" \": " + ValidateInput.validFirst(first7));


        //Addresses
        String addr1 = " 10101 Cappuccino Way";
        String addr2 = "";
        String addr3 = "Address: 25555 Bucks Star";
        String addr4 = "Latte Avenue";
        String addr5 = "10101";
        String addr6 = "232 Lava Cake";
        String addr7 = "10101 Cappuccino Way";
        System.out.println("\nWhich Addresses Are Valid?");
        System.out.println(" 10101 Cappuccino Way: " + ValidateInput.validAddress(addr1));
        System.out.println("\"\": " + ValidateInput.validAddress(addr2));
        System.out.println("Address: 25555 Bucks Star: " + ValidateInput.validAddress(addr3));
        System.out.println("Latte Avenue: " + ValidateInput.validAddress(addr4));
        System.out.println("10101: " + ValidateInput.validAddress(addr5));
        System.out.println("232 Lava Cake: " + ValidateInput.validAddress(addr6));
        System.out.println("10101 Cappuccino Way: " + ValidateInput.validAddress(addr7));


        //Zip Codes
        String zip1 = "10101";
        String zip2 = "#90900";
        String zip3 = "101010";
        String zip4 = "coffeecode";
        String zip5 = "LATTE";
        String zip6 = "Zip: 10101";
        String zip7 = "1 0 1 0 1";
        System.out.println("\nWhich Zip Codes Are Valid?");
        System.out.println("10101: " + ValidateInput.validZip(zip1));
        System.out.println("#90900: " + ValidateInput.validZip(zip2));
        System.out.println("101010: " + ValidateInput.validZip(zip3));
        System.out.println("coffeecode: " + ValidateInput.validZip(zip4));
        System.out.println("LATTE: " + ValidateInput.validZip(zip5));
        System.out.println("Zip: 10101: " + ValidateInput.validZip(zip6));
        System.out.println("1 0 1 0 1: " + ValidateInput.validZip(zip7));


        //Usernames
        String user1 = "U s e r n a m e";
        String user2 = "COFFEE@ADDICT12";
        String user3 = "cupcakeespresso@";
        String user4 = "@eighty7";
        String user5 = "101010c36";
        String user6 = "ColdBrew";
        String user7 = "@ColdBrew";
        System.out.println("\nWhich Usernames Are Valid?");
        System.out.println("U s e r n a m e: " + ValidateInput.validUsername(user1));
        System.out.println("COFFEE@ADDICT12: " + ValidateInput.validUsername(user2));
        System.out.println("cupcakeespresso@: " + ValidateInput.validUsername(user3));
        System.out.println("@eighty7: " + ValidateInput.validUsername(user4));
        System.out.println("101010c36: " + ValidateInput.validUsername(user5));
        System.out.println("ColdBrew: " + ValidateInput.validUsername(user6));
        System.out.println("@ColdBrew: " + ValidateInput.validUsername(user7));


        //Passwords
        String pass1 = "password";
        String pass2 = "c0ff33";
        String pass3 = "MyNameIsLatte";
        String pass4 = "cinnamoncup2637";
        String pass5 = "899BEANS";
        String pass6 = "rainOfCaffeine19.";
        String pass7 = "caramel.31415";
        System.out.println("\nWhich Passwords Are Valid?");
        System.out.println("password: " + ValidateInput.validPassword(pass1));
        System.out.println("c0ff33: " + ValidateInput.validPassword(pass2));
        System.out.println("MyNameIsLatte: " + ValidateInput.validPassword(pass3));
        System.out.println("cinnamoncup2637: " + ValidateInput.validPassword(pass4));
        System.out.println("899BEANS: " + ValidateInput.validPassword(pass5));
        System.out.println("rainOfCaffeine19.: " + ValidateInput.validPassword(pass6));
        System.out.println("caramel.31415: " + ValidateInput.validPassword(pass7));


        //Words
        String word1 = "Coffee";
        String word2 = "theLat";
        String word3 = "Frappucino";
        String word4 = "101010";
        String word5 = "mochas";
        String word6 = "caramel";
        String word7 = "COFFEE";
        System.out.println("\nWhich Words Are Valid?");
        System.out.println("Coffee: " + ValidateInput.validWordle(word1));
        System.out.println("theLat: " + ValidateInput.validWordle(word2));
        System.out.println("Frappucino: " + ValidateInput.validWordle(word3));
        System.out.println("101010: " + ValidateInput.validWordle(word4));
        System.out.println("m o c h a s: " + ValidateInput.validWordle(word5));
        System.out.println("caramel: " + ValidateInput.validWordle(word6));
        System.out.println("COFFEE: " + ValidateInput.validWordle(word7));


        //Student IDs
        String id1 = "911-07236";
        String id2 = "09328382";
        String id3 = "#91107236";
        String id4 = "911369111";
        String id5 = "911HannahPham";
        String id6 = "9 0 9 0 7 2 3 6";
        String id7 = "91107236";
        System.out.println("\nWhich Student IDs Are Valid?");
        System.out.println("911-07236: " + ValidateInput.validID(id1));
        System.out.println("09328382: " + ValidateInput.validID(id2));
        System.out.println("#91107236: " + ValidateInput.validID(id3));
        System.out.println("911369111: " + ValidateInput.validID(id4));
        System.out.println("911HannahPham: " + ValidateInput.validID(id5));
        System.out.println("9 0 9 0 7 2 3 6: " + ValidateInput.validID(id6));
        System.out.println("91107236: " + ValidateInput.validID(id7));


        //Hex Codes
        String hex1 = "1727363";
        String hex2 = "brown-mocha";
        String hex3 = "Latte";
        String hex4 = "50, 168, 82";
        String hex5 = "32a852#";
        String hex6 = "#33CC33";
        String hex7 = "#32a852";
        System.out.println("\nWhich Hex Codes Are Valid?");
        System.out.println("1727363: " + ValidateInput.validHex(hex1));
        System.out.println("brown-mocha: " + ValidateInput.validHex(hex2));
        System.out.println("Latte: " + ValidateInput.validHex(hex3));
        System.out.println("50, 168, 82: " + ValidateInput.validHex(hex4));
        System.out.println("32a852#: " + ValidateInput.validHex(hex5));
        System.out.println("#33CC33: " + ValidateInput.validHex(hex6));
        System.out.println("#32a852: " + ValidateInput.validHex(hex7));


        //Syrups
        String syrup1 = "Chocolate";
        String syrup2 = "strawberry";
        String syrup3 = "1010";
        String syrup4 = "chocolatesyrup";
        String syrup5 = "syrup";
        String syrup6 = "Strawberry Syrup";
        String syrup7 = "Caramel syrup";
        System.out.println("\nWhich Syrups Are Valid?");
        System.out.println("Chocolate: " + ValidateInput.validSyrup(syrup1));
        System.out.println("strawberry: " + ValidateInput.validSyrup(syrup2));
        System.out.println("1010: " + ValidateInput.validSyrup(syrup3));
        System.out.println("chocolatesyrup: " + ValidateInput.validSyrup(syrup4));
        System.out.println("syrup: " + ValidateInput.validSyrup(syrup5));
        System.out.println("Strawberry Syrup: " + ValidateInput.validSyrup(syrup6));
        System.out.println("Caramel syrup: " + ValidateInput.validSyrup(syrup7));
    }
}

/*
String addr1 = "123 KitKat Street";
        String addr2 = "my house";
        String addr3 = "123 KitKat St.";
        String addr4 = "13135 Van Buren Blvd";
*/