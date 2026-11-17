# Kasseapparat

Du skal implementere en simpel kasseapparat-applikation. Den skal kunne håndtere følgende:

- [ ] **Kassebon:** En bon består af et antal betalingslinjer.
  - [ ] Hver betalingslinje skal indeholde:
    - En beskrivelse.
    - En pris eksklusiv moms.
    - En pris inklusiv moms.
  - [ ] Mulighed for at beregne den samlede pris inklusiv moms.
  - [ ] Mulighed for at beregne den samlede pris eksklusiv moms.

- [ ] **Udskrivning af kasseboner:**
  - [ ] Mulighed for at udskrive en kassebon til terminalen.
  - [ ] Mulighed for at udskrive en kassebon til en fil.

- [ ] **Vare:** En vare skal indeholde:
  - [ ] Et navn.
  - [ ] En pris.
  - [ ] En varekategori (overvej at bruge en `enum`).

- [ ] **Varesortiment:**
  - [ ] Skal indeholde en samling af varer.
  - [ ] Skal mappe en stregkode (`String`) til en vare.
  - [ ] Mulighed for at slå en vare op ved hjælp af dens stregkode.

- [ ] **Betalingsstrategi:**
  - [ ] Skal indeholde en metode til at modtage betaling.
  - [ ] Metoden skal modtage et beløb som parameter.
  - [ ] Metoden skal returnere `true`, hvis betalingen lykkes, og `false`, hvis betalingen fejler.
  - [ ] Implementer forskellige betalingsstrategier:
    - [ ] Dankort.
    - [ ] Kontant.

- [ ] **Momsberegner:**
  - [ ] Skal kunne modtage en vare og beregne momsen på varen.
  - [ ] Implementer to forskellige momsberegnere:
    - [ ] Standardmomsberegner.
    - [ ] Differentieret momsberegner (baseret på varekategorier).

- [ ] **Kasseapparat:** Et kasseapparat skal:
  - [ ] Indeholde en kassebon.
  - [ ] Mulighed for løbende at tilføje nye varer til kassebonen.
  - [ ] Mulighed for at tilføje varer via en metode, der modtager en stregkode (`String`).
    - [ ] Stregkoden skal slås op i varesortimentet.
    - [ ] Den tilhørende vare skal tilføjes til kassebonen.
  - [ ] Mulighed for at betale for varerne.
    - [ ] Skal kunne benytte forskellige betalingsstrategier (f.eks. Dankort eller kontant).
    - [ ] Skal beregne det samlede beløb, der skal betales.
    - [ ] Hvis betalingen lykkes:
      - [ ] Skal kassebonen udskrives.
      - [ ] Skal kassebonen nulstilles til næste køb.
    - [ ] Hvis betalingen fejler:
      - [ ] Skal kassebonen bevares, så kunden kan forsøge at betale igen.

- [ ] **Observer:** Kasseapparatet skal understøtte en observer-mekanisme.
  - [ ] Definer et observer-interface.
  - [ ] Mulighed for at tilføje observers til kasseapparatet.
  - [ ] Mulighed for at fjerne observers fra kasseapparatet.
  - [ ] Giv observers besked, når relevante hændelser sker (f.eks. når en vare tilføjes, eller når et køb gennemføres).
  - [ ] Implementer mindst én konkret observer.
