package be.odisee;

import java.time.LocalDate;

/**
 * Klasse verantwoordelijk voor validatie duik via volgende requirements:
 * REQ-0027 De duik is ongeldig als de gekozen datum in de toekomst ligt
 * REQ-0028 De duik is ongeldig als de duur langer is dan 60 min
 * REQ-0029 De duik is ongeldig als de maximale diepte groter is dan 18m en het hoogste certificaat OWD is
 * REQ-0030 De duik is ongeldig als de maimale diepte groter is dan 30m en het hoogste certificaat AOWD of DI is
 */
public class DiveValidator {

    /**
     * Validatie datum duik
     * REQ-0027 De duik is ongeldig als de gekozen datum in de toekomst ligt
     *
     * @param dive
     * @return
     */
    public static Boolean validateDiveDate(Dive dive) {
        if (dive.getDate().isEqual(LocalDate.now())){
            return true;
        }
        if (dive.getDate().isBefore(LocalDate.now())){
            return true;
        }
        return false;
    }

    /**
     * Validatie duur duik
     * REQ-0028 De duik is ongeldig als de duur langer is dan 60 min
     *
     * @param dive
     * @return Boolean
     */
    public static Boolean validateDiveDuration(Dive dive) {
        if (dive.getDuration() > 60){
            return false;
        }
        return true;
    }

    /**
     * Validatie diepte duik
     * REQ-0029 De duik is ongeldig als de maximale diepte groter is dan 18m en het hoogste certificaat OWD is
     * REQ-0030 De duik is ongeldig als de maimale diepte groter is dan 30m en het hoogste certificaat AOWD of DI is
     *
     * @param dive
     * @return Boolean
     */
    public static Boolean validateDiveDepth(Dive dive) {
        CertificationLevel maxLevel = dive.getDiver().getCertificationManager().getHighestCertificationLevel();
        if (dive.getDepth() > 18 && maxLevel == CertificationLevel.OWD){
            return false;
        }
        if (dive.getDepth() > 30 && maxLevel == CertificationLevel.AOWD){
            return false;
        }
        if (dive.getDepth() > 30 && maxLevel == CertificationLevel.DI){
            return false;
        }
        return true;
    }

}
