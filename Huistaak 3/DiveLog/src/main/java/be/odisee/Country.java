package be.odisee;

/**
 * Klasse die een land modelleert
 */
public class Country {
    private String name;

    /**
     * Constructor
     * @param name
     */
    public Country(String name) {
        this.name = name;
    }

    /**
     * Getter voor name
     * @return name
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
