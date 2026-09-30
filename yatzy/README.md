# Opgavebeskrivelse – Yatzy i Java

## Formål

Formålet med opgaven er at udvikle et simpelt **Yatzy-spil i Java**.

Spillet skal kunne spilles af én eller flere spillere. Spillerne skal på skift slå med terninger, vælge hvilke terninger de vil beholde, og forsøge at opnå så mange point som muligt.

Opgaven skal samtidig give erfaring med blandt andet:

- Klasser og objekter
- Metoder
- Array eller `ArrayList`
- Betingelser og løkker
- Input fra brugeren
- Tilfældige tal
- Objektorienteret programmering
- Håndtering af spiltilstand
- Pointberegning

---

# Spilregler

## Terninger

Spillet bruger **5 terninger**.

Hver terning har en værdi fra **1 til 6**.

Når en spiller starter sin tur, kastes alle fem terninger.

Spilleren må derefter vælge, hvilke terninger der skal beholdes.

De resterende terninger kastes igen.

En spiller må maksimalt kaste terningerne **3 gange pr. tur**.

Efter det tredje kast skal spilleren vælge en pointkategori.

---

# Pointkategorier

Hver kategori kan kun bruges **én gang pr. spiller**.

## Ettere

Giver point for alle terninger, der viser `1`.

Eksempel:

```text
1 1 3 4 6
```

Point:

```text
1 + 1 = 2 point
```

---

## Toere

Giver point for alle terninger, der viser `2`.

Eksempel:

```text
2 2 2 4 6
```

Point:

```text
2 + 2 + 2 = 6 point
```

---

## Treere

Giver point for alle terninger, der viser `3`.

---

## Firere

Giver point for alle terninger, der viser `4`.

---

## Femmere

Giver point for alle terninger, der viser `5`.

---

## Seksere

Giver point for alle terninger, der viser `6`.

---

# Kombinationer

Ud over de enkelte tal findes der forskellige kombinationer.

## Ét par

To terninger med samme værdi.

Eksempel:

```text
3 3 2 5 6
```

Point:

```text
3 + 3 = 6
```

Hvis der er flere par, bruges det højeste par.

---

## To par

To forskellige par.

Eksempel:

```text
2 2 5 5 6
```

Point:

```text
2 + 2 + 5 + 5 = 14
```

---

## Tre ens

Tre terninger med samme værdi.

Eksempel:

```text
4 4 4 2 6
```

Point:

```text
4 + 4 + 4 = 12
```

---

## Fire ens

Fire terninger med samme værdi.

Eksempel:

```text
6 6 6 6 2
```

Point:

```text
6 + 6 + 6 + 6 = 24
```

---

## Lille straight

Fem terninger i rækkefølge:

```text
1 2 3 4 5
```

eller

```text
2 3 4 5 6
```

Giver **15 point**.

---

## Stor straight

Fem terninger i rækkefølge:

```text
2 3 4 5 6
```

Giver **20 point**.

---

## Fuldt hus

Et par og tre ens.

Eksempel:

```text
2 2 5 5 5
```

Giver **25 point**.

---

## Chance

Alle terningernes øjne lægges sammen.

Eksempel:

```text
2 3 4 5 6
```

Point:

```text
2 + 3 + 4 + 5 + 6 = 20
```

---

## Yatzy

Alle fem terninger viser det samme tal.

Eksempel:

```text
6 6 6 6 6
```

Giver **50 point**.

---

# Spillets gang

Et spil foregår på følgende måde:

1. Spillet starter.
2. Spillerne indtastes eller oprettes.
3. Den første spiller starter sin tur.
4. Alle fem terninger kastes.
5. Spilleren vælger eventuelt terninger, der skal beholdes.
6. De resterende terninger kastes igen.
7. Dette kan gentages, indtil spilleren har brugt sine tre kast.
8. Spilleren vælger en pointkategori.
9. Pointene beregnes.
10. Turen går videre til næste spiller.
11. Når alle kategorier er udfyldt, slutter spillet.
12. Spilleren med flest point vinder.

---

# Krav

## Funktionelle krav

Programmet skal som minimum kunne:

- [ ] Oprette mindst én spiller.
- [ ] Understøtte flere spillere.
- [ ] Kaste fem terninger.
- [ ] Generere tilfældige terningværdier fra 1–6.
- [ ] Vise terningerne til spilleren.
- [ ] Give spilleren mulighed for at vælge terninger, der skal beholdes.
- [ ] Give spilleren maksimalt tre kast pr. tur.
- [ ] Lade spilleren vælge en pointkategori.
- [ ] Beregne point automatisk.
- [ ] Forhindre en kategori i at blive brugt mere end én gang.
- [ ] Holde styr på hver spillers samlede point.
- [ ] Skifte tur mellem spillerne.
- [ ] Afslutte spillet, når alle kategorier er brugt.
- [ ] Vise en scoreboard.
- [ ] Vise vinderen ved spillets afslutning.

