# Huistaak 1 - Requirements duikschool

Opgelet: sommige requirements horen bij 1 of meer activiteiten en komen dus meerdere keren voor.

## ACT-010 Keuze registratie of login
- (P) **REQ-0001** De gebruiker maakt een keuze voor registreren of inloggen
- (O) **REQ-0002** Het is gekend of de gebruiker wil registreren of inloggen

## ACT-020 Registratie
- (I) **REQ-0003** Het is gekend dat de gebruiker wil registreren
- (I) **REQ-0004** De mogelijke certificaten zijn gekend, nl OWD, AOWD en DI
- (P) **REQ-0005** De gebruiker ziet welke certificaten kunnen gekozen worden
- (O) **REQ-0006** Het is gekend welk email, wachtwoord, voornaam, achternaam en geboortedatum de gebruiker ingevuld heeft
- (O) **REQ-0007** Het is gekend hoeveel en welke certificaten de gebruiker ingevuld heeft

## ACT-030 Validatie registratie
- (I) **REQ-0004** De mogelijke certificaten zijn gekend, nl OWD, AOWD en DI
- (I) **REQ-0006** Het is gekend welk email, wachtwoord, voornaam, achternaam en geboortedatum de gebruiker ingevuld heeft
- (I) **REQ-0007** Het is gekend hoeveel en welke certificaten de gebruiker ingevuld heeft
- (P) **REQ-0008** Voor een geldige registratie moet de gebruiker minimum 16 jaar zijn
- (P) **REQ-0009** Voor een geldige registratie moet de gebruiker minimum 1 en maximum 3 geldige certificaten ingevuld hebben
- (P) **REQ-0010** Voor een geldig certificaat moet voor dat certificaat een datum in het verleden ingevuld zijn
- (P) **REQ-0011** Voor een geldig AOWD certificaat moet de gebruiker ook een OWD certificaat ingevuld hebben, waarvan de datum vroeger ligt dan het AOWD certificaat
- (P) **REQ-0012** Voor een geldig DI certificaat moet de gebruiker ook een AOWD certificaat ingevuld hebben, waarvan de datum vroeger ligt dan het DI certificaat
- (O) **REQ-0013** Het is gekend of de registratie geldig is of niet

## ACT-040 Opslaan nieuwe account
- (I) **REQ-0013** Het is gekend of de registratie geldig is of niet
- (I) **REQ-0006** Het is gekend welk email, wachtwoord, voornaam, achternaam en geboortedatum de gebruiker ingevuld heeft
- (I) **REQ-0007** Het is gekend hoeveel en welke certificaten de gebruiker ingevuld heeft
- (P) **REQ-0014** Het systeem bewaart de registratiegegevens
- (O) **REQ-0015** De registratiegegevens van de gebruiker zijn bekend


## ACT-050 Inloggen
- (I) **REQ-0016** Combinaties emails & wachtwoorden zijn bekend
- (P) **REQ-0017** De gebruiker vult email & wachtwoord in
- (O) **REQ-0018** De combinatie email & wachtwoord voor de gebruiker is gekend


## ACT-060 Validatie login
- (I) **REQ-0016** Combinaties emails & wachtwoorden zijn bekend
- (P) **REQ-0019** De combinatie van ingevuld email & wachtwoord is geldig
- (O) **REQ-0020** Het is bekend of de login succesvol was
- (O) **REQ-0021** Indien de login succesvol is, is het bekend welke gebruiker ingelogd is

## ACT-070 Gegevens duik invoeren
- (I) **REQ-0022** Het is gekend in welke landen de duiklocaties gelegen zijn
- (I) **REQ-0023** De duiklocaties zijn gekend
- (P) **REQ-0024** De gebruiker kiest locatie, kiest datum, vult duur en maximale diepte in
- (O) **REQ-0025** De gegevens van de duik zijn bekend

## ACT-080 Invoer duik valideren
- (I) **REQ-0025** De gegevens van de duik zijn bekend
- (I) **REQ-0007** Het is gekend hoeveel en welke certificaten de gebruiker ingevuld heeft
- (P) **REQ-0026** Standaard is de duik geldig
- (P) **REQ-0027** De duik is ongeldig als de gekozen datum in de toekomst ligt
- (P) **REQ-0028** De duik is ongeldig als de duur langer is dan 60 min
- (P) **REQ-0029** De duik is ongeldig als de maximale diepte groter is dan 18m en het hoogste certificaat OWD is
- (P) **REQ-0030** De duik is ongeldig als de maimale diepte groter is dan 30m en het hoogste certificaat AOWD of DI is
- (O) **REQ-0031** De geldigheid van de duik is gekend

## ACT-090 Duik als ongeldig markeren
- (I) **REQ-0031** De geldigheid van de duik is gekend
- (P) **REQ-0032** De duik wordt als ongeldig gemarkeerd
- (O) **REQ-0025** De gegevens van de duik zijn bekend
- (O) **REQ-0031** De geldigheid van de duik is gekend

## ACT-100 Duik opslaan
- (I) **REQ-0031** De geldigheid van de duik is gekend
- (I) **REQ-0025** De gegevens van de duik zijn bekend
- (P) **REQ-0033** De duik wordt bewaard

