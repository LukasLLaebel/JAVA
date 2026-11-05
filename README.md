# Opgaver Prøve Eksamen

## Hjælpemidler

Nedenstående skal ses som en positiv-liste af hjælpemidler. Alt der ikke er eksplicit nævnt på listen er ikke
tilladte hjælpemidler

- Kursusnoter, Lærebøger, slides, materialer fra Moodle.
- Lokal versionskontrol (e.g. git)
- Softwareudviklingsmiljø
  - Valgfri Kodeeditor (dog uden generativ ai og agentic ai),
  - Valgfri Compiler
  - Valgfri IDE (dog uden generativ ai og agentic ai)

## Instruktioner

- I prøven skal du skrive kode, der løser de enkelte delopgaver. Interessante designvalg dokumenteres
  eventuelt som kommentarer i koden,
- I prøven kommer du til at skrive kode til et lageradministrationssystem. Prøven er opdelt i delop-
  gaver.

## Aflevering

- Du skal aflevere den samlede kodebase som en !.zip! fil på Moodle afleveringssiden,
- Dine java-filer skal ligge i en src-undermappe,

# How far I have come

- **Task 1 is done**
  - I started by building the basic structure for **Lager** and **Vare** as told.
  - This was made in one Main folder that included these classes as well as a Main class
- **Task 2 is done**
  - I then made an class called **Central** this class extends Lager and has its own functionalities.
  - It still acts as an warehouse but it also stores where every **Vare** goes!
  - Instead of the Central warehouse adds a **Vare** to an **Lager** i made it so its done on the warehouse that gets it
  - The reason for this is:
    - An Central warehouse can send a item to a Warehouse but this does not mean that the item ever gets send
- **Task 3 is done**
  - I started by updating the structure of the system.
  - Before I used ArrayLists by it self. Location and Items in its own. This is not easy to understand what is where.
  - I therefore changed it so the Vare gets an building variable on it and then stored in the Item List ArrayList.
  - To do this I needed to make a class called StoredVare. It was also here i splitted the system into its own files.
  - I then did the task by just going through each location and find a Lager that has space. (function: **Central.findSpace**)

# How to use

i used the normal java compiler

When you are inside the Eksamenssimulering_OOP folder run this command:

```bash
javac -d build StorageSystem/*.java
```

This makes a build parentfolder that includes the StorageSystem subfolder.
This subfolder have the .class files

Then to run the program i use regular java run system.

```bash
java -cp build StorageSystem.Main
```