---

# Tekniske krav

Programmet skal udvikles i **Java**.

Programmet skal anvende objektorienteret programmering.

Der skal som minimum være flere relevante klasser.

Et muligt design kunne være:

```text
Game
 ├── Player
 ├── Dice
 ├── ScoreCard
 └── ScoreCalculator
```

### Game

Ansvarlig for selve spillet.

Eksempel på ansvar:

- Starte spillet
- Skifte mellem spillere
- Holde styr på spillets tilstand
- Afslutte spillet

### Player

Repræsenterer en spiller.

Kan eksempelvis indeholde:

- Navn
- Score
- Scorecard
- Terninger

### Dice

Repræsenterer en enkelt terning.

Skal kunne:

- Kaste terningen
- Gemme dens værdi
- Returnere dens værdi

### ScoreCard

Holder styr på spillerens valgte kategorier og point.

Eksempel:

```text
Ettere       3
Toere        6
Treere       -
Firere       12
Femmere      -
Seksere      18
Par          10
To par       -
Tre ens      15
Fire ens     -
Lille straight 15
Stor straight  -
Fuldt hus    25
Chance       21
Yatzy        -
```

### ScoreCalculator

Ansvarlig for at beregne point for de forskellige kategorier.

---

# Brugerinput

Spillet skal kunne modtage input fra brugeren via konsollen.

Eksempel:

```text
Lukas' tur

Kast 1:
[2] [4] [4] [5] [6]

Vælg terninger du vil beholde:
2 3

Kast 2:
[2] [4] [4] [3] [6]

Vælg terninger du vil beholde:
1 2 3

Kast 3:
[2] [4] [4] [3] [5]

Vælg en kategori:

1. Ettere
2. Toere
3. Treere
4. Firere
5. Femmere
6. Seksere
7. Par
8. To par
9. Tre ens
10. Fire ens
11. Lille straight
12. Stor straight
13. Fuldt hus
14. Chance
15. Yatzy

Dit valg: 13

Fuldt hus: 25 point
```

---

# Fejlhåndtering

Programmet skal håndtere ugyldigt input.

Eksempler:

- Spilleren indtaster et bogstav i stedet for et tal.
- Spilleren vælger en kategori, der allerede er brugt.
- Spilleren vælger en kategori uden at have et gyldigt resultat.
- Spilleren vælger en terning, der ikke findes.
- Spilleren forsøger at kaste mere end tre gange.

Programmet skal ikke gå ned, når brugeren indtaster ugyldigt input.

---

# Minimumskrav

For at programmet kan betragtes som færdigt, skal følgende være implementeret:

- [ ] Java-programmet kan startes fra en `main`-metode.
- [ ] Der kan oprettes spillere.
- [ ] Fem terninger kan kastes.
- [ ] Terninger kan beholdes mellem kast.
- [ ] En spiller har maksimalt tre kast pr. tur.
- [ ] Point kan beregnes.
- [ ] Scoreboard fungerer.
- [ ] Spillere skiftes til at spille.
- [ ] Alle kategorier kan anvendes.
- [ ] Spillet kan afsluttes.
- [ ] Vinderen kan findes.

---

# Ekstra funktionalitet

Hvis minimumskravene er opfyldt, kan spillet udvides med ekstra funktionalitet.

Eksempler:

- [ ] Grafisk brugerinterface med Java Swing eller JavaFX.
- [ ] Gemme scores til en fil.
- [ ] Highscore-liste.
- [ ] Mulighed for at starte et nyt spil.
- [ ] Computerstyrede spillere.
- [ ] Animationer ved terningkast.
- [ ] Statistik over tidligere spil.
- [ ] Mulighed for at ændre antallet af spillere.
- [ ] Lyd ved terningkast.
- [ ] Online multiplayer.

---

# Forslag til projektstruktur

```text
src/
├── Main.java
├── Game.java
├── Player.java
├── Dice.java
├── ScoreCard.java
└── ScoreCalculator.java
```

---

# Aflevering

Projektet skal afleveres som et Java-projekt.

Projektet skal indeholde:

- Java-kildekode
- En `README.md`
- Dokumentation af klassernes ansvar
- Dokumentation af spillets regler
- Eventuelle tests

Koden skal være struktureret og følge grundlæggende principper for objektorienteret programmering.

## Målet

Målet er at udvikle et fungerende Yatzy-spil, hvor spillets regler er implementeret i Java, og hvor programmets forskellige dele er opdelt i relevante klasser med hvert sit ansvar.
