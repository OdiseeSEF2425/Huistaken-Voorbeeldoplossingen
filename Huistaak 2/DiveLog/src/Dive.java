import java.time.LocalDate;

public class Dive {
    private LocalDate date;
    private String location;
    private int depth; // in meters
    private int duration; // in minutes
    private Certification certification;

    // Constructor
    public Dive(LocalDate date, String location, int depth, int duration, Certification certification) {
        this.date = date;
        this.location = location;
        this.depth = depth;
        this.duration = duration;
        this.certification = certification;
    }

    // Getters
    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int getDepth() {
        return depth;
    }

    public int getDuration() {
        return duration;
    }

    public Certification getCertification() {
        return certification;
    }

    // Optioneel: toString() voor mooie weergave
    @Override
    public String toString() {
        return "Duik:" +
                "datum=" + date +
                ", locatie='" + location + '\'' +
                ", diepte=" + depth + "m" +
                ", duur=" + duration + "min" +
                ", " + (isValid() ? "geldig" : "ongeldig");
    }

    public Boolean isValid() {
        Boolean valid = true;
        if (duration > 60) {
            valid = false;
        }
        if (this.certification == Certification.OWD && depth > 18) {
            valid = false;
        }
        if ((this.certification == Certification.AOWD || this.certification == Certification.DI) && depth > 30) {
            valid = false;
        }
        return valid;
    }
}
