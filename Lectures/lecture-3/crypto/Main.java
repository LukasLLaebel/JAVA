package crypto;

import java.util.Arrays;
import crypto.crypto.EncryptionAlgorithm;
import crypto.crypto.CaesarAlgorithm;
import crypto.crypto.XorAlgorithm;

public class Main {
    public static byte[] readBytes () throws java.io.IOException {
	return System.in.readAllBytes();
    }
    
    public static void writeBytes (byte[] bs) throws java.io.IOException {
	System.out.write(bs);
    }
    
    
    public static void main (String[] args) throws java.io.IOException {
	if (args.length < 3) {
	    System.out.println ("Missig arguments");
	    return;
	}

	byte[] data = readBytes();
	byte key = args[0].getBytes()[0];

	EncryptionAlgorithm algorithm;
	if (args[1].equals ("Caesar")) {
	    algorithm = new CaesarAlgorithm(key);
	}

	else {
	    algorithm = new XorAlgorithm(key);
	}

	if (args[2].equals ("enc")) {
	    data = algorithm.getEncrypter().encrypt(data);
	}

	else {
	    data = algorithm.getDecrypter().decrypt(data);
	}
	
	writeBytes(data);
	
    }
}
