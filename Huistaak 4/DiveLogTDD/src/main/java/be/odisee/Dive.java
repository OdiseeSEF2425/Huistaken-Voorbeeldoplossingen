package be.odisee;

import java.time.LocalDate;

/**
 * Klasse die een duik modelleert
 */
public class Dive {
    private Diver diver;
    private LocalDate date;
    private int depth;
    private int duration;
    private Location location;
    private  Boolean valid;

    /**
     * Constructor voor klasse Dive
     * @param diver de duiker
     * @param date datum waarop de duik plaats gevonden heeft
     * @param depth maximale diepte van de duik in meter
     * @param duration duur van de duik in minuten
     * @param location locatie van de duik
     */
    public Dive(Diver diver, LocalDate date, int depth, int duration, Location location) {
        this.diver = diver;
        this.date = date;
        this.depth = depth;
        this.duration = duration;
        this.location = location;
        this.valid = true;
    }

    /**
     * Constructor voor Dive zonder parameters
     */
    public Dive()
    {

    }

    /**
     * Getter voor diver
     * @return diver
     */
    public Diver getDiver() {
        return diver;
    }

    /**
     * Setter voor diver
     * @param diver
     */
    public void setDiver(Diver diver) {
        this.diver = diver;
    }

    /**
     * Getter voor date
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Setter voor date
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Getter voor depth
     * @return depth
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Setter voor depth
     * @param depth
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * Getter voor duration
     * @return duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Setter voor duration
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Getter voor location
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Setter voor location
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Getter voor valid
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * Setter voor valid
     * @param valid
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

}
