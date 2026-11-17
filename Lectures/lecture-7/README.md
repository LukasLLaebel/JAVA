# 1. Klasserne `Spillekort` og `KortSpil`

I en tidligere lektion arbejdede vi med klassen `Spillekort`, som repræsenterer et enkelt kort i et kortspil.

Hvis du ikke nåede at programmere klassen sidste gang, kan du starte med denne opgave.

**Opgavebeskrivelse**

I min løsning har jeg implementeret klassen `KortSpil`, som repræsenterer de 52 kort i et almindeligt spil kort (uden jokere).

Vi har tidligere anbefalet at indlejre `Spillekort` statisk i `KortSpil`.

**Opgaver:**

- [ ] Implementer klassen `Spillekort`, hvis du ikke allerede har gjort det.
- [ ] Undersøg løsningen, hvor `Spillekort` er indlejret statisk i `KortSpil`.
- [ ] Demonstrer med et eksempel, at du stadig kan tilgå `Spillekort` direkte uden først at oprette et objekt af `KortSpil`.

**Relevant materiale:** [Opgaven om Spillekort](https://people.cs.aau.dk/~normark/prog1-01/html/noter/java-oop-kort-eksempel-note-exercise-1.html)

---

# 2. Exceptions – Undtagelser i tallæsningsprogrammet

I lektion 2 arbejdede vi med et program, der indlæser et tal fra tastaturet ved at læse en række enkelte tegn.

Find din tidligere løsning frem, eller tag udgangspunkt i min løsning fra filen `talLaesning.java`.

## Del 1 – Forståelse af IOException

Undersøg følgende:

- [ ] Hvorfor erklærer metoden `readInt()` at den kan kaste `IOException`?
- [ ] Find det sted i Java API-dokumentationen, der beskriver, at der kan forekomme en exception i metoden `readInt()`.

## Del 2 – Håndtering af IOException

Lav en variant af programmet fra lektion 2, hvor `IOException` håndteres.

- [ ] Implementer håndtering af `IOException`.
- [ ] Beslut, hvordan programmet skal reagere, hvis der opstår en IO-undtagelse.
- [ ] Et eksempel kunne være at returnere `0`, hvis der opstår en fejl under læsning fra standard input.

## Del 3 – Egen exception-klasse

Der er også problemer, hvis brugeren indtaster bogstaver eller specialtegn i metoden `readInt()`.

Derfor skal du selv definere en mere specifik exception-klasse.

- [ ] Opret en exception-klasse med navnet `NumberReadException`.
- [ ] Undersøg, hvordan du kan kaste en instans af denne exception.
- [ ] Tilpas `readInt()`, så den kaster `NumberReadException`, hvis brugeren indtaster et bogstav eller et specialtegn.

---

# 3. Rektangler – Kvadrater i forhold til rektangler

Denne opgave tager udgangspunkt i en tidligere opgave om rektangler.

## Del 1 – Overvej klassernes relation

Lav en klasse `Square` (dansk: Kvadrat).

Der er et nært forhold mellem kvadrater og rektangler, men hvordan skal dette afspejles i objektorienteret programmering?

Overvej følgende:

- Skal `Rectangle` arve fra `Square`, eller skal `Square` arve fra `Rectangle`?
- Kan `Square` betragtes som en specialisering af `Rectangle`?
- Eller er `Rectangle` en udvidelse af `Square`?
- Hvilken løsning giver bedst mening objektorienteret?

## Del 2 – Implementering

Implementer klassen `Square` ud fra dine overvejelser.

**Krav til implementeringen:**

- [ ] Opret klassen `Square`.
- [ ] Implementer passende konstruktører svarende til dem i `Rectangle`.
- [ ] Sørg for, at konstruktørerne i `Square` og `Rectangle` anvender hinanden via `super(...)`.
- [ ] Sørg for, at de to klasser ligner hinanden så meget som muligt, bortset fra konstruktørerne.

Du kan tage udgangspunkt i min implementering af `Rectangle`, inklusive de tilhørende hjælpeklasser.

---

# 4. Kortbunke – Klassen `Kortbunke`

I forlængelse af opgaven om `Spillekort` skal vi nu programmere klassen `Kortbunke`.

En `Kortbunke` repræsenterer en bunke af kort. Den kan eksempelvis bruges til:

- Et komplet spil kort.
- De kort, en spiller har på hånden.

## Del 1 – Valg af datastruktur

Ideen er at benytte en Java Collection-klasse som grundlag for implementationen.

Overvej følgende:

- [ ] Hvilken Collection-klasse egner sig bedst til formålet?
- [ ] Skal `Kortbunke` arve fra en Collection-klasse?
- [ ] Skal `Kortbunke` i stedet være klient af en Collection-klasse?
- [ ] Eller skal den blot implementere et Collection-interface?

Vi ønsker at bevare en bestemt rækkefølge mellem kortene, så vi eksempelvis kan tale om det øverste og nederste kort.

## Del 2 – Implementering af funktionalitet

Klassen `Kortbunke` skal understøtte følgende operationer – hverken flere eller færre:

- [ ] Fjern og returner det øverste kort.
- [ ] Læg et nyt kort oven på bunken.
- [ ] Læg et nyt kort nederst i bunken.
- [ ] Returner, om bunken er tom.
- [ ] Bland kortene tilfældigt.
- [ ] Sorter kortene i naturlig orden:
  - Ruder før hjerter.
  - Hjerter før klør.
  - Klør før spar.
- [ ] Returner en `Iterator`, som gennemløber kortene i bunken.

**Vigtigt:** Datarepræsentationen skal være privat i klassen.

## Del 3 – Konstruktører

Det vil være hensigtsmæssigt at implementere følgende tre konstruktører:

| Konstruktør  | Funktion                                 |
| ------------ | ---------------------------------------- |
| Tom bunke    | Opretter en tom kortbunke.               |
| Givne kort   | Opretter en kortbunke med bestemte kort. |
| Komplet spil | Opretter en kortbunke med alle 52 kort.  |

- [ ] Implementer de tre konstruktører.
- [ ] Overvej, hvordan de skal adskilles parametermæssigt, så Java kan skelne mellem dem.

---

# 5. Krig – Et simpelt kortspil

I forlængelse af opgaverne om `Spillekort` og `Kortbunke` skal vi programmere en applikation, der kan gennemføre kortspillet **Krig**.

Spillet spilles normalt af to spillere, men i denne opgave styrer computeren begge spillere.

Målet er at erobre alle modspillerens kort.

## Del 1 – Spillets opsætning

- [ ] Opret et komplet spil kort med 52 kort.
- [ ] Bland kortene.
- [ ] Del kortene ligeligt mellem to spillere.
- [ ] Sørg for, at hver spiller har sin egen `Kortbunke`.

## Del 2 – Spillets regler

Spillet foregår i runder, hvor begge spillere trækker deres øverste kort.

**Almindelig duel:**

1. Begge spillere trækker det øverste kort fra deres bunke.
2. Kortene sammenlignes.
3. Spilleren med det største kort vinder begge kort.
4. Vinderen lægger kortene nederst i sin egen bunke.

**Krig:**

Hvis begge spillere trækker kort af samme størrelse, opstår der krig.

1. De to ens kort lægges i en fælles pulje.
2. Hver spiller lægger yderligere to kort i puljen fra toppen af sin bunke.
3. De næste øverste kort sammenlignes.
4. Spilleren med det største kort vinder hele puljen.
5. Hvis kortene igen er ens, gentages krigen, og puljen bliver større.

Spillet fortsætter, indtil en spiller mister alle sine kort.

## Del 3 – Implementering

- [ ] Implementer spillets grundlæggende logik.
- [ ] Implementer sammenligning af kort.
- [ ] Implementer håndtering af almindelige dueller.
- [ ] Implementer håndtering af krig og fælles puljer.
- [ ] Sørg for, at vinderen får alle kortene fra puljen.
- [ ] Sørg for, at spillet afsluttes, når en spiller ikke har flere kort.

## Del 4 – Udskrivning af spillets forløb

Programmet skal udskrive et spor af spillet, så man kan følge med i, hvad der sker.

- [ ] Udskriv resultatet af hver duel.
- [ ] Udskriv, når der opstår krig.
- [ ] Udskriv, hvem der vinder de enkelte dueller og krige.
- [ ] Udskriv løbende, hvor mange kort hver spiller har tilbage.
- [ ] Udskriv den endelige vinder af spillet.

**Tip:** Det er en fordel at kunne følge antallet af kort hos hver spiller gennem hele spillet.
