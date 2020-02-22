public class Decrypt {
    public static String decryptString(String encryptedText)
    {
        int[] letters = new int[encryptedText.length()];
        String decryptedText = "";
        int lastLetter = 0, numLetters = 0;

        for(int i = 0; i < encryptedText.length(); i++)
        {
            if(!Character.isDigit(encryptedText.charAt(i)))
            {
                String letter = encryptedText.substring(lastLetter,i-1);
                lastLetter = i;
                letters[numLetters] = Integer.parseInt(letter);
                numLetters++;
            }
        }

        for(int j = 0; j < numLetters; j++)
        {
            letters[j] = letters[j] - 14;
            letters[j] = letters[j] / 4;
            letters[j] = letters[j] - 6;
            letters[j] = letters[j] / 3;
            letters[j] = letters[j] + 4;
        }

        return decryptedText;
    }
}
