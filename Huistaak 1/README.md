# Huistaak1 - Requirements opstellen

## Case: Duikschool

### Beschrijving
Je maakt een applicatie voor een duikschool waar de leden de duiken die ze gedaan hebben kunnen loggen.
De duikers zijn in het bezit van één of meer certificaten, afhankelijk van hun niveau.

De certificaten zijn de volgende:
- Open Water Diver (OWD), waarmee men tot maximaal 18m diep mag duiken
- Advanced Open Water Diver (AOWD) waarmee men tot maximaal 30m diep mag duiken
- Dive Instructor (DI) waarmee men les mag geven aan andere duikers

Elk certificaat is behaald op een bepaalde datum, de geldigheid in tijd is niet beperkt.

Om AOWD te behalen moet men reeds OWD behaald hebben.
Om DI te behalen moet men reeds AOWD behaald hebben.
Om te duiken moet je minimum 16 jaar zijn.

Duikers kunnen zich registeren in de applicatie met email, wachtwoord, voornaam, naam en geboortedatum.
Ze kunnen ook 1 of meer certificaten aanduiden.

Na registratie kunnen duikers zich aanmelden met email & wachtwoord.

Ingelogde duikers kunnen duiken loggen.
Om een duik te loggen moet:
- een datum gekozen worden in het verleden
- een locatie gekozen worden
- de maximaal gedoken diepte in m ingevuld worden
- de duur in minuten ingevuld worden

Een locatie heeft een naam (bvb Blue Hole, Dahab) en een land, gekend in de databank (bvb Egypte).
Als de maximaal gedoken diepte groter is dan deze toegelaten door het hoogste certificaat dan is de duik ongeldig.
Als de duur langer is dan 60min, dan is de duik ook ongeldig.
In alle andere gevallen is de duik geldig.
Alle duiken, zowel geldig als ongeldig worden opgeslagen in een databank.

### Business proces:

Zie de PDF meegeleverd in deze repo.

- ACT-010: Keuze registratie of login
- ACT-020: Registratie: gebruiker vult formulier in 
  - email, wachtwoord, voornaam, naam, geboortedatum
  - 1 of meer certificaten in met niveau en datum behaald
- ACT-030: Validatie registratie
  - Systeem controleert op geldigheid email, minimum leeftijd en certificaten
- ACT-040: Opslaan account
- ACT-050: Gebruiker voert email & wachtwoord in om in te loggen
- ACT-060: Validatie logingegevens
- ACT-070: Gegevens duik invoeren
  - Keuze datum, locatie
  - Invullen diepte en duur
- ACT-080: Invoer duik valideren
  - Zie tekst voor regels geldige duik
- ACT-090: Duik als ongeldig markeren (als voorgaande regels geschonden zijn)
- ACT-100: Duik opslaan
  - Zowel geldige als ongeldige duiken worden bewaard


### Opdracht
1. Voeg aan deze repo een markdown bestand requirements.md toe.
2. Schrijf Input-, Processing-, Output-requirements per activiteit. Nummer de requirements. Zorg dat duidelijk is bij welke activiteit(en) een requirement hoort.
3. Zet je requirements in requirements.md
4. Commit en push je oplossing via github desktop.
