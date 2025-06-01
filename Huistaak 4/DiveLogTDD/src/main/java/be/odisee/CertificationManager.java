package be.odisee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CertificationManager {
    private ArrayList<Certification> certifications;

    public CertificationManager() {
        this.certifications = new ArrayList<>();
    }

    /**
     * Methode om certification toe te voegen
     *
     * @param certification
     */
    public void addCertification(Certification certification) {
        this.certifications.add(certification);
    }

    /**
     * Methode om certication te verwijderen
     */
    public void removeCertification(Certification certification) {
        this.certifications.remove(certification);
    }

    public CertificationLevel getHighestCertificationLevel() {
        Collections.sort(this.certifications, Comparator.comparing(Certification::getCertificationLevel));
        return this.certifications.getLast().getCertificationLevel();
    }
}
