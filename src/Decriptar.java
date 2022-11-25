import javax.crypto.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Decriptar {
    String textoClaro(byte[] cipher, SecretKey desKey) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        Cipher desCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        desCipher.init(Cipher.DECRYPT_MODE, desKey);
        return new String(desCipher.doFinal(cipher), StandardCharsets.UTF_8);
    }
}
