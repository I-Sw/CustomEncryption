public class Encrypt {

    public static String encryptString(String starterText)
    {
        String encryptedText = "";

        int[] characters = new int[starterText.length()];

        for(int i = 0; i < starterText.length(); i++)
        {
            characters[i] = starterText.charAt(i);
        }

        for(int j = 0; j < characters.length; j++)
        {
            characters[j] = characters[j] + 14;
            characters[j] = characters[j] * 4;
            characters[j] = characters[j] + 6;
            characters[j] = characters[j] * 3;
            characters[j] = characters[j] - 4;
        }

        for(int k = 0; k < characters.length; k++) {
            encryptedText += characters[k];
            encryptedText += getRandomLetter();
        }

        return encryptedText;
    }

    public static char getRandomLetter()
    {
        int randomNum = 97 + (int)(Math.random() * 26);
        return (char)randomNum;
    }
}
