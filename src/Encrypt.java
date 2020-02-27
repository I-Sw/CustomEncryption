public class Encrypt {
    public static String encrypt(String starterText) {
        String encryptedText = "";
        int randomNum = 0;

        //Using a for loop process each letter of starterText individually
        for (int i = 0; i < starterText.length(); i++)
        {
            //Prefix each character with a capital letter, signalling a new character
            //Followed by a single number which signals the type of encryption run or decryption to use
            encryptedText += getRandomLetter();
            randomNum = (int)(1 + Math.random() * 3);
            encryptedText += randomNum;

            if(randomNum == 1)
            {
                encryptedText += encryption1(starterText.charAt(i));
            }

            if(randomNum == 2)
            {
                encryptedText += encryption2(starterText.charAt(i));
            }

            if(randomNum == 3)
            {
                encryptedText += encryption3(starterText.charAt(i));
            }
        }

        return encryptedText;
    }

    public static char getRandomLetter()
    {
        int randomNum = 65 + (int)(Math.random() * 26);
        return (char)randomNum;
    }

    //Encryption method 1 takes the ascii value of the letter and adds 99 to it
    private static String encryption1(char letter)
    {
        String returnString = "";
        returnString += (99 + (int)letter);

        return returnString;
    }

    //Encryption method 2 takes the ascii value of the letter, multiplies it by 3 and then adds 150
    private static String encryption2(char letter)
    {
        String returnString = "";

        int encryptLetter = (int)letter;
        encryptLetter *= 3;
        encryptLetter += 150;
        returnString += encryptLetter;

        return returnString;
    }

    //Encryption 3 Tests to see that the ascii value of the letter multiplied by certain numbers is reverse divisible by that number
    //If it tests true a string containing a symbol and the resulting multiplied values is added to the encrypted string
    //The symbol can be used by the decryption methods to find the number to divide with by subtracting 32 from the symbols ascii value
    private static String encryption3(char letter)
    {
        String returnString = "";

        if(((int)letter * 3) % 3 == 0)
        {
         returnString += Character.toString((char)32 + 3);
         returnString += (int)letter * 3;
         return returnString;
        }

        if(((int)letter * 4) % 4 == 0)
        {
            returnString += Character.toString((char)32 + 4);
            returnString += (int)letter * 4;
            return returnString;
        }

        if(((int)letter * 5) % 5 == 0)
        {
            returnString += Character.toString((char)32 + 5);
            returnString += (int)letter * 5;
            return returnString;
        }

        if(((int)letter * 6) % 6 == 0)
        {
            returnString += Character.toString((char)32 + 6);
            returnString += (int)letter * 6;
            return returnString;
        }

        else
        {
            returnString += Character.toString((char)33);
            returnString += (int)letter;
            return returnString;
        }
    }
}
