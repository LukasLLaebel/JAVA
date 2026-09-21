# Wordle
 Skriv et program der tillader en bruger at
Wordle. Det vil sige, at computeren først skal vælge et tilfældigt ord
(fra en liste potentielle ord). Spilleren skal herefter forsøge at
gætte ordet efter følgende procedure:

- Spilleren gætter på et ord,
- Computeren tjekker om spillerens gæt er korrekt.
  
  - Hvis ordet er korrekt har spilleren vundet,
  - Alternativt skal computeren fortælle
    - hvilke bogstaver er placeret korrekt,
    - hvilke bogstaver fra gættet som optræder i ordet (men ikke er placerede korrekt), og
    - hvilke der er helt forkerte.

  Dette gøres ved  at udskrive en streng hvori korrekte placerede
    - bogstaver bliver gentaget, forkert placerede bogstaver som
    - optræder i det hemmelige ord bliver vist med en /, og helt
    - forkerte bogstaver vises med en _. 
  
- Loop indtil spilleren har vundet.   

## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `wordle`
# Game of Life
I denne opgave skal vi lave en simulation af Conways "Game of Life". 

Princippet for "Game of Life" er simpelt. Du har et NxN grid med  et antal celler på.
Hver celle kan enten være leven eller død. Celler skifter status efter følgende regler:
- En levende celle dør hvis den har mindre end to levende naboer
- En levende celle med 2 eller tre levende naboer  overlever til næste generation
- En levende celle med mere end tre levende naboer dør,
- En død celle med præcis tre levende naboer bliver levende. 

For hver step i simulationen skal de her regler bruges samtidig. 

Visualiser tilstanden efter hver simulationsstep i terminalen. 

## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `life`
# Cæsar-kryptering
I denne opgave vil vi implementere en af de simpleste former for
kryptering: Cæsar-kryptering.   Cæsar-kryptering går i al sin
enkelthed ud på, at hver karakter i plain-text inputtet bliver
adderet med et offset (nøglen) i cipher-texten. Dekryptering af en cipher-text er
simpel da man blot fratrækker offsetet igen. 


## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `caesar_kryptering`
# Konsonanter
Skriv et program der læser en string fra standard in og udskskriver om
det først bogstav i string'en er en konsonant eller en vokal. 

## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `consonants`
# Primtal
a) Skriv et program der finder alle primtal mellem 2 og 100. 
b) Omskriv dit program til at læse nedre og øvre grænse fra standard
   in 
c) Omskrive dit program til at bruge overføre grænseværdierne som
   parameter til programmet

## Opgaveplacering
Løsninger til disse opgaver skal placeres i mappen `primes`
