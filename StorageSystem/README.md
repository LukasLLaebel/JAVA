# Opgave 1 - Basis Classes

Et lageradministrationssystem har et antal lagerpladser, som det kan gemme varer i. Derudover har det
varer som det skal administrere placeringen af.

## Vare

- Har en kategori af varetype (Food, Electronics, Misc)
- Har et beskrivende navn,
- En størrelse opgjort i m^3.

## Lagerplads

- Har et beskrivende navn
- Har en lagerbygning som de hører til under
- En kapacitet opgjort i m^3
  Skriv klasser til at repræsentere begge koncepter med relevante konstruktører, getter/setter-metoder og
  override toString-metoden.

# Opgave 2 - A Storage Box

Et lager har brug for et centraliseret Lager til at håndtere mapningen mellem Varer og Lagerpladser. Du
skal implementere denne klasse med følgende krav

- Din klasse skal initialiseres med et antal lagerplads,
- Metode til at tilføje en vare til en lagerplads
- Metode til at fjerne en vare fra en lagerplads,
- En metode til at lave en liste over varer på en given lagerplads,
- Implementer relevante fejlhåndteringsmekanismer hvis
  - Der tilføjes en vare til en lagerplads uden kapacitet.
  - Der fjernes en vare fra en lagerplads uden varen er på lagerpladsen.
