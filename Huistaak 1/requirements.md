# Huistaak 1 - Requirements duikschool

## ACT-010 Keuze registratie of login
- (I) -
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
- (O) REQ-XXX 

ACT-070
(I) REQ-XXX 
(P) REQ-XXX 
(O) REQ-XXX 
