package crypto.crypto;

public class  CaesarAlgorithm extends EncryptionAlgorithm {
    public CaesarAlgorithm (byte key) {
	super(key);
    }
    
    public IDecrypter getDecrypter () {return new DefaultDecrypter();}
    
    public IEncrypter getEncrypter () {return new DefaultEncrypter();}
    
    
}
