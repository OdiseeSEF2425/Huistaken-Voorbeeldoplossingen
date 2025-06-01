package be.odisee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Klasse die een duiker modelleert
 * tevens de gebruiker van de applicatie
 */
public class Diver {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate dateOfBirth;

    public CertificationManager getCertificationManager() {
        return certificationManager;
    }

    private CertificationManager certificationManager;

    /**
     * Constructor voor Diver
     *
     * @param firstName
     * @param lastName
     * @param email
     * @param password
     * @param dateOfBirth
     */
    public Diver(String firstName, String lastName, String email, String password, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.certificationManager = new CertificationManager();
    }

    /**
     * Getter voor firstname
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter voor firstName
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter voor lastName
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter voor lastName
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter voor email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter voor email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter voor password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter voor password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter voor dateOfBirth
     *
     * @return dateOfBirth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter voor dateOfBirth
     *
     * @param dateOfBirth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }




}

