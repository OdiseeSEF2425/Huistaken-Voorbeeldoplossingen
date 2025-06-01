package be.odisee;

import java.time.LocalDate;

/**
 * Klasse die een duikcertificatie modelleert
 * Elke certificatie heeft een datum waarop deze behaald is en een certification level of niveau (OWD, AOWD of DI)
 */
public class Certification {

    private CertificationLevel certificationLevel;
    private LocalDate  date;

    /**
     * Getter voor certification level
     * @return niveau certificatie
     */
    public CertificationLevel getCertificationLevel() {
        return certificationLevel;
    }

    /**
     * Setter voor certification level
     * @param certificationLevel niveau certificatie
     */
    public void setCertificationLevel(CertificationLevel certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    /**
     * Getter voor datum
     * @return datum certificatie
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Setter voor datum
     * @param date datum certificatie
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Constructor voor Certification
     * @param certificationLevel niveau certificatioe
     * @param date datu m certificatie
     */
    public Certification(CertificationLevel certificationLevel, LocalDate date) {
        this.certificationLevel = certificationLevel;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Certification{" +
                "certificationLevel=" + certificationLevel +
                ", date=" + date +
                '}';
    }
}
