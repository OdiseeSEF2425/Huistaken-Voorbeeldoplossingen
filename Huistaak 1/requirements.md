# Huistaak 1 - Requirements duikschool

## ACT-010 Keuze registratie of login
- (P) De gebruiker maakt een keuze voor registreren of inloggen
- (O) REQ-XXX Het is gekend of de gebruiker wil registreren of inloggen

## ACT-020 Registratie
- (I) REQ-XXX Het is gekend dat de gebruiker wil registreren
- (I) REQ-XXX De mogelijke certificaten zijn gekend, nl OWD, AOWD en DI
- (P) REQ-XXX De gebruiker ziet welke certificaten kunnen gekozen worden
- (O) REQ-XXX Het is gekend welke gegevens de gebruiker ingevuld heeft

## ACT-030 Validatie registratie
- (I) REQ-XXX Het is gekend welk email, wachtwoord, voornaam, achternaam, geboortedatum de gebruiker ingevuld heeft
- (I) REQ-XXX De mogelijke certificaten zijn gekend, nl OWD, AOWD en DI
- (I) REQ-XXX Het is gekend hoeveel en welke certificaten de gebruiker ingevuld heeft
- (P) REQ-XXX Voor een geldige registratie moet de gebruiker minimum 16 jaar zijn
- (P) REQ-XXX Voor een geldige registratie moet de gebruiker minimum 1 en maximum 3 geldige certificaten ingevuld hebben
- (P) REQ-XXX Voor een geldig certificaat moet voor dat certificaat een datum in het verleden ingevuld zijn
- (P) REQ-XXX Voor een geldig AOWD certificaat moet de gebruiker ook een OWD certificaat ingevuld hebben, waarvan de datum vroeger ligt dan het AOWD certificaat
- (P) REQ-XXX Voor een geldig DI certificaat moet de gebruiker ook een AOWD certificaat ingevuld hebben, waarvan de datum vroeger ligt dan het DI certificaat
- (O) REQ-XXX Het is gekend of de registratie geldig is of niet

## ACT-040 Opslaan nieuwe account
- (I) REQ-XXX De gebruiker heeft geldige registratiegegevens ingevuld
- (P) REQ-XXX Het systeem bewaart de registratiegegevens
- (O) REQ-XXX De registratiegegevens van de gebruiker zijn bekend


## ACT-050 Inloggen
- (I) REQ-XXX Combinaties emails & wachtwoorden zijn bekend
- (P) REQ-XXX De gebruiker vult email & wachtwoord in
- (O) REQ-XXX De combinatie email & wachtwoord voor de gebruiker is gekend


## ACT-060 Validatie login
- (I) REQ-XXX Correcte e-mail & wachtwoord combinaties zijn gekend
- (P) REQ-XXX Het systeem controleert of de combinatie van email & wachtwoord geldig is
- (O) REQ-XXX Het is bekend of de login succesvol was
- (O) REQ-XXX Indien de login succesvol is, is het bekend welke gebruiker ingelogd is

## ACT-070 Gegevens duik invoeren
- (I) REQ-XXX Het is gekend in welke landen de duiklocaties gelegen zijn
- (I) REQ-XXX De duiklocaties zijn gekend
- (P) REQ-XXX De gebruiker kiest locatie, kiest datum, vult duur en maximale diepte in
- (O) REQ-XXX De gegevens van de duik zijn bekend

## ACT-080 Invoer duik valideren
- (I) REQ-XXX De gegevens van de duik zijn bekend
- (I) REQ-XXX Het is bekend welke certificaten de gebruiker heeft
- (P) REQ-XXX Standaard is de duik geldig
- (P) REQ-XXX De duik is ongeldig als de gekozen datum in de toekomst ligt
- (P) REQ-XXX De duik is ongeldig als de duur langer is dan 60 min
- (P) REQ-XXX De duik is ongeldig als de maximale diepte groter is dan 18m en het hoogste certificaat OWD is
- (P) REQ-XXX De duik is ongeldig als de maimale diepte groter is dan 30m en het hoogste certificaat AOWD of DI is
- (O) REQ-XXX De geldigheid van de duik is gekend

### ACT-090 Duik als ongeldig markeren
- (I) REQ-XXX De geldigheid van de duik is gekend
- (P) REQ-XXX De duik wordt als ongeldig gemarkeerd
- (O) REQ-XXX de gegevens van de duik inclusief de geldigheid zijn gekend

### ACT-100 Duik opslaan
- (I) REQ-XXX de gegevens van de duik inclusief de geldigheid zijn gekend
- (P) REQ-XXX De duik wordt bewaard

