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

 
