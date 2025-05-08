# Huistaak 2 - Oefeningen Java

Maak voor de case van de duikschool een standaard Java applicatie die je toelaat om via het toetsenbord een aantal duiken te loggen en die achteraf in de console op te lijsten.

Opgelet: dit is een klassieke programmeeroefening en dient enkel om Java te oefenen. De werkwijze maakt geen onderdeel uit van de Software Engineering Loop die we gaan zien in deze cursus.

Gebruik van AI is toegelaten voor het opzoeken van Java syntax en toepassing er van.

## Gegeven
- klasse Dive.java
- enum Certification.java

## Opdracht
1. Maak in IntelliJ een standaard Java applicatie aan
2. Kopieer Dive.java en Certification.java naar dezelfde map waar Main.java zich bevindt
3. In Dive.java
   - vervolledig de methode ```isValid()```, hierbij volgende regels volgend:
     - als een duik langer duurt dan 60 min is deze ongeldig (false)
     - als de diepte groter is dan 18m en het certificaat is OWD is de duik ongeldig (false)
     - als de diepte groter is dan 30m en het certificaat is AOWD of DI is de duik ongeldig (false)
     - in alle andere gevallen is de duik geldig (true)
   - vervolledig de methode ```toString()``` zodat de tekstuele representatie van de duik overeenkomt met volgend voorbeelden:
   ```
   Duik: datum=2025-05-02, locatie='Blue Hole', diepte=25m, duur=54min, geldig

   Duik: datum=2025-03-17, locatie='SS Thistlegorm, Egypte', diepte=32m, duur=50min, ongeldig
   ```
4. In Main.java, programmeer volgende functionaliteiten, baseer je hiervoor op het output voorbeeld hieronder:
   - Declareer en initialiseer een variabele diveList van het type ```ArrayList<Dive>```
   - Print de titel
   - Declareer en initialiseer een variabele myCertification van het type Certification en stel dat in op een van de niveaus naar eigen keuze (OWD, AOWD of DI)
   - Print dit certificaat op het scherm
   - Print de opdracht om de gegevens in te voeren
   - Vraag de gebruiker de datum van de duik (dd/mm/yyyy), lees deze in en zet om naar een Date object en sla deze op in een variabele
   - Idem voor de locatie van de duik, sla deze op in een String
   - Idem voor de duur van de duik, sla deze op in een int
   - Idem voor de diepte van de duik, sla deze ook op in een int
   - Maak een nieuw object aan van de klasse Dive, met de ingevoerde parameters
   - Voeg deze toe aan diveList
   - Schrijf een boodschap dat de duik ofwel geldig is en toegevoegd, ofwel ongeldig en toegevoegd
   - Vraag de gebruiker om verder te doen, en doe dit nogmaals als de gebruiker de letter "j" intikt. Gebruik hiervoor dus een geschikte herhaling (iteratie)
   - Als de gebruiker iets anders dan "j" intikt, dan overloop je de ArrayList diveList en print je de inhoud van elke duik op het scherm.
5. Test je applicatie grondig uit
6. Zet de aangepaste bestanden Dive.java en Main.java in je repo en commmit en push.



## Voorbeeld output:
```
-- Duik Log --
Certificaat:AOWD
--Invoeren gegevens duik--
Geef datum duik (dd/mm/yyyy): 02/05/2025
Geef locatie duik (bvb Blue Hole): Blue Hole
Geef duur duik in minuten (geheel getal): 54
Geef diepte duik in meter (geheel getal): 25
Duik is geldig toegevoegd.
Wil je verder doen (j/n)? j
--Invoeren gegevens duik--
Geef datum duik (dd/mm/yyyy): 17/03/2025
Geef locatie duik (bvb Blue Hole): SS Thistlegorm, Egypte
Geef duur duik in minuten (geheel getal): 50
Geef diepte duik in meter (geheel getal): 32
Duik is ongeldig, maar toegevoegd.
Wil je verder doen (j/n)? n
Duik: datum=2025-05-02, locatie='Blue Hole', diepte=25m, duur=54min, geldig
Duik: datum=2025-03-17, locatie='SS Thistlegorm, Egypte', diepte=32m, duur=50min, ongeldig
```

## Tips

### 1. Inlezen uit toetsenbord

Gebruik hiervoor de ```Scanner``` klasse.

Voorbeeld:

```java
Scanner sc = new Scanner(System.in);
System.out.printf("Voer je naam in: ");
String naam = sc.nextLine();
```

### 2. Omzetten String naar LocalDate
Parsen van een tekst met een datum doe je met behulp van een ```DateTimeFormatter``` en een ```LocalDate``` klasse.

Voorbeeld:
```java
String dateString = "02/05/2025";
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate diveDate = LocalDate.parse(dateString, formatter);
```

### 3. Omzetten String naar int
Parsen van een string met een geheel getal doe je met de ```parseInt``` methode van de ```Integer``` klasse.

Voorbeeld:

```java
String numberString = "10";
int number = Integer.parseInt(numberString);
```
