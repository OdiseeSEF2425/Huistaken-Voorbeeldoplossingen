package be.odisee;

/**
 * Klasse die een duiklocatie modelleert
 */
public class Location {
    private String name;
    private  Country country;

    /**
     * Constructor
     * @param name
     * @param country
     */
    public Location(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    /**
     * Getter voor country
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Setter voor country
     * @param country
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * Getter voor name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter voor name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
