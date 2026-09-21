I denne opgave skal vi lave en simulation af Conways "Game of Life". 

Princippet for "Game of Life" er simpelt. Du har et NxN grid med  et antal celler på.
Hver celle kan enten være leven eller død. Celler skifter status efter følgende regler:
- En levende celle dør hvis den har mindre end to levende naboer
- En levende celle med 2 eller tre levende naboer  overlever til næste generation
- En levende celle med mere end tre levende naboer dør,
- En død celle med præcis tre levende naboer bliver levende. 

For hver step i simulationen skal de her regler bruges samtidig. 

Visualiser tilstanden efter hver simulationsstep i terminalen. 
