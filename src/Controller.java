public class Controller {
    public static void main(String args[])
    {
        String encryptedText = Encrypt.encrypt("Text to decrypt goes here!");
        System.out.println(encryptedText);

        System.out.println(Decrypt.decrypt(encryptedText));
    }
}