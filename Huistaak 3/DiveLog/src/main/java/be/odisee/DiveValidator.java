package be.odisee;

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
        return false;
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
        return false;
    }

}
