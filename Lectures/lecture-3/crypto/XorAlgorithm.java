package crypto.crypto;

public  class  XorAlgorithm extends EncryptionAlgorithm {
    public XorAlgorithm (byte key) {
	super(key);
    }

    public IDecrypter getDecrypter () {return new DefaultDecrypter();}
    public IEncrypter getEncrypter () {return new DefaultEncrypter();}
    
    
}
