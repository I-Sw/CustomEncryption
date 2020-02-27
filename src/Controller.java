public class Controller {
    public static void main(String args[])
    {
        String encryptedText = Encrypt.encrypt("Finally got this hellish program working?");
        System.out.println(encryptedText);

        System.out.println(Decrypt.decrypt(encryptedText));
    }
}