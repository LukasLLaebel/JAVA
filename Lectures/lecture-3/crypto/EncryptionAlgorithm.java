package crypto.crypto;

public abstract class  EncryptionAlgorithm {
    EncryptionAlgorithm (byte key) {
	this.key = key;
    }
    
    public abstract IDecrypter getDecrypter ();
    
    public abstract IEncrypter getEncrypter ();
    protected byte getKey() { return key;}
    private byte key; 
}
