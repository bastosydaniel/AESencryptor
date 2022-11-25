import javax.crypto.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, IOException {
    	
    	File file = new File(args[0]);
    	FileInputStream fis = new FileInputStream(file);
    	
    	
        KeyGenerator keygenerator = KeyGenerator.getInstance("AES");
        SecretKey desKey = keygenerator.generateKey();

       if (args[0] == "aguasdemarco.txt") {
    	      byte[] resposta = (new Encriptar()).textoEncriptado(desKey,fis.readAllBytes());
    	    	Path p = Paths.get(" aguasdemarco.cripto");
    	    	Files.write(p, resposta);
    	    	 
       }else if(args[0] == "aguasdemarco.cripto") {
    	   String resposta = (new Decriptar()).textoClaro(fis.readAllBytes(), desKey);
	    	Path p = Paths.get(" aguasdemarcoemclaro.txt");
	    	Files.writeString(p, resposta, null);
       }else {
    	   System.out.println("System error! favor inserir o arquivo como parametro ");
       }
    }
}
