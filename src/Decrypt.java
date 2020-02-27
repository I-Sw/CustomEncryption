public class Decrypt {
    public static String decrypt(String encryptedText)
    {
        String decryptedText = "";
        int encryptionCode = 0, segmentStart = 0, counter = 0;

        for(int i = 0; i < encryptedText.length(); i++)
        {
            //Tests if the current character is in the ascii range for a capital letter
            if((int)encryptedText.charAt(i) >= 65 && (int)encryptedText.charAt(i) <= 90)
            {
                char numCode = encryptedText.charAt(i+1);
                encryptionCode = Character.getNumericValue(numCode);
                segmentStart = (i+2);
                counter = segmentStart;

                //Tests if the current character is outside of the ascii range for a capital letter
                while(counter < encryptedText.length() && ((int)encryptedText.charAt(counter) < 65 || (int)encryptedText.charAt(counter) > 90))
                {
                    counter++;
                }

                String segment = encryptedText.substring(segmentStart,counter);

                if(encryptionCode == 1)
                {
                    decryptedText += decryption1(segment);
                }

                if(encryptionCode == 2)
                {
                    decryptedText += decryption2(segment);
                }

                if(encryptionCode == 3)
                {
                    decryptedText += decryption3(segment);
                }
            }
        }

        return decryptedText;
    }

    private static char decryption1(String encryptedSegment)
    {
        char decryptedChar = ' ';
        int charAscii = Integer.parseInt(encryptedSegment);
        charAscii = charAscii -99;
        decryptedChar = (char)charAscii;
        return decryptedChar;
    }

    private static char decryption2(String encryptedSegment)
    {
        char decryptedChar = ' ';
        int charAscii = Integer.parseInt(encryptedSegment);
        charAscii = charAscii - 150;
        charAscii = charAscii / 3;
        decryptedChar = (char)charAscii;
        return decryptedChar;
    }

    private static char decryption3(String encryptedSegment)
    {
        char decryptedChar = ' ';
        char divisorAsChar = encryptedSegment.charAt(0);
        int divisor = divisorAsChar - 32;
        String charSubstring = encryptedSegment.substring(1,(encryptedSegment.length()));
        int charAscii = Integer.parseInt(charSubstring);
        charAscii = charAscii / divisor;
        decryptedChar = (char)charAscii;
        return decryptedChar;
    }
}
