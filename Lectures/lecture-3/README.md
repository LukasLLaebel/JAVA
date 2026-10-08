# Krypteringsalgoritme
'I denne opgave vil vi lave et program der kan kryptere/dekryptere en
fil. Selve krypteringsalgoritmen og krypteringsnøglen skal kunne vælges af
brugeren (for at gøre vores liv så nemt som muligt, så kan nøgler kun
være 1 byte store). 

Størstedelen af opgaven er sat op i pakken `crypto/crypto`. 
- `crypto.crypto.IDecrypter` er interface som dekrypteringsdelen af en algorithme skal implementere,
- `crypto.crypto.IENcrypter` er interface som enkrypteringsdelen af en algorithme skal implementere,
- `crypto.crypto.DefautltEncrypter` en implementatoin af `IEncrypter` som faktisk ikke krypterer,
- `crypto.crypto.DefautltDecrypter` en implementatoin af `IDecrypter` som faktisk ikke dekrypterer,
- `crypto.crypto.EncryptionAlgorithm` er en abstrakt klasse som tag krypteringsnøglen i dens konstruktør
- `crypto.crypto.CaesarAlgorithm` nedarver fra `EncryptionAlgorithm`. Intentionen er den skal implementere en Caesar-kyptering. men det gør den ikke p.t.. Du skal implementere kryptering/dekrypterings-delen
- `crypto.crypto.XorAlgorithm` nedarver fra `EncryptionAlgorithm`. Intentionen er den skal implementere en Xor-kyptering (i.e. xor hver byte med keyen). men det gør den ikke p.t.. Du skal implementere kryptering/dekrypterings-delen. 

## Opgaver
- Orienter dig i filerne,
  - Synes det designet er fornuftigt? Ville du gør noget anderledes? 
- Implementer den manglende funktionalitet (krypteringerne)
- Tilføj en klasse `crypto.crypto.MultiEncryption` der først krypterer med Caesar-kryptering og efterfølgende krypterer med Xor-kryptering. 

 

## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `crypto`
# farver
Definer et interface `IFarve`. Det skal have tre funktioner
- `getRed()`
- `getBlue()`, og 
- `getGreen()` 

Der hver især returnerer et tal mellem 0 og 255 (i.e. hver komponent i en RGB-tripel).

- Lav en "direkte" `RGB`-implementation af `IFarve` 
- Lav en `HSL`-implementatio af `IFarve` (se eventuelt her for hvordan man konverterer mellem HSL og RGB https://www.baeldung.com/cs/convert-color-hsl-rgb) 

## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `farver`
# lister
Til denne opgave må du ikke benytte javas indbyggede Collections (e.g. ArrayLists). 

Overvej følgende `queue-interface`: 

```
public interface IQueue {
	//Add element to the queue
	void enqueue(Object o)
	
	// Read next element
	Object front ();
	
	
	// Remove next element
	void pop ();
	// is the queue empty?
	boolean	empty()
}
```

- Lav en implementation, der benytter et array som "container". Den skal dynamisk udvides når kapaciteten overskrides
- Lav en implementation, der implementeres som Single-linked list.
- Afprøv dine implementationer i en main funktion.
- Lav kode der viser brugen af polymorfisme.  


## Generisk Queue
Ændr interfacet (og din implementation) til at være generisk. 



## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `lister`
# Dagbog
Din opgave i denne opgave er at lave en dagbogsapplikation. En dagbog har et antal sider, og dagbogsside har en Dato samt noget indhold. Da det er en dagbog skal indholdet af dagbogen være hemmeligholdt --- det vil sige at alle sider i en dagbog skal være krypteret (i.e. krypteret). Overvej at benytte krypteringsalgoritmerne fra krypteringsopgaven. 

- Du behøver *ikke* implementere en "flot" brugergrænseflade --- bare lav en main funktion der afprøver dit design på fornuftig vis 


## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `diary`
