import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

public class SecRandom {
    public static void main(String[] args) throws Exception{
        SecureRandom secRandom = SecureRandom.getInstance("SHA1PRNG");
        secRandom.setSeed(711);
        byte[] bytes = new byte[20];
        secRandom.nextBytes(bytes);
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
    }
}
