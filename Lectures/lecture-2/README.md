# book
Lav en klasse til at repræsentere en bog. En bog har en titel, en forfatter, et publikationsår, samt et antal sider. Den har muligvis også et ISBN-nummer og eventuelt et ssprog. Skriv relevant konstruktører for hver "type" bog. 

Skriv desuden en metode, der givet en læsehastighed kan beregne hvor lang tid det vil tage at læse bogen.



## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `book`
# Figurer i 2D og 3D
Skriv klasser til at repræsentere de 2 dimensionelle koncepter kvadrater, rektangler og cirkler. Et
kvadrat har en bredde, et rektangel en bredde og længde og en cirkel
har har en radius.  

- Alle klasserne skal have en relevante konstruktører, 
- Alle klasserne skal have metoder til at beregne deres omkreds og
  deres areal. 

## 3D-objekter
Et simpelt 3D-objekt kan repæsenteret som et 2D basis-objektog en
højde. Volumen af et sådan 3D-objekt bliver bu beregnet som 2D-objektetets
areal ganget med højden af   

- Lav en klasser der kan repræsentere et sådan 3DObjekt.
- Klassen skal have en metode til at beregne objektets volumen
- Basen af 3D-objektet skal kunne være et kvadrat, rektangel eller en
cirkel.  

## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `shapes`
# Bogholdning
Vi vil lave et simpelt bogholdningssystem. 

Systemet skal have mulighed for at have flere forskellige konti: 
- nogle konti repræsenterer udgifter
- nogle konti repræsenterer indtægter, og 
- andre konti repræsenterer fysiske bankbøger 

Alle konti har et navn/id og fysiske bankbøger starter med en åbningssaldo.

Selve bogholdningen foregår ved at lave transaktioner mellem konti. En
transaktionen består af fra-konto, en til-konto, et beløb, en dato og
eventuelt en besked om hvad transaktionen omhandler.   

Jeres bogholdningssystem skal kunne udskrive transaktionsloggen for hver konto. 

I behøver ikke lave "brugergrænsefladen" til systemet, det vigtige er
hvordan I får repræsenteret transaktioner og konti. Det er derfor helt
fint "bare" at have en main funktion der opretter konti, laver nogle
transaktioner og udskriver transaktionsloggen.   



## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `bank`
