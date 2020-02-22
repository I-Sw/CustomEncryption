public class Controller {
    public static void main(String args[])
    {
        String encrypted = Encrypt.encryptString("Test");
        System.out.println(encrypted);

        String decrypted = Decrypt.decryptString(encrypted);
        System.out.println(decrypted);
    }
}