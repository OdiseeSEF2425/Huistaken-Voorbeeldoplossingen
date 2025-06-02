package be.odisee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DiveValidatorTest {

    Diver john;
    Dive sampleDive;

    @BeforeEach
    public void setup() {
        // Arrange
        john = new Diver("John", "Doe", "john.doe@gmail.com", "abc123", LocalDate.of(1980, 1, 1));
        john.getCertificationManager().addCertification(new Certification(CertificationLevel.OWD, LocalDate.of(2020, 1, 1)));

        Country egypt = new Country("Egypt");
        Location blueHole = new Location("Blue Hole", egypt);

        sampleDive = new Dive(john, LocalDate.of(2023, 10, 11), 18, 50, blueHole);
    }

    @Test
    /**
     * REQ-0026 Standaard is de duik geldig
     */
    public void dive_default_valid_returns_true() {
        // Act
        boolean isValid = sampleDive.getValid();

        //Assert
        assertTrue(isValid);
    }

    /**
     * Gegeven een datum in het verleden, dan moet de duik geldig blijven
     * REQ-0027 De duik is ongeldig als de gekozen datum in de toekomst ligt
     */
    @Test
    public void dive_date_past_valid_returns_true() {

        // Act
        boolean isValid = DiveValidator.validateDiveDate(sampleDive);

        // Assert
        assertTrue(isValid);
    }

    /**
     * Gegeven een datum in het heden, dan is de duik geldig
     * REQ-0027 De duik is ongeldig als de gekozen datum in de toekomst ligt
     */
    @Test
    public void dive_date_present_valid_returns_true() {

        // Arrange
        sampleDive.setDate(LocalDate.now());

        // Act
        boolean isValid = DiveValidator.validateDiveDate(sampleDive);

        // Assert
        assertTrue(isValid);
    }

    /**
     * Gegeven een datum in de toekomst, dan is de duik ongeldig
     * REQ-0027 De duik is ongeldig als de gekozen datum in de toekomst ligt
     */
    @Test
    public void dive_date_future_valid_returns_false() {

        // Arrange
        sampleDive.setDate(LocalDate.now().plusDays(1));

        // Act
        boolean isValid = DiveValidator.validateDiveDate(sampleDive);

        // Assert
        assertFalse(isValid);
    }


    /**
     * Gegeven een duur van minder dan 60min, dan blijft de duik geldig
     * REQ-0028 De duik is ongeldig als de duur langer is dan 60 min
     */
    @Test
    public void dive_duration_lessthan60_valid_returns_true() {
        // Arrange
        sampleDive.setDuration(59);

        // Act
        boolean isValid = DiveValidator.validateDiveDuration(sampleDive);

        // Assert
        assertTrue(isValid);
    }

    /**
     * Gegeven een duur van minder dan 60min, dan blijft de duik geldig
     * REQ-0028 De duik is ongeldig als de duur langer is dan 60 min
     */
    @Test
    public void dive_duration_morethan60_valid_returns_true() {
        // Arrange
        sampleDive.setDuration(61);

        // Act
        boolean isValid = DiveValidator.validateDiveDuration(sampleDive);

        // Assert
        assertFalse(isValid);
    }

    /**
     * Als de duik minder is dan 18m is de duik geldig, ongeacht certificaat
     * REQ-0029 De duik is ongeldig als de maximale diepte groter is dan 18m en het hoogste certificaat OWD is
     */
    @Test
    public void dive_depth_lessthan18m_valid_returns_true() {

        //Arrange
        sampleDive.setDepth(17);

        //Act
        boolean isValid = DiveValidator.validateDiveDepth(sampleDive);

        //Assert
        assertTrue(isValid);
    }


    /**
     * Als de duik dieper is dan 18m en hoogste certificaat is OWD, dan is de duik ongeldig
     * REQ-0029 De duik is ongeldig als de maximale diepte groter is dan 18m en het hoogste certificaat OWD is
     */
    @Test
    public void dive_depth_morethan18m_certOWD_valid_returns_false() {

        //Arrange
        sampleDive.setDepth(19);

        //Act
        boolean isValid = DiveValidator.validateDiveDepth(sampleDive);

        //Assert
        assertFalse(isValid);
    }

    /**
     * Als de duik dieper is dan 30m en hoogste certificaat is AOWD, dan is de duik ongeldig
     * REQ-0029 De duik is ongeldig als de maximale diepte groter is dan 18m en het hoogste certificaat OWD is
     */
    @Test
    public void dive_depth_morethan30m_certAOWD_valid_returns_false() {

        //Arrange - certificatie AOWD toevoegen
        john.getCertificationManager().addCertification(new Certification(CertificationLevel.AOWD, LocalDate.of(2021, 1, 1)));
        sampleDive.setDiver(john);
        sampleDive.setDepth(31);

        //Act
        boolean isValid = DiveValidator.validateDiveDepth(sampleDive);

        //Assert
        assertFalse(isValid);
    }

    /**
     * Als de duik dieper is dan 30m en hoogste certificaat is DI, dan is de duik ongeldig
     * REQ-0029 De duik is ongeldig als de maximale diepte groter is dan 18m en het hoogste certificaat OWD is
     */
    @Test
    public void dive_depth_morethan30m_certDI_valid_returns_false() {

        //Arrange - certificatie AOWD toevoegen
        john.getCertificationManager().addCertification(new Certification(CertificationLevel.AOWD, LocalDate.of(2021, 1, 1)));
        john.getCertificationManager().addCertification(new Certification(CertificationLevel.DI, LocalDate.of(2022, 1, 1)));
        sampleDive.setDiver(john);
        sampleDive.setDepth(31);

        //Act
        boolean isValid = DiveValidator.validateDiveDepth(sampleDive);

        //Assert
        assertFalse(isValid);
    }
}